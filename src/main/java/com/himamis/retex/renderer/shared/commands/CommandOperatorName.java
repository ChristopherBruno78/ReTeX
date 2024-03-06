package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.RomanAtom;
import com.himamis.retex.renderer.shared.TeXConstants;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandOperatorName extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        a = new RomanAtom(a).changeType(TeXConstants.TYPE_BIG_OPERATOR);
        a.type_limits = TeXConstants.SCRIPT_NOLIMITS;
        return a;
    }
}
