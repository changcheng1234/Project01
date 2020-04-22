package com.amarsoft.chang;

import java.util.ArrayList;

/**
 * @author chengchang
 * @create 2020/4/19/9:55 ����
 */
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney , int count) throws Exception {
        //���ڴ洢���ĺ��
        ArrayList<Integer> redList = new ArrayList<>();
        //ʣ����
        int leftMoney = super.getMoney();
        if(leftMoney<totalMoney){
            throw new Exception("����");
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
