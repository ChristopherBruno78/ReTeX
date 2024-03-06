package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.*;

public class CommandBf extends CommandStyle {

  public CommandBf() {
    //
  }

  public CommandBf(RowAtom size) {
    this.size = size;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new BoldAtom(new RomanAtom(a));
  }
}
