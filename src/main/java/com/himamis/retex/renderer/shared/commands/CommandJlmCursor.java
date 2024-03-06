package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.CursorAtom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.platform.FactoryProvider;
import com.himamis.retex.renderer.shared.platform.graphics.GraphicsFactory;

public class CommandJlmCursor extends Command {

  @Override
  public boolean init(TeXParser tp) {
    double size = tp.getArgAsDecimal();

    CursorAtom atom =
        new CursorAtom(
            FactoryProvider.getInstance()
                .getGraphicsFactory()
                .createColor(
                    GraphicsFactory.CURSOR_RED,
                    GraphicsFactory.CURSOR_GREEN,
                    GraphicsFactory.CURSOR_BLUE),
            size);

    tp.addToConsumer(atom);
    return false;
  }
}
