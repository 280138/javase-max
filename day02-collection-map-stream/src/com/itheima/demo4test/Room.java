package com.itheima.demo4test;


import java.util.*;

public class Room {
    //1、造牌 2、洗牌 3、发牌 4、看牌  5、排序
    private List<Card> allCards = new ArrayList<>();
    //初始化54张牌
    {
        //点数
        String[] sizes = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        //花色
        String[] colors = {"♠","♥","♣","♦"};
        //结合点数和花色成为牌对象
        int nums = 0;
        for (String size : sizes) {
            nums++;
            for (String color : colors) {
                //创建牌对象
                Card card = new Card(size,color,nums);//局部变量：只在声明它们的 方法或代码块 内可见
                allCards.add(card);
            }
        }
//        allCards.add(new Card("","小王"));
//        allCards.add(new Card("","大王"));
        Collections.addAll(allCards, new Card("","小王",++nums),new Card("","大王",++nums));
        System.out.println("造牌后" + allCards);
    }
    public void start(){
        //洗牌
        Collections.shuffle(allCards);
        System.out.println("洗牌后:" + allCards);

        //发牌
        Map<String, List<Card>> players = new HashMap<>();

        List<Card> zyc = new ArrayList<>();
        players.put("zyc",zyc);
        List<Card> zwm = new ArrayList<>();
        players.put("zwm",zwm);
        List<Card> lhh = new ArrayList<>();
        players.put("lhh",lhh);

        for (int i = 0; i < allCards.size() - 3; i++) {
            Card card = allCards.get(i);
            if(i % 3 == 0){
                zwm.add(card);
            }else if(i % 3 == 1){
                lhh.add(card);
            }else{
                zyc.add(card);
            }
        }

        //最后三张底牌
        //subList()截取，左闭右开
        List<Card> lastCards = allCards.subList(allCards.size() - 3, allCards.size());
        //抢地主:直接把集合倒给玩家
        zyc.addAll(lastCards);

        //排序
        sortCards(zyc);
        sortCards(zwm);
        sortCards(lhh);

        //看牌
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    private void sortCards(List<Card> cards) {
        Collections.sort(cards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return o2.getNum() - o1.getNum();
            }
        });
    }
}
