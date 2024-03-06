package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.ItAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandTextIt extends CommandText {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new ItAtom(a);
    }
}
