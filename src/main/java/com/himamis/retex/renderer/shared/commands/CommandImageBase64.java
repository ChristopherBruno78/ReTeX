package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.GraphicsAtomBase64;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandImageBase64 extends Command {

  @Override
  public boolean init(TeXParser tp) {
    int width = tp.getArgAsPositiveInteger();
    int height = tp.getArgAsPositiveInteger();
    String base64 = tp.getArgAsString();
    tp.addToConsumer(new GraphicsAtomBase64(width, height, base64));
    return false;
  }
}
