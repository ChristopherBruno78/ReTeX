package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.NewEnvironmentMacro;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandRenewEnvironment extends Command {

  @Override
  public boolean init(TeXParser tp) {
    final String name = tp.getArgAsString();
    final int nbargs = tp.getOptionAsPositiveInteger(0);
    final String before = tp.getArgAsString();
    final String after = tp.getArgAsString();
    NewEnvironmentMacro.addNewEnvironment(tp, name, before, after, nbargs, true);
    return false;
  }
}
