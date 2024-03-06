package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.RaiseAtom;
import com.himamis.retex.renderer.shared.TeXLength;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandLower extends Command1A {

  TeXLength lower;

  @Override
  public boolean init(TeXParser tp) {
    lower = tp.getArgAsLength();
    return true;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new RaiseAtom(a, lower.scale(-1.), null, null);
  }
}
