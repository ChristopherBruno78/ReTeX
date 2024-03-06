package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.ReflectAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandReflectBox extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new ReflectAtom(a);
    }
}
