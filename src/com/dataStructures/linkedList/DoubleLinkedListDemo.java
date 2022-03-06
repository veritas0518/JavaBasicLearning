package com.dataStructures.linkedList;

/**
 * @ClassName: DoubleLinkedList
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2022/1/22 20:59
 **/

public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        System.out.println("双向链表的功能测试");
        HeroNode2 hero1 = new HeroNode2(1, "宋江", "及时雨");
        HeroNode2 hero2 = new HeroNode2(2, "卢俊义", "玉麒麟");
        HeroNode2 hero3 = new HeroNode2(3, "吴用", "智多星");
        HeroNode2 hero4 = new HeroNode2(4, "林冲", "豹子头");

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(hero1);
        doubleLinkedList.add(hero2);
        doubleLinkedList.add(hero3);
        doubleLinkedList.add(hero4);

        doubleLinkedList.list();

        //修改
        HeroNode2 newHeroNode = new HeroNode2(4,"公孙胜","入云龙");
        doubleLinkedList.update(newHeroNode);
        System.out.println("修改后的双向链表");
        doubleLinkedList.list();

        //删除
        doubleLinkedList.deleteNode(3);
        System.out.println("删除后的双向链表");
        doubleLinkedList.list();
    }
}

class DoubleLinkedList {
    //先初始化一个头结点，头结点不要动，也不存放具体的数据
    private HeroNode2 head = new HeroNode2(0, "", "");

    public HeroNode2 getHead() {
        return head;
    }

    //遍历双向链表的方法
    public void list() {
        //先判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //因为头结点不能动，所以需要一个辅助变量来进行遍历
        HeroNode2 temp = head.next; //指向head节点后一个节点，如果没有的话，就证明链表是空的
        while (true) {
            //判断是否到链表最后，temp代表的是一个节点，如果为null，则证明没有这个节点，而不是判断下一个节点是否为空
            if (temp == null) {
                break;
            }
            //输出节点的信息
            System.out.println(temp);
            //将temp后移
            temp = temp.next;
        }
    }

    //添加一个节点到双向链表的最后
    public void add(HeroNode2 heroNode) {
        HeroNode2 temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        //形成一个双向链表
        temp.next = heroNode;
        heroNode.pre = temp;
    }

    //修改一个节点的内容，可以看到双向链表的节点内容修改和前面的单向链表一样，只是节点的类型有所改变
    public void update(HeroNode2 newNode) {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //找到需要修改的节点，根据no编号
        //先定义一个辅助变量
        HeroNode2 temp = head.next;
        boolean flag = false; //表示是否找到该节点
        while (true) {
            if (temp == null) {
                break; //已经遍历完真的链表了
            }
            if (temp.no == newNode.no) {
                //找到
                flag = true;
                break;
            }
            temp = temp.next;
        }
        //根据flag判断是否找到要修改耳朵节点
        if (flag) {
            temp.name = newNode.name;
            temp.nickname = newNode.nickname;
        } else {
            //没有找到
            System.out.printf("没有找到编号%d的节点", newNode.no);
        }
    }

    //从双向链表中删除一个节点
    //说明：1.对于双向链表，我们可以直接找到待删除的这个节点，而不需要找到其前一个节点
    //2.找到后自我删除即可
    public void deleteNode(int no) {

        //判断当前链表是否为空
        if (head.next == null) {
            System.out.println("链表为空！不能删除");
            return;
        }

        HeroNode2 temp = head.next; //直接从第一个节点开始找就行
        boolean flag = false; //标识是否找到待删除节点的前一个节点
        while (true) {
            if (temp == null) {
                System.out.println("找不到需要删除的节点，已经到链表最后！");
                break;
            }
            if (temp.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag) { //找到
            //可以删除
            temp.pre.next = temp.next;
            //如果是最后一个节点就不需要执行这句话，否则会出现空指针异常
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.printf("要删除的%d节点不存在\n", no);
        }
    }
}

class HeroNode2 {
    public int no;
    public String name;
    public String nickname;
    public HeroNode2 next; //指向下一个节点，默认为null
    public HeroNode2 pre; //指向前一个节点,默认为null

    public HeroNode2(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    //为了显示方便，重写toString方法

    @Override
    public String toString() {
        return "HeroNode{" + "no=" + no + ", name='" + name + ", nickname='" + nickname + '}';
    }
}