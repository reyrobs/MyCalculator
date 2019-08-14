package sample.Model;

import sample.Controller.Arithmetic.*;
import sample.Controller.NumbersAction.*;
import sample.Controller.Other.backspaceAction;
import sample.Controller.Other.buttonClearAction;
import sample.Model.Button.*;

import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    private JTextField answerField ;
    private String temp1, temp2;
    private JPanel contentPanel;
    private boolean equalsClicked = false, opChosen = false;
    private char operation = ' ';

    public Gui() {
        super("Calculator");
        answerField = new JTextField(null, 20);
        answerField.setEditable(false);
        answerField.setHorizontalAlignment(JTextField.RIGHT);
        /**
         * Calling initialisation method
         */

        init();
    }

    public void init() {
        /**
         * Creating buttons and adding their corresponding actions
         */
        buttonOne one = new buttonOne();
        one.addActionListener(new buttonOneAction(this));

        buttonTwo two = new buttonTwo();
        two.addActionListener(new buttonTwoAction(this));

        buttonThree three = new buttonThree();
        three.addActionListener(new buttonThreeAction(this));

        buttonFour four = new buttonFour();
        four.addActionListener(new buttonFourAction(this));

        buttonFive five = new buttonFive();
        five.addActionListener(new buttonFiveAction(this));

        buttonSix six = new buttonSix();
        six.addActionListener(new buttonSixAction(this));

        buttonSeven seven = new buttonSeven();
        seven.addActionListener(new buttonSevenAction(this));

        buttonEight eight = new buttonEight();
        eight.addActionListener(new buttonEightAction(this));

        buttonNine nine = new buttonNine();
        nine.addActionListener(new buttonNineAction(this));

        buttonZero zero = new buttonZero();
        zero.addActionListener(new buttonZeroAction(this));

        buttonAdd add = new buttonAdd();
        add.addActionListener(new buttonPlusAction(this));

        buttonSub sub = new buttonSub();
        sub.addActionListener(new buttonMinusAction(this));

        buttonDiv div = new buttonDiv();
        div.addActionListener(new buttonDivAction(this));

        buttonMul mul = new buttonMul();
        mul.addActionListener(new buttonMulAction(this));

        backspaceButton back = new backspaceButton();
        back.addActionListener(new backspaceAction(this));

        buttonEquals equals = new buttonEquals();
        equals.addActionListener(new buttonEqualsAction(this));

        buttonClear clear = new buttonClear();
        clear.addActionListener(new buttonClearAction(this));

        /**
         * Creating the dimensions for the buttons
         */

        Dimension dim = new Dimension(75, 50);
        one.setPreferredSize(dim);
        two.setPreferredSize(dim);
        three.setPreferredSize(dim);
        four.setPreferredSize(dim);
        five.setPreferredSize(dim);
        six.setPreferredSize(dim);
        seven.setPreferredSize(dim);
        eight.setPreferredSize(dim);
        nine.setPreferredSize(dim);
        zero.setPreferredSize(new Dimension(225, 50));
        add.setPreferredSize(dim);
        sub.setPreferredSize(dim);
        clear.setPreferredSize(dim);
        div.setPreferredSize(dim);
        mul.setPreferredSize(dim);
        equals.setPreferredSize(new Dimension(225, 50));
        back.setPreferredSize(dim);

        equals.setBackground(Color.ORANGE);
        equals.setOpaque(true);
        equals.setBorderPainted(false);

        /**
         * Adding the buttons to the panel
         */

        contentPanel = new JPanel();
        contentPanel.setBackground(Color.black);
        contentPanel.setLayout(new FlowLayout());
        contentPanel.add(answerField, BorderLayout.NORTH);

        contentPanel.add(one); contentPanel.add(two); contentPanel.add(three); contentPanel.add(four); contentPanel.add(five);
        contentPanel.add(six); contentPanel.add(seven); contentPanel.add(eight); contentPanel.add(nine); contentPanel.add(zero);
        contentPanel.add(sub); contentPanel.add(add); contentPanel.add(clear); contentPanel.add(div); contentPanel.add(mul);
        contentPanel.add(back);contentPanel.add(equals);

        this.setContentPane(contentPanel);
    }


    public String getTemp1() {
        return temp1;
    }

    public void setTemp1(String temp1) {
        this.temp1 = temp1;
    }

    public String getTemp2() {
        return temp2;
    }

    public void setTemp2(String temp2) {
        this.temp2 = temp2;
    }

    public boolean isOpChosen() {
        return opChosen;
    }

    public void setOpChosen(boolean opChosen) {
        this.opChosen = opChosen;
    }

    public JTextField getAnswerField() {
        return answerField;
    }

    public void setAnswerField(JTextField answerField) {
        this.answerField = answerField;
    }

    public boolean isEqualsClicked() {
        return equalsClicked;
    }

    public void setEqualsClicked(boolean equalsClicked) {
        this.equalsClicked = equalsClicked;
    }

    public char getOperation() {
        return operation;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

}
