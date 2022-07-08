package com.cykj.GameUtil;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
/*
* GamePanel代码冗余
* 重构ImageData类加载图片
* 企业中不能这样子推倒重构，盲目写代码
* 构建项目框架
* 图片对象的调用
* */
public class ImageData {
    //加载图像,静态对象
    public static BufferedImage heroImage;
    public static BufferedImage heroImage2;
    public static BufferedImage bgImage;
    public static BufferedImage enemyPlane;
    public static BufferedImage heroBullet;
    public static BufferedImage enemyBullet;
    public static BufferedImage bee;
    public static BufferedImage bombAward;
    public static BufferedImage bombBullet;
    //静态代码块，类直接调用
    static {
        try {
            heroImage= ImageIO.read(new File("greyImage/2-heroPrimary/hero1_0.png"));
            heroImage2= ImageIO.read(new File("greyImage/2-heroPrimary/hero1_1.png"));
            bgImage= ImageIO.read(new File("greyImage/1-bg/background.png"));
            enemyPlane = ImageIO.read(new File("greyImage/4-enemyPrimary/enemyPlane1_1.png"));
            heroBullet = ImageIO.read(new File("greyImage/8-bullets/heroBullet.png"));
            enemyBullet = ImageIO.read(new File("greyImage/8-bullets/enemyBullet.png"));
            bee = ImageIO.read(new File("greyImage/7-awardFlying/bee.png"));
            bombAward = ImageIO.read(new File("greyImage/7-awardFlying/atomBomb.png"));
            bombBullet = ImageIO.read(new File("greyImage/7-awardFlying/atomBomb1.png"));
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
