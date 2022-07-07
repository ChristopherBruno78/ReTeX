package com.himamis.retex.renderer.share.commands;

import com.himamis.retex.renderer.share.*;

public class CommandMod extends Command1A {

  @Override
  public Atom newI(TeXParser tp, Atom a) {
    final RowAtom ra = new RowAtom(4);
    final Atom sp = new SpaceAtom(TeXConstants.Muskip.THIN);
    ra.add(new RomanAtom(TeXParser.getAtomForLatinStr("mod", true)));
    ra.add(sp);
    ra.add(sp);
    ra.add(a);
    return new PodAtom(ra, 12., false);
  }
}
