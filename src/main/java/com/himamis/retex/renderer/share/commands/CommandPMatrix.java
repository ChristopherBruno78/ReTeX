package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandPMatrix extends CommandMatrix {

  @Override
  public Atom newI(TeXParser tp) {
    return new FencedAtom(new SMatrixAtom(aoa, false), Symbols.LBRACK, Symbols.RBRACK);
  }
}
