package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.SsAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandMathSf extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new SsAtom(a);
    }
}
