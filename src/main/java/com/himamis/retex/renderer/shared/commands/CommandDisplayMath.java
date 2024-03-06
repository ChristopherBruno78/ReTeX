package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.MathAtom;
import com.himamis.retex.renderer.shared.TeXConstants;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandDisplayMath extends Command1A {
    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new MathAtom(a, TeXConstants.STYLE_DISPLAY);
    }
}
