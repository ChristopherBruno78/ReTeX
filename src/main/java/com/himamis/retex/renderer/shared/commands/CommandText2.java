package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandText2 extends CommandText {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return a;
    }
}
