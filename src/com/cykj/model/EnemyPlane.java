package com.cykj.model;

import com.cykj.GameUtil.ConstUtil;
import com.cykj.GameUtil.ImageData;

import java.util.Random;

public class EnemyPlane extends FlyObj {
    public EnemyPlane(){
        speed = 3;
        width = ImageData.enemyPlane.getWidth();
        height = ImageData.enemyPlane.getHeight();
        posX = new Random().nextInt(ConstUtil.GAME_WIDTH - width);
        posY = - height;
    }

    @Override
    public void move() {

        posY += speed;
    }
}
