package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.AccentedAtom;
import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.Symbols;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandHat2 extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new AccentedAtom(a, Symbols.HAT);
  }

  @Override
  public boolean close(TeXParser tp) {
    tp.closeConsumer(Symbols.HAT);
    return true;
  }

  @Override
  public boolean isClosable() {
    return true;
  }
}
