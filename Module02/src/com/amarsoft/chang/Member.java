package com.amarsoft.chang;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author chengchang
 * @create 2020/4/19/2:08 ����
 */
public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive (ArrayList<Integer> list){
//        �Ӻ���г�ȡһ�����Լ�
        int index = new Random().nextInt(list.size());
//        �����������Ӽ�����ɾ��Ԫ��
        int delta = list.remove(index);
        //��ǰ�ж���Ǯ
        int money = super.getMoney();
        super.setMoney(money+delta);
    }
}
