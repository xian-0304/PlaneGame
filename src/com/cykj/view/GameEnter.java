package com.cykj.view;

import com.cykj.controll.GameController;
import com.cykj.model.HeroPlane;
import com.cykj.test.Bird;
import com.cykj.test.Fly;
import com.cykj.test.Plane;

/*
* 游戏入口（main函数入口）
* */
public class GameEnter {
    public static void main(String[] args) {
        //堆内存直接生成:存放所有new出来的对象和数组
        new GameController();
        new GameFrame();
        // 多态
//        Fly f1 = new Plane();
//        Fly f2 = new Bird();
//        f1.flying();
//        f2.flying();
    }
}
