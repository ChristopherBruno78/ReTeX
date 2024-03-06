package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.SsAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandTextSf extends CommandText {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new SsAtom(a);
    }
}
