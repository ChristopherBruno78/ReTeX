package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.UnderlinedAtom;

public class CommandUnderline extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new UnderlinedAtom(a);
    }
}
