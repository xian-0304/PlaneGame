package com.cykj.view;
import com.cykj.GameUtil.ConstUtil;
import com.cykj.controll.GameController;

import javax.swing.*;
/*
* ���ڽ���*/
public class GameFrame extends JFrame{

    private GamePanel gamePanel;//���ڼ���һ�����,ֻ�б��ļ�ʹ��
    // ���캯��
    public GameFrame(){
        gamePanel = new GamePanel();
        add(gamePanel);
        addKeyListener(GameController.heroController);//����������
        System.out.println("constructing starting");
        setTitle("plane game");
        setSize(ConstUtil.GAME_WIDTH,ConstUtil.GAME_HEIGHT);
        setLocationRelativeTo(null);//���ھ���
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);



    }
}
