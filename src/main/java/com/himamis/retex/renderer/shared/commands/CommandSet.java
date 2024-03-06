package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.RowAtom;
import com.himamis.retex.renderer.shared.Symbols;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandSet extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new RowAtom(Symbols.LBRACE, a, Symbols.RBRACE);
    }
}
