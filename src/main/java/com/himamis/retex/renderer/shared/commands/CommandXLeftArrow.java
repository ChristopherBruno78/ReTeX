package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.XArrowAtom;

public class CommandXLeftArrow extends Command1O1A {

    @Override
    public Atom newI(TeXParser tp, Atom a, Atom b) {
        return new XArrowAtom(b, a, XArrowAtom.Kind.Left);
    }
}
