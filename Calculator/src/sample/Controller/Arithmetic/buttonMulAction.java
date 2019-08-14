package sample.Controller.Arithmetic;

import sample.Model.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class buttonMulAction extends AbstractAction {

    private Gui gui;
    private Double a;

    public buttonMulAction(Gui gui) {
        super("*");
        this.gui = gui;
    }

    public void actionPerformed(ActionEvent event) {
        if (gui.getAnswerField().getText().trim().length() == 0 && gui.getTemp1() == null) {
            System.out.println("Please enter a number");
        } else  {
            if(gui.getTemp1()==null) {
                gui.setTemp1(gui.getAnswerField().getText());
            }
            gui.setOpChosen(true);
            gui.setOperation('*');
        }
    }
}

