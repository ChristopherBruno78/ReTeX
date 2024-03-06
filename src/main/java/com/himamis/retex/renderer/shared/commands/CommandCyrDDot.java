package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.AccentedAtom;
import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.SymbolAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandCyrDDot extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new AccentedAtom(a, "cyrddot");
  }

  @Override
  public boolean close(TeXParser tp) {
    tp.closeConsumer(SymbolAtom.get("cyrddot"));
    return true;
  }

  @Override
  public boolean isClosable() {
    return true;
  }
}
