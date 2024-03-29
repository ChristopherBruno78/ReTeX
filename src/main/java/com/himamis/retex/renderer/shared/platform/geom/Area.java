package com.himamis.retex.renderer.shared.platform.geom;

public interface Area extends Shape {

  void add(Area abody);

  Area duplicate();

  void scale(double x);

  void translate(double d, double e);
}
