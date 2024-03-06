package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.VCenteredAtom;

public class CommandVCenter extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new VCenteredAtom(a);
    }
}
