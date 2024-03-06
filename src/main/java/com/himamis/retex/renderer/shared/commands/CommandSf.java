package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.RowAtom;
import com.himamis.retex.renderer.shared.SsAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandSf extends CommandStyle {

    public CommandSf() {
        //
    }

    public CommandSf(RowAtom size) {
        this.size = size;
    }

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new SsAtom(a);
    }
}
