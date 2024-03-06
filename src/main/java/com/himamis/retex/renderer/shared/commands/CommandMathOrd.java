package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.TeXConstants;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.TypedAtom;

public class CommandMathOrd extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new TypedAtom(TeXConstants.TYPE_ORDINARY, a);
    }
}
