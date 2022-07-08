package com.cykj.controll;

import com.cykj.model.Bee;
import com.cykj.model.Bullet;
import com.cykj.model.EnemyPlane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateFlyObjListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        GameController.enemyList.add(new EnemyPlane());//敌机加入队列
    }
}
