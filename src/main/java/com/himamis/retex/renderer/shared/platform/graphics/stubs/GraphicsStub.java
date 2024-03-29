package com.himamis.retex.renderer.shared.platform.graphics.stubs;

import com.himamis.retex.renderer.shared.platform.font.Font;
import com.himamis.retex.renderer.shared.platform.font.FontRenderContext;
import com.himamis.retex.renderer.shared.platform.geom.Line2D;
import com.himamis.retex.renderer.shared.platform.geom.Rectangle2D;
import com.himamis.retex.renderer.shared.platform.geom.RoundRectangle2D;
import com.himamis.retex.renderer.shared.platform.geom.Shape;
import com.himamis.retex.renderer.shared.platform.graphics.*;

import java.util.ArrayList;
import java.util.List;

public class GraphicsStub implements Graphics2DInterface {

  private Stroke stroke;
  private Color color;
  private Font font;
  private List<AffineTransform> transformList = new ArrayList<AffineTransform>();
  private AffineTransform currentTransform;

  public GraphicsStub() {
    transformList = new ArrayList<AffineTransform>();
    reset();
  }

  public void reset() {
    transformList.clear();
    currentTransform = new AffineTransform();
    font = new FontStub();
    color = new ColorStub();
    stroke = new StrokeStub();
  }

  @Override
  public void setStroke(Stroke stroke) {
    this.stroke = stroke;
  }

  @Override
  public Stroke getStroke() {
    return stroke;
  }

  @Override
  public void setColor(Color color) {
    this.color = color;
  }

  @Override
  public Color getColor() {
    return color;
  }

  @Override
  public Transform getTransform() {
    return currentTransform;
  }

  @Override
  public void saveTransformation() {
    transformList.add((AffineTransform) currentTransform.createClone());
  }

  @Override
  public void restoreTransformation() {
    if (transformList.size() > 0) {
      currentTransform = transformList.remove(transformList.size() - 1);
    }
  }

  @Override
  public Font getFont() {
    return font;
  }

  @Override
  public void setFont(Font font) {
    this.font = font;
  }

  @Override
  public void fillRect(double x, double y, double width, double height) {
    // stub
  }

  @Override
  public void fill(Shape rectangle) {
    // stub
  }

  @Override
  public void startDrawing() {
    // stub
  }

  @Override
  public void moveTo(double x, double y) {
    // stub
  }

  @Override
  public void lineTo(double x, double y) {
    // stub
  }

  @Override
  public void quadraticCurveTo(double x, double y, double x1, double y1) {
    // stub
  }

  @Override
  public void bezierCurveTo(double x, double y, double x1, double y1, double x2, double y2) {
    // stub
  }

  @Override
  public void finishDrawing() {
    // stub
  }

  @Override
  public void draw(Rectangle2D rectangle) {
    // stub
  }

  @Override
  public void draw(RoundRectangle2D rectangle) {
    // stub
  }

  @Override
  public void draw(Line2D line) {
    // stub
  }

  @Override
  public void drawChars(char[] data, int offset, int length, int x, int y) {
    // stub
  }

  @Override
  public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
    // stub
  }

  @Override
  public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
    // stub
  }

  @Override
  public void translate(double x, double y) {
    currentTransform.translate(x, y);
  }

  @Override
  public void scale(double x, double y) {
    currentTransform.scale(x, y);
  }

  @Override
  public void rotate(double theta, double x, double y) {
    currentTransform.rotate(theta, x, y);
  }

  @Override
  public void rotate(double theta) {
    currentTransform.rotate(theta);
  }

  @Override
  public void drawImage(Image image, int x, int y) {
    // stub
  }

  @Override
  public void drawImage(Image image, Transform transform) {
    // stub
  }

  @Override
  public FontRenderContext getFontRenderContext() {
    // stub
    return null;
  }

  @Override
  public void setRenderingHint(int key, int value) {
    // stub
  }

  @Override
  public int getRenderingHint(int key) {
    // stub
    return 0;
  }

  @Override
  public void dispose() {
    // stub
  }
}
