package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandOverBrack extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new OverUnderDelimiter(a, null, Symbols.LSQBRACK, Unit.EX, 0, true);
  }
}
