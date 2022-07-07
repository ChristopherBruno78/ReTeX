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
package com.himamis.retex.renderer.share.platform.graphics;

public interface Transform {

  double getTranslateX();

  double getTranslateY();

  double getScaleX();

  double getScaleY();

  double getShearX();

  double getShearY();

  Transform createClone();

  void scale(double sx, double sy);

  void translate(double tx, double ty);

  void shear(double sx, double sy);
}