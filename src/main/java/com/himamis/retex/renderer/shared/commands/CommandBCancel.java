package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.CancelAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandBCancel extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new CancelAtom(a, CancelAtom.Type.BACKSLASH);
    }
}
