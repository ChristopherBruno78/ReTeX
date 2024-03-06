package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.*;

public class CommandPMatrix extends CommandMatrix {

  @Override
  public Atom newI(TeXParser tp) {
    return new FencedAtom(new SMatrixAtom(aoa, false), Symbols.LBRACK, Symbols.RBRACK);
  }
}
