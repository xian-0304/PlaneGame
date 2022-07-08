package com.cykj.controll;

import com.cykj.model.Bullet;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.GlyphMetrics;

public class CreateBulletListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(GameController.heroPlane.getFireState() == 1)
            GameController.herobulletList.add(new Bullet(GameController.heroPlane.getPosX(), GameController.heroPlane.getPosY()));
        else {
            for (int i = 0; i < GameController.heroPlane.getFireState(); i++) {
                GameController.herobulletList.add(new Bullet(GameController.heroPlane.getPosX()+50*i, GameController.heroPlane.getPosY()));
            }
        }
    }
}
