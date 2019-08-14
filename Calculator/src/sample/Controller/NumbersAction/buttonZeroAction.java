package sample.Controller.NumbersAction;

import sample.Model.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonZeroAction extends AbstractAction {

    private Gui gui;

    public buttonZeroAction(Gui gui) {
        super("0");
        this.gui = gui;
    }

    public void actionPerformed(ActionEvent event) {
        if(gui.isOpChosen() || gui.isEqualsClicked()) {
            gui.getAnswerField().setText("");
            gui.setOpChosen(false);
            gui.setEqualsClicked(false);
        }

        if(gui.getAnswerField().getText().trim().length() == 0 || gui.getAnswerField().getText().equals("")) {
            gui.getAnswerField().setText("0");
        }

        else {
            gui.getAnswerField().setText(gui.getAnswerField().getText() + "0");
        }
    }
}


