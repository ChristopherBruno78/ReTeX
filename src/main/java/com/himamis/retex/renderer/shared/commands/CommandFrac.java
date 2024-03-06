package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.FractionAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandFrac extends Command2A {

    @Override
    public Atom newI(TeXParser tp, Atom a, Atom b) {
        return new FractionAtom(a, b);
    }
}
