package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.XMapstoAtom;

public class CommandXMapsTo extends Command1O1A {

    @Override
    public Atom newI(TeXParser tp, Atom a, Atom b) {
        return new XMapstoAtom(b, a);
    }
}
