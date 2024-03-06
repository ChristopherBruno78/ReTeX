package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.ShadowAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandShadowBox extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new ShadowAtom(a);
    }
}
