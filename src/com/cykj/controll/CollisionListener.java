package com.cykj.controll;

import com.cykj.model.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CollisionListener implements ActionListener {
    ArrayList<Object> removeList = new ArrayList();
    @Override
    public void actionPerformed(ActionEvent e) {
        //敌机与子弹的碰撞检测amend
        for (Bullet bullet:GameController.herobulletList) {
            for (EnemyPlane enemyPlane:GameController.enemyList){
                Rectangle bulletRect = new Rectangle(bullet.getPosX(),bullet.getPosY(),bullet.getWidth(),bullet.getHeight());
                Rectangle enemyRect = new Rectangle(enemyPlane.getPosX(),enemyPlane.getPosY(),enemyPlane.getWidth(),enemyPlane.getHeight());
                boolean result = bulletRect.intersects(enemyRect);
                if (result){ //报错，检测的时候不能增删改等strucklly modified
//                    GameController.herobulletList.remove(bullet);
//                    GameController.enemyList.remove(enemyPlane);
                        removeList.add(bullet);
                        removeList.add(enemyPlane);
                }
            }
        }
        GameController.enemyList.removeAll(removeList);
        GameController.herobulletList.removeAll(removeList);
        for (Bee bee:GameController.beeList) {
            Rectangle beeRect = new Rectangle(bee.getPosX(),bee.getPosY(),bee.getWidth(),bee.getHeight());
            Rectangle heroRect = new Rectangle(GameController.heroPlane.getPosX(),GameController.heroPlane.getPosY(),GameController.heroPlane.getWidth(),GameController.heroPlane.getHeight());
            boolean result = beeRect.intersects(heroRect);
            if (result){
                removeList.add(bee);
                GameController.heroPlane.setFireState(GameController.heroPlane.getFireState()*2);
            }
        }
        //英雄机吃到核弹奖励
        for (BombAward bombAward:GameController.bombAwards) {
            Rectangle bombRect = new Rectangle(bombAward.getPosX(),bombAward.getPosY(),bombAward.getWidth(),bombAward.getHeight());
            Rectangle heroRect = new Rectangle(GameController.heroPlane.getPosX(),GameController.heroPlane.getPosY(),GameController.heroPlane.getWidth(),GameController.heroPlane.getHeight());
            boolean result = bombRect.intersects(heroRect);
            if (result){
                removeList.add(bombAward);//                GameController.heroPlane.setFireState(GameController.heroPlane.getFireState()*2);

            }
        }
        GameController.bombAwards.removeAll(removeList);
    }

}
