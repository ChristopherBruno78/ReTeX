package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandMBox extends Command {

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
    tp.closeConsumer(new StyleAtom(TeXConstants.STYLE_TEXT, new RomanAtom(a)));
  }
}
