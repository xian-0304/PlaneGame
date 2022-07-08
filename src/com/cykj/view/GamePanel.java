package com.cykj.view;

import com.cykj.GameUtil.ConstUtil;
import com.cykj.GameUtil.ImageData;
import com.cykj.controll.GameController;
import com.cykj.model.*;

import javax.swing.*;
import java.awt.*;
import java.util.List;
/*
* ���滭*/
public class GamePanel extends JPanel {
    private HeroPlane hero;
    private List enemy;
    //���캯��
    public GamePanel(){
        //��������
        this.setLayout(null);
        // model
        hero = GameController.heroPlane; //ֱ�Ӵ�controller��ȡ����
        enemy = GameController.enemyList;


//        //add a button
//        JButton button1 = new JButton("start game");
//        button1.setBounds(350,300,100,50);
//        this.add(button1);
    }
    //��дJPanel��paintComponent
    @Override
    protected void paintComponent(Graphics g){
        //������̬����
        if (GameController.bg.getPosY() == ConstUtil.GAME_HEIGHT){
            GameController.bg.setPosY(0);
        }
        //��̬����
        g.drawImage(ImageData.bgImage,GameController.bg.getPosX(),GameController.bg.getPosY(),ConstUtil.GAME_WIDTH,ConstUtil.GAME_HEIGHT,null);
        g.drawImage(ImageData.bgImage,GameController.bg.getPosX(),-ConstUtil.GAME_HEIGHT+GameController.bg.getPosY(),ConstUtil.GAME_WIDTH,ConstUtil.GAME_HEIGHT,null);
        //Ӣ�ۻ�
        g.drawImage(ImageData.heroImage, hero.getPosX(),hero.getPosY(),hero.getWidth(),hero.getHeight(),null);
        g.drawImage(ImageData.heroImage2, hero.getPosX(),hero.getPosY(),hero.getWidth(),hero.getHeight(),null);
        //�л�
        for (int i = 0; i < GameController.enemyList.size(); i++) {
            EnemyPlane enemyPlane = (EnemyPlane) GameController.enemyList.get(i);
            g.drawImage(ImageData.enemyPlane,enemyPlane.getPosX(),enemyPlane.getPosY(),enemyPlane.getWidth(),enemyPlane.getHeight(),null);
        }
        //�۷�
        for (Bee bee:GameController.beeList) {
            g.drawImage(ImageData.bee,bee.getPosX(),bee.getPosY(),bee.getWidth(),bee.getHeight(),null);
        }
        //�ӵ�
        for (Bullet bullet:GameController.herobulletList) {
            g.drawImage(bullet.getBufferedImage(),bullet.getPosX(),bullet.getPosY(),bullet.getWidth(),bullet.getHeight(),null);
        }
        //�˵�
        for (BombBullet bombbullet:GameController.bombBullets) {
            g.drawImage(bombbullet.getBufferedImage(),bombbullet.getPosX(),bombbullet.getPosY(),bombbullet.getWidth(),bombbullet.getHeight(),null);
        }
        //�˵�����
        for (BombAward bombAward:GameController.bombAwards) {
            g.drawImage(bombAward.getBufferedImage(),bombAward.getPosX(),bombAward.getPosY(),bombAward.getWidth(),bombAward.getHeight(),null);
        }

        g.drawString("score",10,10);
        this.addKeyListener(GameController.heroController);//panel ��������¼�
        //flush
        repaint();
    }
}
