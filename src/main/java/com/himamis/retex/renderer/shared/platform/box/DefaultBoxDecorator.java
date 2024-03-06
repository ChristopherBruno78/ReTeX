package com.himamis.retex.renderer.shared.platform.box;

import com.himamis.retex.renderer.shared.Box;

/** Doesn't decorate the box, but simply returns the original one. */
public class DefaultBoxDecorator implements BoxDecorator {

  @Override
  public Box decorate(Box box) {
    return box;
  }
}
