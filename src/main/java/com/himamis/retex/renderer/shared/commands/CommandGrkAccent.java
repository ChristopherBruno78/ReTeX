package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.AccentedAtom;
import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.SymbolAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandGrkAccent extends Command2A {

    @Override
    public Atom newI(TeXParser tp, Atom a, Atom b) {
        // TODO: instanceof
        return new AccentedAtom(b, (SymbolAtom) a);
    }
}
