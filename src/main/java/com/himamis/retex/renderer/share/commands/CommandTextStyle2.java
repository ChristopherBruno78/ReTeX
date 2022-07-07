package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandTextStyle2 extends CommandStyle {

  public CommandTextStyle2() {
    //
  }

  public CommandTextStyle2(RowAtom size) {
    this.size = size;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new StyleAtom(TeXConstants.STYLE_TEXT, a);
  }
}
