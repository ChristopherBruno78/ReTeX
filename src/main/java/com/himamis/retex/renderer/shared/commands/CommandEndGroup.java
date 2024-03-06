package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.TeXParser;

public class CommandEndGroup extends Command {

  @Override
  public boolean init(TeXParser tp) {
    tp.processRBrace();
    return false;
  }
}
