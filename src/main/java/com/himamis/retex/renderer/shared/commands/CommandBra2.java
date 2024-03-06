package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.RowAtom;
import com.himamis.retex.renderer.shared.Symbols;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandBra2 extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new RowAtom(Symbols.LANGLE, a, Symbols.VERT);
    }
}
