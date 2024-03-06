package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.mhchem.MhchemBondParser;

public class CommandBond extends Command {

  @Override
  public boolean init(TeXParser tp) {
    final String code = tp.getGroupAsArgument();
    final MhchemBondParser mbp = new MhchemBondParser(code);
    tp.addToConsumer(mbp.get());
    return false;
  }
}
