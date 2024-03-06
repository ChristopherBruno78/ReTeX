package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.FBoxAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandFBox extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new FBoxAtom(a);
    }
}
