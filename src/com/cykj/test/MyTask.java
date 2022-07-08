package com.cykj.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyTask implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("MyTask is running");
    }
}
