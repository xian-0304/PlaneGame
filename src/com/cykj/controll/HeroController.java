package com.cykj.controll;

import com.cykj.GameUtil.ConstUtil;
import com.cykj.GameUtil.ImageData;
import com.cykj.model.HeroPlane;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HeroController extends KeyAdapter {
    public static HeroPlane hero;


    public HeroController(HeroPlane hero){
        this.hero = hero;
    }
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case (KeyEvent.VK_A) -> {
                if (hero.getPosX() >= 20 )
                    hero.setPosX(hero.getPosX() - hero.getSpeed());
            }
            case (KeyEvent.VK_D) -> {
                if( hero.getPosX() <= ConstUtil.GAME_WIDTH - hero.getWidth()-40)
                    hero.setPosX(hero.getPosX()+hero.getSpeed());
            }
            case (KeyEvent.VK_W) -> {
                if (hero.getPosY() >= hero.getHeight())
                    hero.setPosY(hero.getPosY() - hero.getSpeed());
            }
            case (KeyEvent.VK_S) -> {
                if (hero.getPosY() <= ConstUtil.GAME_HEIGHT - hero.getHeight()-40)
                    hero.setPosY(hero.getPosY() + hero.getSpeed());
            }
        }
//        if (e.getKeyCode()=='A' ||e.getKeyCode()=='a') { //左移动
//            if (hero.getPosX() >= 10 && hero.getPosX() <= ConstUtil.GAME_WIDTH - hero.getWidth())
//                hero.setPosX(hero.getPosX() - hero.getSpeed());
//        }
//        if (e.getKeyCode()=='S'||e.getKeyCode()=='s') { //下移动
//            if (hero.getPosY() >= 10 && hero.getPosY() <= ConstUtil.GAME_HEIGHT - hero.getHeight()-40)
//                hero.setPosY(hero.getPosY() + hero.getSpeed());
//        }
//        if (e.getKeyCode()=='W'||e.getKeyCode()=='w') { //上移动
//            if (hero.getPosY() >= 20 && hero.getPosY() <= ConstUtil.GAME_HEIGHT - hero.getHeight()-20)
//                hero.setPosY(hero.getPosY() - hero.getSpeed());
//        }
//        if (e.getKeyCode()=='D'||e.getKeyCode()=='d'){ //右移动
//            if(hero.getPosX() >= -hero.getWidth() && hero.getPosX() <= ConstUtil.GAME_WIDTH - hero.getWidth()-40)
//                hero.setPosX(hero.getPosX()+hero.getSpeed());
//        }
    }
}
