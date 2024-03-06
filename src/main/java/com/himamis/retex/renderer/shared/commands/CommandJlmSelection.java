package com.himamis.retex.renderer.shared.commands;

import com.himamis.retex.renderer.shared.Atom;
import com.himamis.retex.renderer.shared.Colors;
import com.himamis.retex.renderer.shared.SelectionAtom;
import com.himamis.retex.renderer.shared.TeXParser;

public class CommandJlmSelection extends Command1A {

    @Override
    public Atom newI(TeXParser tp, Atom a) {
        return new SelectionAtom(a, Colors.SELECTION, null);
    }
}
