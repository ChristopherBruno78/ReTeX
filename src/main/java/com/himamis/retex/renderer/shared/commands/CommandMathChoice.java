package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.MathchoiceAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandMathChoice extends Command4A {

    @Override
    public Atom newI(TeXParser tp, Atom a, Atom b, Atom c, Atom d) {
        return new MathchoiceAtom(a, b, c, d);
    }
}
