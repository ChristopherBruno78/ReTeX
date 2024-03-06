package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.AlignedAtom;
import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.TeXConstants;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandShoveLeft extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new AlignedAtom(a, TeXConstants.Align.LEFT);
    }
}
