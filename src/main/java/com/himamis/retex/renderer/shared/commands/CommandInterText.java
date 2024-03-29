package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.*;
import com.himamis.retex.renderer.shared.exception.ParseException;

public class CommandInterText extends Command {

  boolean mode;

  @Override
  public boolean init(TeXParser tp) {
    if (!tp.isArrayMode()) {
      throw new ParseException(tp, "The macro \\intertext is only available in array mode !");
    }
    mode = tp.setTextMode();
    return true;
  }

  @Override
  public void add(TeXParser tp, Atom a) {
    tp.setMathMode(mode);
    a = new TextStyleAtom(a, TextStyle.MATHNORMAL);
    a = new StyleAtom(TeXConstants.STYLE_TEXT, new RomanAtom(a));
    tp.closeConsumer(a.changeType(TeXConstants.TYPE_INTERTEXT));
  }
}
