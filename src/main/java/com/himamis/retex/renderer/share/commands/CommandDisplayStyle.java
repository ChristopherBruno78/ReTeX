package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandDisplayStyle extends CommandStyle {

  public CommandDisplayStyle() {
    //
  }

  public CommandDisplayStyle(RowAtom size) {
    this.size = size;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new StyleAtom(TeXConstants.STYLE_DISPLAY, a);
  }
}
