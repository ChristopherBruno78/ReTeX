package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.*;

public class CommandMoveRight extends Command1A {

  TeXLength right;

  @Override
  public boolean init(TeXParser tp) {
    right = tp.getArgAsLength();
    return true;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new RowAtom(new SpaceAtom(right), a);
  }
}
