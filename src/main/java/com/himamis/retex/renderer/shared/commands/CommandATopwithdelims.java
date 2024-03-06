package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.FractionAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandATopwithdelims extends CommandOverwithdelims {

    @Override
    public Atom newI(TeXParser tp, Atom num, Atom den) {
        return new FractionAtom(num, den, false);
    }
}
