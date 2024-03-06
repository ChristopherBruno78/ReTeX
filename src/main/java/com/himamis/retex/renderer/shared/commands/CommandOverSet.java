package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.*;

public class CommandOverSet extends Command2A {

  @Override
  public Atom newI(TeXParser tp, Atom a, Atom b) {
    final Atom at = new UnderOverAtom(b, a, new TeXLength(Unit.MU, 2.5), true, true);
    return at.changeType(TeXConstants.TYPE_RELATION);
  }
}
