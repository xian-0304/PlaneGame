package com.cykj.model;

import com.cykj.GameUtil.ConstUtil;
import com.cykj.GameUtil.ImageData;

import java.util.Random;

public class Bee extends FlyObj {
    int direction = 1;//�ƶ�����
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
        //��ʾ����,�����߽绻����
        posY += speed;
        if (posX > ConstUtil.GAME_WIDTH -width || posX < 0){
            direction *= -1;
        }
        posX += direction * speed;

    }
}
