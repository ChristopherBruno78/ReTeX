package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.TeXParser;

public class CommandBeginGroup extends Command {

  @Override
  public boolean init(TeXParser tp) {
    tp.processLBrace();
    return false;
  }
}
