package com.cykj.model;

import com.cykj.GameUtil.ConstUtil;
import com.cykj.GameUtil.ImageData;

import java.util.Random;

public class Bee extends FlyObj {
    int direction = 1;//移动方向
    public Bee(){
        speed = 4;
        bufferedImage = ImageData.bee;
        width = bufferedImage.getWidth();
        height = bufferedImage.getHeight();
        posX = new Random().nextInt(ConstUtil.GAME_WIDTH - width);
        posY = - height;
    }

    @Override
    public void move() {
        //表示方向,碰到边界换方向
        posY += speed;
        if (posX > ConstUtil.GAME_WIDTH -width || posX < 0){
            direction *= -1;
        }
        posX += direction * speed;

    }
}
