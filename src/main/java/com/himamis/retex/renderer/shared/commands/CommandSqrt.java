package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.NthRoot;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandSqrt extends Command1O1A {

    @Override
    public Atom newI(TeXParser tp, Atom a, Atom b) {
        return new NthRoot(b, a);
    }
}
