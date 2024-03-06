package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.TeXConstants;
import com.himamis.retex.renderer.shared.TeXParser;
import com.himamis.retex.renderer.shared.TypedAtom;

public class CommandMathOp extends Command1A {
    @Override
    public Atom newI(TeXParser tp, Atom a) {
        a = new TypedAtom(TeXConstants.TYPE_BIG_OPERATOR, a);
        a.type_limits = TeXConstants.SCRIPT_NORMAL;
        return a;
    }
}
