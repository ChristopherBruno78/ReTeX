package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.RotateAtom;
import com.himamis.retex.renderer.shared.TeXParser;

import java.util.Map;

public class CommandRotateBox extends Command1A {

  double angle;
  Map<String, String> options;

  @Override
  public boolean init(TeXParser tp) {
    options = tp.getOptionAsMap();
    angle = tp.getArgAsDecimal();
    return true;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new RotateAtom(a, angle, options);
  }
}
