package com.cykj.view;

import com.cykj.controll.GameController;
import com.cykj.model.HeroPlane;
import com.cykj.test.Bird;
import com.cykj.test.Fly;
import com.cykj.test.Plane;

/*
* ��Ϸ��ڣ�main������ڣ�
* */
public class GameEnter {
    public static void main(String[] args) {
        //���ڴ�ֱ������:�������new�����Ķ��������
        new GameController();
        new GameFrame();
        // ��̬
//        Fly f1 = new Plane();
//        Fly f2 = new Bird();
//        f1.flying();
//        f2.flying();
    }
}
