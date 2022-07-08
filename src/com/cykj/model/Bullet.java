package com.cykj.model;

import com.cykj.GameUtil.ImageData;


public class Bullet extends FlyObj{
    public Bullet(int x,int y) {
        speed = 10;
        bufferedImage = ImageData.heroBullet;
        width = bufferedImage.getWidth();
        height = bufferedImage.getHeight();
        posX = x;
        posY = y;
    }
    @Override
    public void move() {
        posY -= speed;
    }
}
