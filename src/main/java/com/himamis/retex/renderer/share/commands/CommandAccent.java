package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandAccent extends Command2A {

  @Override
  public Atom newI(TeXParser tp, Atom a, Atom b) {
    if (a instanceof SymbolAtom) {
      return new AccentedAtom(b, (SymbolAtom) a);
    } else {
      return new AccentSetAtom(b, a);
    }
  }
}
