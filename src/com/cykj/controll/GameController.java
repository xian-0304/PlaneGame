package com.cykj.controll;

import com.cykj.model.*;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GameController {
    public static GameBackGroud bg;
    public static HeroPlane heroPlane; //static 唯一的heroplane，直接由controller获取
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
        heroPlane = new HeroPlane(); //一架英雄机
        heroController = new HeroController(heroPlane);  //鼠标监听事件

        enemyList = new ArrayList();//只能存放敌机类）多个敌机
        beeList = new ArrayList<>();//初始化蜜蜂
        herobulletList = new ArrayList<Bullet>();//英雄子弹
        bombBullets = new ArrayList<>(); //核弹
        bombAwards = new ArrayList<>(); // 核弹奖励

        //敌机生成
        createFlyObjListener = new CreateFlyObjListener(); //定时器
        Timer createFlyObjTimer = new Timer(1000, createFlyObjListener);
        createFlyObjTimer.start();



        //子弹生成
        createBulletListener = new CreateBulletListener();
        Timer createBulletTimer = new Timer(400, createBulletListener);
        createBulletTimer.start();


        //边界检测
        collisionListener = new CollisionListener();
        Timer collisionListenerTimer = new Timer(10, collisionListener);
        collisionListenerTimer.start();

        //蜜蜂生成
        createAwardListener = new CreateAwardListener(); //定时器
        Timer createBeeListenerTimer  = new Timer(9000, createAwardListener);
        createBeeListenerTimer.start();

        //飞行物移动
        flyObjMoveListener = new FlyObjMoveListener();
        Timer timer = new Timer(10,flyObjMoveListener);
        timer.start();


    }
}
