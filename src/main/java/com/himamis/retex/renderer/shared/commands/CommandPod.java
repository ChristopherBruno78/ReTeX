package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.PodAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandPod extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new PodAtom(a, 8., true);
    }
}
