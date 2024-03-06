package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.RomanAtom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.mhchem.MhchemParser;

public class CommandCE extends Command {

  @Override
  public boolean init(TeXParser tp) {
    final String code = tp.getGroupAsArgument();
    final MhchemParser mp = new MhchemParser(code);
    mp.parse();
    tp.addToConsumer(new RomanAtom(mp.get()));
    return false;
  }
}
