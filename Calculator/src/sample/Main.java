package sample;

import sample.Model.Gui;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Gui g = new Gui();
        g.setSize(250, 450);
        g.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        g.setVisible(true);
        g.setResizable(false);
    }
}