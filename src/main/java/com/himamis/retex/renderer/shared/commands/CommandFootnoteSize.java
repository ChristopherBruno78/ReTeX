package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.MonoScaleAtom;
import com.himamis.retex.renderer.shared.RowAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandFootnoteSize extends CommandStyle {

  public CommandFootnoteSize() {
    //
  }

  public CommandFootnoteSize(RowAtom size) {
    this.size = size;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new MonoScaleAtom(a, 0.8);
  }
}
