package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.ColorAtom;
import com.himamis.retex.renderer.shared.RowAtom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.platform.graphics.Color;

public class CommandColor extends CommandStyle {

  Color fg;

  public CommandColor() {
    //
  }

  public CommandColor(RowAtom size, Color fg2) {
    this.size = size;
    this.fg = fg2;
  }

  @Override
  public boolean init(TeXParser tp) {
    fg = CommandDefinecolor.getColor(tp);
    return super.init(tp);
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new ColorAtom(a, null, fg);
  }
}
