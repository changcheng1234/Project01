package com.amarsoft.chang;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author chengchang
 * @create 2020/4/19/2:08 下午
 */
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive (ArrayList<Integer> list){
//        从红包中抽取一个给自己
        int index = new Random().nextInt(list.size());
//        根据索引，从几何中删除元素
        int delta = list.remove(index);
        //当前有多少钱
        int money = super.getMoney();
        super.setMoney(money+delta);
    }
}
