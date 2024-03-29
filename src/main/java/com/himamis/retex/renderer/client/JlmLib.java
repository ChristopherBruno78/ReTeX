/**
 * This file is part of the ReTeX library - https://github.com/himamis/ReTeX
 *
 * <p>Copyright (C) 2015 Balazs Bencze
 *
 * <p>This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License as published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * <p>This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * <p>A copy of the GNU General Public License can be found in the file LICENSE.txt provided with
 * the source distribution of this program (see the META-INF directory in the source jar). This
 * license can also be found on the GNU website at http://www.gnu.org/licenses/gpl.html.
 *
 * <p>If you did not receive a copy of the GNU General Public License along with this program,
 * contact the lead developer, or write to the Free Software Foundation, Inc., 51 Franklin Street,
 * Fifth Floor, Boston, MA 02110-1301, USA.
 *
 * <p>Linking this library statically or dynamically with other modules is making a combined work
 * based on this library. Thus, the terms and conditions of the GNU General Public License cover the
 * whole combination.
 *
 * <p>As a special exception, the copyright holders of this library give you permission to link this
 * library with independent modules to produce an executable, regardless of the license terms of
 * these independent modules, and to copy and distribute the resulting executable under terms of
 * your choice, provided that you also meet, for each linked independent module, the terms and
 * conditions of the license of that module. An independent module is a module which is not derived
 * from or based on this library. If you modify this library, you may extend this exception to your
 * version of the library, but you are not obliged to do so. If you do not wish to do so, delete
 * this exception statement from your version.
 */
package com.himamis.retex.renderer.client;

import com.himamis.retex.renderer.client.graphics.Graphics2DW;
import com.himamis.retex.renderer.client.graphics.JLMContextHelper;
import com.himamis.retex.renderer.shared.Colors;
import com.himamis.retex.renderer.shared.TeXConstants;
import com.himamis.retex.renderer.shared.TeXFormula;
import com.himamis.retex.renderer.shared.TeXIcon;
import com.himamis.retex.renderer.shared.platform.FactoryProvider;
import com.himamis.retex.renderer.shared.platform.graphics.Color;
import com.himamis.retex.renderer.shared.platform.graphics.Insets;
import elemental2.dom.CanvasRenderingContext2D;
import elemental2.dom.DomGlobal;

public class JlmLib {

  static {
    if (FactoryProvider.getInstance() == null) {
      FactoryProvider.setInstance(new FactoryProviderGWT());
    }
  }

  public JlmReturnValue drawLatex(
      final CanvasRenderingContext2D ctx,
      final TeXFormula formula,
      final int x,
      final int y,
      final double size,
      final String fgColorString,
      final String bgColorString) {
    TeXIcon icon = createIcon(formula, size, 0, new Insets(0, 0, 0, 0));
    return draw(icon, ctx, x, y, fgColorString, bgColorString, null);
  }

  public JlmReturnValue drawLatex(
      final CanvasRenderingContext2D ctx,
      final TeXFormula formula,
      final double size,
      final int type,
      final int x,
      final int y,
      final int topInset,
      final int leftInset,
      final int bottomInset,
      final int rightInset,
      final String fgColorString,
      final String bgColorString,
      final DrawingFinishedCallback callback) {

    // create icon and graphics objects
    TeXIcon icon =
        createIcon(formula, size, type, new Insets(topInset, leftInset, bottomInset, rightInset));
    return draw(icon, ctx, x, y, fgColorString, bgColorString, callback);
  }

  public JlmReturnValue drawLatex(
      CanvasRenderingContext2D ctx,
      TeXFormula formula,
      String fgColorString,
      String bgColorString,
      int x,
      int y,
      int width,
      int height) {
    double size = 40.0;
    TeXIcon icon = createIcon(formula, size, 0, new Insets(0, 0, 0, 0));

    double xWidth = icon.getIconWidth() + 2.0;
    double xHeight = icon.getIconHeight() + 2.0;
    double scale = Math.min(width / xWidth, height / xHeight);
    return drawLatex(
        ctx, formula, scale * size, 0, x, y, 0, 0, 0, 0, fgColorString, bgColorString, null);
  }

  public static double getPixelRatio() {
    return DomGlobal.window.devicePixelRatio;
  }

  public static JlmReturnValue draw(
      TeXIcon icon,
      CanvasRenderingContext2D ctx,
      final int x,
      final int y,
      final String fgColorString,
      final String bgColorString,
      final DrawingFinishedCallback callback) {
    return draw(
        icon, ctx, x, y, decode(fgColorString), decode(bgColorString), callback, getPixelRatio());
  }

  public static Color decode(String color) {
    return color == null ? null : Colors.decode(color);
  }

  public static JlmReturnValue draw(
      TeXIcon icon,
      CanvasRenderingContext2D ctx,
      final double x,
      final double y,
      final Color fgColor,
      final Color bgColor,
      final DrawingFinishedCallback callback,
      double ratio) {
    Graphics2DW g2 = new Graphics2DW(ctx);

    JLMContextHelper.as(ctx).setDevicePixelRatio(ratio);
    if (ratio != 1.0) {
      ctx.scale(ratio, ratio);
    }
    // fill the background color
    if (bgColor != null) {
      g2.setColor(bgColor);
      g2.fillRect(x, y, icon.getIconWidth(), icon.getIconHeight());
    }

    // set the callback
    g2.setDrawingFinishedCallback(callback);

    // paint the icon
    icon.paintIcon(() -> fgColor, g2, x, y);
    g2.maybeNotifyDrawingFinishedCallback(false);

    // return {width, height}
    return createReturnValue(icon, ratio);
  }

  public static TeXIcon createIcon(
      final TeXFormula formula, final double size, final int type, Insets insets) {
    TeXIcon icon =
        formula.new TeXIconBuilder()
            .setStyle(TeXConstants.STYLE_DISPLAY)
            .setType(type)
            .setSize(size)
            .build();
    icon.setInsets(insets);
    return icon;
  }

  private static JlmReturnValue createReturnValue(TeXIcon icon, double ratio) {

    JlmReturnValue returnValue = new JlmReturnValue();
    returnValue.width = icon.getIconWidth();
    returnValue.height = icon.getIconHeight();
    returnValue.baseline = icon.getBaseLine();
    returnValue.pixelRatio = ratio;
    return returnValue;
  }

  /**
   * @param ascii AsciiMath formula
   * @return renderable formula
   */
  protected TeXFormula fromAsciiMath(String ascii) {
    FactoryProvider.debugS("ASCII math input not supported, falling back to LaTeX");
    return new TeXFormula(ascii);
  }
}
