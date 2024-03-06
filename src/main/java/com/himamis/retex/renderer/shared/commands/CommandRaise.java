package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.RaiseAtom;
import com.himamis.retex.renderer.shared.TeXLength;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandRaise extends Command1A {
  TeXLength raise;

  @Override
  public boolean init(TeXParser tp) {
    raise = tp.getArgAsLength();
    return true;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new RaiseAtom(a, raise, null, null);
  }
}
