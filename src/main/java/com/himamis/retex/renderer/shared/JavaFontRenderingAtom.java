/* JavaFontRenderingAtom.java
 * =========================================================================
 * This file is part of the JLaTeXMath Library - http://forge.scilab.org/jlatexmath
 *
 * Copyright (C) 2009 DENIZET Calixte
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * A copy of the GNU General Public License can be found in the file
 * LICENSE.txt provided with the source distribution of this program (see
 * the META-INF directory in the source jar). This license can also be
 * found on the GNU website at http://www.gnu.org/licenses/gpl.html.
 *
 * If you did not receive a copy of the GNU General Public License along
 * with this program, contact the lead developer, or write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 *
 * Linking this library statically or dynamically with other modules
 * is making a combined work based on this library. Thus, the terms
 * and conditions of the GNU General Public License cover the whole
 * combination.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce
 * an executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under terms
 * of your choice, provided that you also meet, for each linked independent
 * module, the terms and conditions of the license of that module.
 * An independent module is a module which is not derived from or based
 * on this library. If you modify this library, you may extend this exception
 * to your version of the library, but you are not obliged to do so.
 * If you do not wish to do so, delete this exception statement from your
 * version.
 *
 */

package com.himamis.retex.renderer.shared;

import com.himamis.retex.renderer.shared.platform.FontAdapter;
import com.himamis.retex.renderer.shared.platform.font.Font;

/** The string rendering is made in using Java Graphics2D.drawString. */
public class JavaFontRenderingAtom extends Atom {

  private final String str;
  private final int style;
  private final Font font;

  private static final FontAdapter fontAdapter = new FontAdapter();

  private JavaFontRenderingAtom(final String str, final int style, final Font font) {
    this.str = str;
    this.style = style;
    this.font = font;
  }

  public JavaFontRenderingAtom(final String str, final int style) {
    this(str, style, null);
  }

  public JavaFontRenderingAtom(final String str) {
    this(str, -1, null);
  }

  public JavaFontRenderingAtom(final String str, final Font font) {
    this(str, -1, font);
  }

  @Override
  public Box createBox(TeXEnvironment env) {
    final double factor = TeXFont.getSizeFactor(env.getStyle());
    if (font != null) {
      if (style == -1) {
        final TeXFont dtf = env.getTeXFont();
        int style = dtf.isIt ? Font.ITALIC : Font.PLAIN;
        style = style | (dtf.isBold ? Font.BOLD : 0);
        return new JavaFontRenderingBox(str, style, factor, font, dtf.isRoman).setAtom(this);
      } else {
        return new JavaFontRenderingBox(str, style, factor, font).setAtom(this);
      }
    } else {
      final TeXFont dtf = env.getTeXFont();
      int style = dtf.isIt ? Font.ITALIC : Font.PLAIN;
      style = style | (dtf.isBold ? Font.BOLD : 0);
      Font font;

      final String ss = "SansSerif";
      final String sf = "Serif";
      if (dtf.isSs) {
        font = fontAdapter.createFont(ss, Font.PLAIN, 10);
      } else {
        font = fontAdapter.createFont(sf, Font.PLAIN, 10);
      }
      return new JavaFontRenderingBox(str, style, factor, font, dtf.isRoman).setAtom(this);
    }
  }

  @Override
  public String toString() {
    return "JavaFontRenderingAtom: " + str + ", font=" + font;
  }

  public String getString() {
    return str;
  }
}
