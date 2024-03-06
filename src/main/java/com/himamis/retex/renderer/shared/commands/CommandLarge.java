package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.MonoScaleAtom;
import com.himamis.retex.renderer.shared.RowAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandLarge extends CommandStyle {

    public CommandLarge() {
        //
    }

    public CommandLarge(RowAtom size) {
        this.size = size;
    }

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new MonoScaleAtom(a, 1.2);
    }
}
