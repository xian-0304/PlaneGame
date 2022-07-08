package com.cykj.test;

import javax.swing.*;
import java.awt.event.ActionListener;

public class TimerTest {
    public static void main(String[] args) {
        ActionListener task = new MyTask();
        Timer timer = new Timer(1000,task);
        timer.start();
        while (true);
    }
}
