package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.*;

public class CommandTextSuperscript extends Command {

  boolean mode;

  @Override
  public boolean init(TeXParser tp) {
    mode = tp.setTextMode();
    return true;
  }

  @Override
  public void add(TeXParser tp, Atom a) {
    tp.setMathMode(mode);
    a = new TextStyleAtom(a, TextStyle.MATHNORMAL);
    tp.closeConsumer(
        SubSupCom.get(
            MHeightAtom.get(), null, new StyleAtom(TeXConstants.STYLE_TEXT, new RomanAtom(a))));
  }
}
