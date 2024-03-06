package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.RowAtom;
import com.himamis.retex.renderer.shared.SmallCapAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandSc extends CommandStyle {

    public CommandSc() {
        //
    }

    public CommandSc(RowAtom size) {
        this.size = size;
    }

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new SmallCapAtom(a);
    }
}
