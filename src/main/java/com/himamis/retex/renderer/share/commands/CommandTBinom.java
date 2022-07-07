package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandTBinom extends Command2A {

  @Override
  public Atom newI(TeXParser tp, Atom a, Atom b) {
    final SymbolAtom left = Symbols.LBRACK;
    final SymbolAtom right = Symbols.RBRACK;
    return CommandGenfrac.get(left, a, b, right, TeXLength.getZero(), 1);
  }
}
