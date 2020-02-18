package com.neusoft.rpg;

import java.util.Scanner;

public class Menu {
	public static void menu() {
        int[] human;
        int[] elf;
        int[] orcs;
        int[] dwarf;
        int[] element;
        human=new int[]{1,1,1,1,1,1};  //战士  弓箭手  刺客  骑士  牧师   召唤师
        elf=new int[]{0,0,1,1,1,1};
        orcs=new int[]{1,0,0,1,1,0};
        dwarf=new int[]{1,1,0,0,1,0};
        element=new int[]{0,0,0,0,1,1};
        String[] occupation ;          //字符串数组存放职业   可以通过数字来选择存放
        occupation=new String[]{"战士","弓箭手","刺客","骑士","牧师","召唤师"};
        Character me=new Character();
        System.out.println("请输入角色名称");
        Scanner name = new Scanner(System.in);
        me.name = name.next();
        System.out.println("请选择性别");
        System.out.println("1.男性            2.女性");
        Scanner sex = new Scanner(System.in);
        int ch1=sex.nextInt();
        switch (ch1){
            case 1: me.sex="男性"; break;
            case 2: me.sex="女性"; break;
        }
        System.out.println("种族选择");
        System.out.println("1.人类   2.精灵   3.兽人   4.矮人    5.元素");
        System.out.print("请选择种族");
        Scanner race = new Scanner(System.in);
        int ch2=race.nextInt();
        switch (ch2){            //swtich在选择种族时就显示可选择的职业
            case 1:{
                me.race="人类";
                System.out.println("你选择了"+me.race);
                System.out.print("此种族可选职业为");
                for(int i=0;i<6;i++)   //用for循环找出 之前设定好的 数组为1的输出
                {
                    if(human[i]==1)
                    {
                        System.out.println(i+"."+occupation[i]);  //当数组内部为1时输出当前序列的职业名称
                    }
                }

                System.out.print("请选择你的职业：");
                Scanner occ = new Scanner(System.in);
                int ch3=occ.nextInt();
                me.occupy=occupation[ch3];
                break;
            }
            case 2:{
                me.race="精灵";
                System.out.println("你选择了"+me.race);
                System.out.println("此种族可选职业为");
                for(int i=0;i<6;i++)
                {
                    if(elf[i]==1)
                    {
                        System.out.println(i+"."+occupation[i]);
                    }
                }

                System.out.print("请选择你的职业：");
                Scanner occ = new Scanner(System.in);
                int ch3=occ.nextInt();
                me.occupy=occupation[ch3];
                break;
            }
            case 3:{
                me.race="兽人";
                System.out.println("你选择了"+me.race);
                System.out.println("此种族可选职业为");
                for(int i=0;i<6;i++)
                {
                    if(orcs[i]==1)
                    {
                        System.out.println(i+"."+occupation[i]);
                    }
                }

                System.out.print("请选择你的职业：");
                Scanner occ = new Scanner(System.in);
                int ch3=occ.nextInt();
                me.occupy=occupation[ch3];
                break;
            }
            case 4:{
                me.race="矮人";
                System.out.println("你选择了"+me.race);
                System.out.println("此种族可选职业为");
                for(int i=0;i<6;i++)
                {
                    if(dwarf[i]==1)
                    {
                        System.out.println(i+"."+occupation[i]);
                    }
                }

                System.out.print("请选择你的职业：");
                Scanner occ = new Scanner(System.in);
                int ch3=occ.nextInt();
                me.occupy=occupation[ch3];
                break;
            }
            case 5:{
                me.race="元素";
                System.out.println("你选择了"+me.race);
                System.out.println("此种族可选职业为");
                for(int i=0;i<6;i++)
                {
                    if(element[i]==1)
                    {
                        System.out.println(i+"."+occupation[i]);
                    }
                }

                System.out.print("请选择你的职业：");
                Scanner occ = new Scanner(System.in);
                int ch3=occ.nextInt();
                me.occupy=occupation[ch3];
                break;
            }
        }
        System.out.println("生成你的角色");
        System.out.println("============================");
        System.out.println("名称：        "+me.name);
        System.out.println("性别：        "+me.sex);
        System.out.println("种族：        "+me.race);
        System.out.println("职业：        "+me.occupy);
        Occupation m=new Occupation();
        m.shuxing(me);
    }
}
