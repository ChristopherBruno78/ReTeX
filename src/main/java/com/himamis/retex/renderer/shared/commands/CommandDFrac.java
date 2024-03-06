package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandDFrac extends Command2A {

  @Override
  public Atom newI(TeXParser tp, Atom a, Atom b) {
    return CommandGenfrac.get(null, a, b, null, null, 0);
  }
}
