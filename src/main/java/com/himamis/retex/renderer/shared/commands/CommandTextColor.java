package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.ColorAtom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.platform.graphics.Color;

public class CommandTextColor extends Command1A {

  Color fg;

  public CommandTextColor() {
    //
  }

  public CommandTextColor(Color fg) {
    this.fg = fg;
  }

  @Override
  public boolean init(TeXParser tp) {
    fg = CommandDefinecolor.getColor(tp);
    return true;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new ColorAtom(a, null, fg);
  }
}
