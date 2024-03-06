package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.FractionAtom;
import com.himamis.retex.renderer.shared.TeXLength;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandAbove extends CommandOver {

  TeXLength len;

  @Override
  public boolean init(TeXParser tp) {
    super.init(tp);
    len = tp.getArgAsLength();
    return false;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a, Atom b) {
    return new FractionAtom(a, b, len);
  }
}
