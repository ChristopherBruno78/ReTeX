package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.BoldAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandTextBf extends CommandText {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new BoldAtom(a);
    }
}