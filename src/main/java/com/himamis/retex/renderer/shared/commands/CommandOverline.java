package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.OverlinedAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandOverline extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new OverlinedAtom(a);
    }
}
