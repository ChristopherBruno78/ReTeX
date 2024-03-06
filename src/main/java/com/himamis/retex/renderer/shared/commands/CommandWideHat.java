package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.AccentedAtom;
import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.Symbols;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandWideHat extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new AccentedAtom(a, Symbols.WIDEHAT);
  }

  @Override
  public boolean close(TeXParser tp) {
    tp.closeConsumer(Symbols.WIDEHAT);
    return true;
  }

  @Override
  public boolean isClosable() {
    return true;
  }
}
