package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandB extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new UnderOverAtom(a, Symbols.BAR, new TeXLength(Unit.MU, 0.1), false, false);
  }
}
