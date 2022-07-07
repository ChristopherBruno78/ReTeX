package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandDDDDot extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new BuildrelAtom(
        a,
        new RowAtom(
            Symbols.TEXTNORMALDOT,
            Symbols.TEXTNORMALDOT,
            Symbols.TEXTNORMALDOT,
            Symbols.TEXTNORMALDOT));
  }
}
