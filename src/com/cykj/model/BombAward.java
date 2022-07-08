package com.cykj.model;

import com.cykj.GameUtil.ConstUtil;
import com.cykj.GameUtil.ImageData;

import java.util.Random;

public class BombAward extends FlyObj{
    public BombAward() {
        speed = 4;
        bufferedImage = ImageData.bombAward;
        width = bufferedImage.getWidth();
        height = bufferedImage.getHeight();
        posX = new Random().nextInt(ConstUtil.GAME_WIDTH - width);
        posY = - height;
    }

    @Override
    public void move() {
        posY += speed;
    }
}
