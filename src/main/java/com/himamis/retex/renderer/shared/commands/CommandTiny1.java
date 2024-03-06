package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.MonoScaleAtom;
import com.himamis.retex.renderer.shared.RowAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandTiny1 extends CommandStyle {

    public CommandTiny1(RowAtom size) {
        this.size = size;
    }

    public CommandTiny1() {
        //
    }

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new MonoScaleAtom(a, 0.5);
    }
}
