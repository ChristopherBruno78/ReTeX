package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandPMB extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new OoalignAtom(a, new RowAtom(new SpaceAtom(Unit.MU, 0.4), a));
  }
}
