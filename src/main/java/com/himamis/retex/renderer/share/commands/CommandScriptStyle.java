package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandScriptStyle extends CommandStyle {

  public CommandScriptStyle() {
    //
  }

  public CommandScriptStyle(RowAtom size) {
    this.size = size;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new StyleAtom(TeXConstants.STYLE_SCRIPT, a);
  }
}
