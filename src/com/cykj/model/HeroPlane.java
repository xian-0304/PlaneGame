package com.cykj.model;

import com.cykj.GameUtil.ConstUtil;
import com.cykj.GameUtil.ImageData;

public class HeroPlane extends FlyObj {
    private int fireState = 1;

    public int getFireState() {
        return fireState;
    }

    public void setFireState(int fireState) {
        this.fireState = fireState;
    }

    public HeroPlane(){
        speed = 30;
        bufferedImage = ImageData.heroImage;
        width = bufferedImage.getWidth();
        height = bufferedImage.getHeight();
        posX = (ConstUtil.GAME_WIDTH - ImageData.heroImage.getWidth()) / 2;
        posY = ConstUtil.GAME_HEIGHT - ImageData.heroImage.getHeight() - 40;
    }


    @Override
    public void move() {
    }
}
