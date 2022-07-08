package com.cykj.controll;

import com.cykj.model.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GameController {
    public static GameBackGroud bg;
    public static HeroPlane heroPlane; //static Ψһ��heroplane��ֱ����controller��ȡ
    public static HeroController heroController;
    public static List<Bullet> herobulletList;
    public static List<BombBullet> bombBullets;
    public static List<BombAward> bombAwards;
    public static List<EnemyPlane> enemyList;
    public static List<Bee> beeList;
    public static ActionListener createBulletListener;
    public static ActionListener createFlyObjListener;
    public static ActionListener collisionListener ;
    public static ActionListener createAwardListener  ;
    public static ActionListener flyObjMoveListener;

    public GameController(){

        bg = new GameBackGroud();
        //controll
        heroPlane = new HeroPlane(); //һ��Ӣ�ۻ�
        heroController = new HeroController(heroPlane);  //�������¼�

        enemyList = new ArrayList();//ֻ�ܴ�ŵл��ࣩ����л�
        beeList = new ArrayList<>();//��ʼ���۷�
        herobulletList = new ArrayList<Bullet>();//Ӣ���ӵ�
        bombBullets = new ArrayList<>(); //�˵�
        bombAwards = new ArrayList<>(); // �˵�����

        //�л�����
        createFlyObjListener = new CreateFlyObjListener(); //��ʱ��
        Timer createFlyObjTimer = new Timer(1000, createFlyObjListener);
        createFlyObjTimer.start();



        //�ӵ�����
        createBulletListener = new CreateBulletListener();
        Timer createBulletTimer = new Timer(400, createBulletListener);
        createBulletTimer.start();


        //�߽���
        collisionListener = new CollisionListener();
        Timer collisionListenerTimer = new Timer(10, collisionListener);
        collisionListenerTimer.start();

        //�۷�����
        createAwardListener = new CreateAwardListener(); //��ʱ��
        Timer createBeeListenerTimer  = new Timer(9000, createAwardListener);
        createBeeListenerTimer.start();

        //�������ƶ�
        flyObjMoveListener = new FlyObjMoveListener();
        Timer timer = new Timer(10,flyObjMoveListener);
        timer.start();


    }
}
