package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandPreScript extends Command3A {

  @Override
  public Atom newI(TeXParser tp, Atom a, Atom b, Atom c) {
    final RowAtom ra =
        new RowAtom(
            new ScriptsAtom(new PhantomAtom(c, false, true, true), b, a, false),
            new SpaceAtom(Unit.MU, -0.3, 0., 0.),
            c.changeType(TeXConstants.TYPE_ORDINARY));
    ra.lookAtLast(true);
    return ra;
  }
}
