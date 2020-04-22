package com.amarsoft.chang;

import java.util.ArrayList;

/**
 * @author chengchang
 * @create 2020/4/19/9:55 上午
 */
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney , int count) throws Exception {
        //用于存储发的红包
        ArrayList<Integer> redList = new ArrayList<>();
        //剩余金额
        int leftMoney = super.getMoney();
        if(leftMoney<totalMoney){
            throw new Exception("余额不足");
        }
        super.setMoney(leftMoney-totalMoney);
        int avg = totalMoney/count;
        int mod = totalMoney%count;
        for (int i = 0; i < count - 1; i++) {
            redList.add(avg);
        }
        int last = avg+mod;
        redList.add(last);
        return redList;
    }
}
