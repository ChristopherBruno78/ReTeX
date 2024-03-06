package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.RowAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandHBox extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        if (a instanceof RowAtom) {
            return a;
        }
        return new RowAtom(a);
    }
}
