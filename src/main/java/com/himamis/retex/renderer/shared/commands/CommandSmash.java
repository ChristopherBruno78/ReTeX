package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.SmashedAtom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.exception.ParseException;

public class CommandSmash extends Command1A {

  char opt;

  @Override
  public boolean init(TeXParser tp) {
    opt = tp.getOptionAsChar();
    if (opt != 't' && opt != 'b' && opt != '\0') {
      throw new ParseException(tp, "Invalid option in \\smash");
    }
    return true;
  }

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new SmashedAtom(a, opt);
  }
}
