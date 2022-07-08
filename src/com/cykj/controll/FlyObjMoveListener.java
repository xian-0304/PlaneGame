package com.cykj.controll;

import com.cykj.model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlyObjMoveListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        //���ñ�����moce
        GameController.bg.move();
        //�л��б�
        for (EnemyPlane enemyPlane:GameController.enemyList) {
            enemyPlane.move();
        }
        //�۷�
        for (Bee bee:GameController.beeList) {
            bee.move();
        }
        //�ӵ��ƶ�
        for (Bullet bullet: GameController.herobulletList) {
            bullet.move();
        }
        //�˵��ƶ�
        for (BombBullet bombbullet: GameController.bombBullets) {
            bombbullet.move();
        }
        for (BombAward bombAward: GameController.bombAwards) {
            bombAward.move();
        }
    }
}
