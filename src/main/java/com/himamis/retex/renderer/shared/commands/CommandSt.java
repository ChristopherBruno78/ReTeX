package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.StrikeThroughAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandSt extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new StrikeThroughAtom(a);
    }
}
