package com.cykj.controll;

import com.cykj.model.Bee;
import com.cykj.model.BombAward;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAwardListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        GameController.beeList.add(new Bee());//蜜蜂加入队列
        GameController.bombAwards.add(new BombAward()); //核弹奖励
    }
}
