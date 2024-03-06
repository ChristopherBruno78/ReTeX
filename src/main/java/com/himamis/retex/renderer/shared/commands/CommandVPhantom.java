package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.PhantomAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandVPhantom extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new PhantomAtom(a, false, true, true);
    }
}
