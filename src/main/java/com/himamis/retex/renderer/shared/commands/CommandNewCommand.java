package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.NewCommandMacro;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandNewCommand extends Command {

  @Override
  public boolean init(TeXParser tp) {
    final String name = tp.getArgAsCommand();
    final int nbargs = tp.getOptionAsPositiveInteger(0);
    final String code = tp.getGroupAsArgument();
    NewCommandMacro.addNewCommand(tp, name, code, nbargs, false);
    return false;
  }
}
