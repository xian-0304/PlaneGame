package com.cykj.model;

import java.awt.image.BufferedImage;

public abstract class FlyObj {
    protected int speed;
    protected BufferedImage bufferedImage;
    protected int posX;
    protected int posY;

    public int getSpeed() {return speed;}

    public void setSpeed(int speed) {this.speed = speed;}

    protected int width;
    protected int height;


    public abstract void move();

    public BufferedImage getBufferedImage() {return bufferedImage;}

    public void setBufferedImage(BufferedImage bufferedImage) {this.bufferedImage = bufferedImage;}

    public int getPosX() {return posX;}

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
