package com.himamis.retex.renderer.client.geom;

import com.himamis.retex.renderer.client.graphics.JLMContext2d;
import com.himamis.retex.renderer.shared.platform.FactoryProvider;
import com.himamis.retex.renderer.shared.platform.geom.Area;
import com.himamis.retex.renderer.shared.platform.geom.Rectangle2D;
import com.himamis.retex.renderer.shared.platform.geom.Shape;

import java.util.ArrayList;

/**
 * Just needs to hold serveal objects eg Arrow + extension (ShapeW + Rectangle2DW) or eg (Arrow +
 * extension + Arrow)
 */
public class AreaW implements Area {

  private final ArrayList<Shape> shapes = new ArrayList<>();

  double scale = 1;

  public AreaW(Shape s) {
    shapes.add(s);
  }

  public AreaW(ArrayList<Shape> s) {
    shapes.addAll(s);
  }

  public AreaW() {
    //
  }

  @Override
  public Rectangle2D getBounds2DX() {

    double minX = Double.MAX_VALUE;
    double minY = Double.MAX_VALUE;
    double maxX = -Double.MAX_VALUE;
    double maxY = -Double.MAX_VALUE;

    int n = shapes.size();
    for (int i = 0; i < n; i++) {
      Shape shape = shapes.get(i);
      Rectangle2D bounds = shape.getBounds2DX();

      minX = Math.min(minX, bounds.getX());
      minY = Math.min(minY, bounds.getY());
      maxX = Math.max(maxX, bounds.getX() + bounds.getWidth());
      maxY = Math.max(maxY, bounds.getY() + bounds.getHeight());
    }

    return new Rectangle2DW(
        minX * scale, minY * scale, (maxX - minX) * scale, (maxY - minY) * scale);
  }

  @Override
  public void add(Area a) {
    shapes.addAll(((AreaW) a).getShapes());
  }

  @Override
  public Area duplicate() {
    return new AreaW(shapes);
  }

  public void fill(JLMContext2d ctx) {

    if (scale != 1) {
      ctx.saveTransform();
      ctx.scale2(scale, scale);
    }

    int n = shapes.size();
    for (int i = 0; i < n; i++) {
      ctx.fill(shapes.get(i));
    }

    if (scale != 1) {
      ctx.restoreTransform();
    }
  }

  public ArrayList<Shape> getShapes() {
    return shapes;
  }

  /** not needed in web */
  @Override
  public void scale(double x) {
    scale *= x;
  }

  @Override
  public void translate(double x, double y) {
    if (scale != 1) {
      FactoryProvider.getInstance()
          .debug(
              "warning: AreaW.translate not implemented when scale != 1"
                  + scale
                  + " "
                  + x
                  + " "
                  + y);
    }
    int n = shapes.size();
    for (int i = 0; i < n; i++) {
      Shape shape = shapes.get(i);
      if (shape instanceof ShapeW) {
        ((ShapeW) shape).translate(x, y);
      } else if (shape instanceof Rectangle2DW) {
        ((Rectangle2DW) shape).translate(x, y);
      }
    }
  }
}
