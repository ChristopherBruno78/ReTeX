package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.TtAtom;

public class CommandTextTt extends CommandText {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new TtAtom(a);
    }
}
