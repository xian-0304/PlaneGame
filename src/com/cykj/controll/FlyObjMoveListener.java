package com.cykj.controll;

import com.cykj.model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlyObjMoveListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        //调用背景的moce
        GameController.bg.move();
        //敌机列表
        for (EnemyPlane enemyPlane:GameController.enemyList) {
            enemyPlane.move();
        }
        //蜜蜂
        for (Bee bee:GameController.beeList) {
            bee.move();
        }
        //子弹移动
        for (Bullet bullet: GameController.herobulletList) {
            bullet.move();
        }
        //核弹移动
        for (BombBullet bombbullet: GameController.bombBullets) {
            bombbullet.move();
        }
        for (BombAward bombAward: GameController.bombAwards) {
            bombAward.move();
        }
    }
}
