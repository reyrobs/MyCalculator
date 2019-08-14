package sample.Controller.Other;

import sample.Model.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class buttonClearAction extends AbstractAction {

    private Gui gui;

    public buttonClearAction(Gui gui) {
        super("AC");
        this.gui = gui;
    }

    public void actionPerformed(ActionEvent event) {
        gui.getAnswerField().setText(null);
        gui.setTemp1(null);
        gui.setTemp2(null);
        gui.setEqualsClicked(false);
        gui.setOpChosen(false);
    }
}
