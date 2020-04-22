package com.amarsoft.chang;

import java.util.ArrayList;

/**
 * @author chengchang
 * @create 2020/4/20/8:41 下午
 */
public class MainRedPacket {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager("群主",100);

        Member member1 = new Member("成员1",0);
        Member member2 = new Member("成员2",0);
        Member member3 = new Member("成员3",0);
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
