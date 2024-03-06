package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.DBoxAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandDBox extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new DBoxAtom(a);
    }
}
