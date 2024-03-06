package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.RotateAtom;
import com.himamis.retex.renderer.shared.TeXParser;

import java.util.HashMap;

public class CommandT extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    return new RotateAtom(
        a,
        180.,
        new HashMap<String, String>() {
          {
            put("origin", "cc");
          }
        });
  }
}
