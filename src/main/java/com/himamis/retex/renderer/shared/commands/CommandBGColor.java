package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.ColorAtom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.platform.graphics.Color;

public class CommandBGColor extends Command1A {

  Color bg;

  public CommandBGColor() {
    //
  }

  public CommandBGColor(Color bg2) {
    this.bg = bg2;
  }

  @Override
  public boolean init(TeXParser tp) {
    bg = CommandDefinecolor.getColor(tp);
    return true;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new ColorAtom(a, bg, null);
  }
}
