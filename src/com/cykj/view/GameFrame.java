package com.cykj.view;
import com.cykj.GameUtil.ConstUtil;
import com.cykj.controll.GameController;

import javax.swing.*;
/*
* 窗口界面*/
public class GameFrame extends JFrame{

    private GamePanel gamePanel;//窗口加载一个面板,只有本文件使用
    // 构造函数
    public GameFrame(){
        gamePanel = new GamePanel();
        add(gamePanel);
        addKeyListener(GameController.heroController);//增加鼠标监听
        System.out.println("constructing starting");
        setTitle("plane game");
        setSize(ConstUtil.GAME_WIDTH,ConstUtil.GAME_HEIGHT);
        setLocationRelativeTo(null);//窗口居中
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);



    }
}
