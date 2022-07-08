package com.cykj.model;

import com.cykj.GameUtil.ImageData;

public class BombBullet extends FlyObj{
    public BombBullet(int x, int y) {
        speed = 10;
        bufferedImage = ImageData.bombBullet;
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
