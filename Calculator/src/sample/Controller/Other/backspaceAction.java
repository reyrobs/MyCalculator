package sample.Controller.Other;

import sample.Model.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class backspaceAction extends AbstractAction {

    private Gui gui;

    public backspaceAction(Gui gui) {
        super("<--");
        this.gui = gui;
    }


    public void actionPerformed(ActionEvent event) {
        if(gui.getAnswerField().getText() != "") {

            String s = gui.getAnswerField().getText();

            gui.getAnswerField().setText(s.substring(0, s.length() - 1));

           if(gui.isEqualsClicked()) {
               gui.setTemp1(gui.getAnswerField().getText());
           }


        }
    }
}
