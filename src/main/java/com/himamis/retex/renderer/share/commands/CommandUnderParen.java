package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandUnderParen extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new OverUnderDelimiter(a, null, Symbols.RBRACK, Unit.EX, 0, false);
  }
}
