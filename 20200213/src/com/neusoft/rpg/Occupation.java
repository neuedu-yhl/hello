package com.neusoft.rpg;

import java.util.Random;

class Occupation {                //用随机数生成属性的函数
    private int strength,agile,health,talen,wisdom;
    public void shuxing(Character m) {    //调用character方法  用occupy与字符串匹配
        Random r=new Random();
        if (m.occupy.equals("战士")) {
            strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        if (m.occupy.equals("弓箭手")) {
        	strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        if (m.occupy.equals("刺客")) {
        	strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        if (m.occupy.equals("骑士")) {
        	strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        if (m.occupy.equals("牧师")) {
        	strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        if (m.occupy.equals("召唤师")) {
        	strength = r.nextInt(9999)+30;
            health = r.nextInt(9999)+20;
            talen = r.nextInt(9999);
            wisdom = r.nextInt(9999);
            agile = r.nextInt(9999);
        }
        System.out.println("力量:         "+strength);
        System.out.println("敏捷:         "+agile);
        System.out.println("体力:         "+health);
        System.out.println("智力:         "+talen);
        System.out.println("智慧:         "+wisdom);
    }

}
