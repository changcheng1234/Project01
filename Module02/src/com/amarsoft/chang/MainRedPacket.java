package com.amarsoft.chang;

import java.util.ArrayList;

/**
 * @author chengchang
 * @create 2020/4/20/8:41 ����
 */
public class MainRedPacket {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager("Ⱥ��",100);

        Member member1 = new Member("��Ա1",0);
        Member member2 = new Member("��Ա2",0);
        Member member3 = new Member("��Ա3",0);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
        ArrayList<Integer> redList = manager.send(50, 3);
        member1.receive(redList);
        member2.receive(redList);
        member3.receive(redList);
        manager.show();
        member1.show();
        member2.show();
        member3.show();
    }
}
