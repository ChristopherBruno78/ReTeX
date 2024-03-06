package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.RomanAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandTextRm extends CommandText {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new RomanAtom(a);
    }
}
