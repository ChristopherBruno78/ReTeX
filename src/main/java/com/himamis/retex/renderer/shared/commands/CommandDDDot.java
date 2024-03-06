package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.*;

public class CommandDDDot extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new BuildrelAtom(
        a, new RowAtom(Symbols.TEXTNORMALDOT, Symbols.TEXTNORMALDOT, Symbols.TEXTNORMALDOT));
  }
}
