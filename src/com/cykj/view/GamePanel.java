package com.cykj.view;

import com.cykj.GameUtil.ConstUtil;
import com.cykj.GameUtil.ImageData;
import com.cykj.controll.GameController;
import com.cykj.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.List;
/*
* 面板绘画*/
public class GamePanel extends JPanel {
    private HeroPlane hero;
    private List enemy;
    //构造函数
    public GamePanel(){
        //布局设置
        this.setLayout(null);
        // model
        hero = GameController.heroPlane; //直接从controller获取对象
        enemy = GameController.enemyList;


//        //add a button
//        JButton button1 = new JButton("start game");
//        button1.setBounds(350,300,100,50);
//        this.add(button1);
    }
    //重写JPanel的paintComponent
    @Override
    protected void paintComponent(Graphics g){
        //背景动态运行
        if (GameController.bg.getPosY() == ConstUtil.GAME_HEIGHT){
            GameController.bg.setPosY(0);
        }
        //动态背景
        g.drawImage(ImageData.bgImage,GameController.bg.getPosX(),GameController.bg.getPosY(),ConstUtil.GAME_WIDTH,ConstUtil.GAME_HEIGHT,null);
        g.drawImage(ImageData.bgImage,GameController.bg.getPosX(),-ConstUtil.GAME_HEIGHT+GameController.bg.getPosY(),ConstUtil.GAME_WIDTH,ConstUtil.GAME_HEIGHT,null);
        //英雄机
        g.drawImage(ImageData.heroImage, hero.getPosX(),hero.getPosY(),hero.getWidth(),hero.getHeight(),null);
        g.drawImage(ImageData.heroImage2, hero.getPosX(),hero.getPosY(),hero.getWidth(),hero.getHeight(),null);
        //敌机
        for (int i = 0; i < GameController.enemyList.size(); i++) {
            EnemyPlane enemyPlane = (EnemyPlane) GameController.enemyList.get(i);
            g.drawImage(ImageData.enemyPlane,enemyPlane.getPosX(),enemyPlane.getPosY(),enemyPlane.getWidth(),enemyPlane.getHeight(),null);
        }
        //蜜蜂
        for (Bee bee:GameController.beeList) {
            g.drawImage(ImageData.bee,bee.getPosX(),bee.getPosY(),bee.getWidth(),bee.getHeight(),null);
        }
        //子弹
        for (Bullet bullet:GameController.herobulletList) {
            g.drawImage(bullet.getBufferedImage(),bullet.getPosX(),bullet.getPosY(),bullet.getWidth(),bullet.getHeight(),null);
        }
        //核弹
        for (BombBullet bombbullet:GameController.bombBullets) {
            g.drawImage(bombbullet.getBufferedImage(),bombbullet.getPosX(),bombbullet.getPosY(),bombbullet.getWidth(),bombbullet.getHeight(),null);
        }
        //核弹奖励
        for (BombAward bombAward:GameController.bombAwards) {
            g.drawImage(bombAward.getBufferedImage(),bombAward.getPosX(),bombAward.getPosY(),bombAward.getWidth(),bombAward.getHeight(),null);
        }

        g.drawString("score",10,10);
        this.addKeyListener(GameController.heroController);//panel 监听鼠标事件
        //flush
        repaint();
    }
}
