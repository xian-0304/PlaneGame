package com.cykj.model;

import com.cykj.controll.GameController;

public class GameBackGroud extends FlyObj {
    public GameBackGroud(){
        posX = 0;
        posY = 0;
    }
    @Override
    public void move() {
        posY += 2;
    }
}
