package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandUnderSet extends Command2A {

  @Override
  public Atom newI(TeXParser tp, Atom a, Atom b) {
    final Atom at = new UnderOverAtom(b, a, new TeXLength(Unit.MU, 0.2), true, false);
    return at.changeType(TeXConstants.TYPE_RELATION);
  }
}
