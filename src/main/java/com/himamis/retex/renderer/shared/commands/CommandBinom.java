package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.*;

public class CommandBinom extends Command2A {

  @Override
  public Atom newI(TeXParser tp, Atom a, Atom b) {
    final SymbolAtom left = Symbols.LBRACK;
    final SymbolAtom right = Symbols.RBRACK;
    return new FencedAtom(new FractionAtom(a, b, false), left, right);
  }
}
