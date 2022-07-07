package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandScriptScriptStyle extends CommandStyle {

  public CommandScriptScriptStyle() {
    //
  }

  public CommandScriptScriptStyle(RowAtom size) {
    this.size = size;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new StyleAtom(TeXConstants.STYLE_SCRIPT_SCRIPT, a);
  }
}
