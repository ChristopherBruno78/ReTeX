package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.FractionAtom;
import com.himamis.retex.renderer.shared.TeXLength;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandAbovewithdelims extends CommandOverwithdelims {

  TeXLength l;

  @Override
  public void add(TeXParser tp, Atom a) {
    if (left == null) {
      left = a;
    } else if (right == null) {
      right = a;
      l = tp.getArgAsLength();
    } else {
      den.add(a);
    }
  }

  @Override
  public Atom newI(TeXParser tp, Atom num, Atom den) {
    return new FractionAtom(num, den, l);
  }
}
