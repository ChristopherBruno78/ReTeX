package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandBoxed extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new FBoxAtom(new MathAtom(a, TeXConstants.STYLE_DISPLAY));
  }
}
