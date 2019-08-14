package sample.Controller.Arithmetic;

import sample.Model.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class buttonEqualsAction extends AbstractAction {
    private Gui gui;

    public buttonEqualsAction(Gui gui) {
        super("=");
        this.gui = gui;
    }

    public void actionPerformed(ActionEvent event) {

        if(gui.isEqualsClicked()) {
            return;
        }

        if (gui.getTemp1() != null && gui.getTemp2() == null) {
            gui.setTemp2(gui.getAnswerField().getText());
        }

        if (gui.getTemp1() != null && gui.getTemp2() != null) {

            Double d1, d2, answer;
            String final_answer;
            d1 = Double.parseDouble(gui.getTemp1());
            d2 = Double.parseDouble(gui.getTemp2());
            switch (gui.getOperation()) {

                case '+':
                    answer = d1 + d2;
                    final_answer = Double.toString(answer);
                    gui.getAnswerField().setText(final_answer);
                   // gui.setTemp1(null);
                    gui.setTemp1(final_answer);
                    gui.setTemp2(null);
                    gui.setEqualsClicked(true);
                    break;

                case '-':
                    answer = d1 - d2;
                    final_answer = Double.toString(answer);
                    gui.getAnswerField().setText(final_answer);
                  //  gui.setTemp1(null);
                    gui.setTemp1(final_answer);
                    gui.setTemp2(null);
                    gui.setEqualsClicked(true);
                    break;

                case '/':
                    answer = d1 / d2;
                    final_answer = Double.toString(answer);
                    gui.getAnswerField().setText(final_answer);
                   // gui.setTemp1(null);
                    gui.setTemp1(final_answer);
                    gui.setTemp2(null);
                    gui.setEqualsClicked(true);
                    break;

                case '*':
                    answer = d1 * d2;
                    final_answer = Double.toString(answer);
                    gui.getAnswerField().setText(final_answer);
                  //  gui.setTemp1(null);
                    gui.setTemp1(final_answer);
                    gui.setTemp2(null);
                    gui.setEqualsClicked(true);
                    break;
            }
        }
    }
}

