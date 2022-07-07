package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandMoveLeft extends Command1A {

  TeXLength left;

  @Override
  public boolean init(TeXParser tp) {
    left = tp.getArgAsLength();
    return true;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new RowAtom(new SpaceAtom(left.scale(-1.)), a);
  }
}
