package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.*;

public class CommandUnderTilde extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new UnderOverAtom(
        a,
        new AccentedAtom(new PhantomAtom(a, true, false, false), Symbols.WIDETILDE),
        new TeXLength(Unit.MU, 0.3),
        true,
        false);
  }
}
