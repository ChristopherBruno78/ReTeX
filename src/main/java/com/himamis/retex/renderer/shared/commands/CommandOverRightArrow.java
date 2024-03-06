package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.UnderOverArrowAtom;

public class CommandOverRightArrow extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new UnderOverArrowAtom(a, false, true);
    }
}
