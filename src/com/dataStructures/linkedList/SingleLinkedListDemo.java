package com.dataStructures.linkedList;

import java.util.Stack;

/**
 * @ClassName: SingleLinkedList
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2022/1/13 19:40
 **/

public class SingleLinkedListDemo {
    public static void main(String[] args) {
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero4);
        singleLinkedList.add(hero3);

        System.out.println("原来链表的情况");
        singleLinkedList.list();
        System.out.println("反转单链表");
        reverseList(singleLinkedList.getHead());
        singleLinkedList.list();

        System.out.println("测试逆序打印单链表");
        reversePrint(singleLinkedList.getHead());

        //修改之前显示链表
        System.out.println("修改之前显示链表");
        singleLinkedList.list();

        //测试修改节点的代码
        HeroNode newHeroNode = new HeroNode(2, "小鹿", "小三");
        singleLinkedList.update(newHeroNode);

        //修改之后显示链表
        System.out.println("修改之后显示链表");
        singleLinkedList.list();

        //删除一个节点
        singleLinkedList.deleteNode(1);
        singleLinkedList.deleteNode(4);
        System.out.println("删除之后显示链表");
        singleLinkedList.list();

        //测试求单链表有效节点的个数
        System.out.println("有效的节点个数为：" + getLength(singleLinkedList.getHead()));

        //新浪面试题测试
        HeroNode result = findLastNode(singleLinkedList.getHead(), 1);
        System.out.println("新浪面试题测试:result =" + result);
    }

    //使用方式二进行链表的逆序打印
    public static void reversePrint(HeroNode head) {
        if (head.next == null) {
            return; //空链表无法打印
        }
        //创建一个栈，将各个节点压入栈中
        Stack<HeroNode> stack = new Stack<>();
        HeroNode temp = head.next;
        //将链表的所有节点压入栈中
        while (temp != null) {
            stack.push(temp);
            temp = temp.next;
        }
        //将栈中的节点进行打印
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }

    }

    //将单链表进行反转
    public static void reverseList(HeroNode head) {
        //如果当前链表为空或者只有一个节点，就无需反转
        if (head.next == null || head.next.next == null) {
            return;
        }
        HeroNode temp = head.next;
        HeroNode nextNode = null; //指向当前节点的下一个节点，防止链表断了
        HeroNode reverseHead = new HeroNode(0, "", "");

        //遍历原来的链表，每遍历一个节点，就将其取出，并放在reverseHead的最前端
        while (temp != null) {
            nextNode = temp.next; //先保存当前节点的下一个节点
            temp.next = reverseHead.next; //将temp的下一个节点指向新的链表的最前端
            reverseHead.next = temp; //将temp连接到新的链表上
            temp = nextNode;
        }
        head.next = reverseHead.next;
    }

    //查找单链表中的倒数第k个结点【新浪面试题】
    //1.编写一个方法接收head节点，同时接收Index
    //2.index表示的是倒数index个节点
    //3、先把链表从头到尾遍历，得到链表的总长度 getLength
    //4.得到size后，从链表的第一个开始遍历，一共遍历(size-index个)，就可以得到了
    //5.如果找到了，则返回该节点，否则返回空
    public static HeroNode findLastNode(HeroNode head, int index) {
        //如果链表为空，返回null
        if (head.next == null) {
            return null; //没有找到
        }
        //第一次遍历，得到链表的长度
        int size = getLength(head);

        //第二次遍历 size-index位置，就是我们倒数的第k个节点
        //先做一个index的校验
        if (index <= 0 || index > size) {
            return null;
        }

        //定义一个辅助变量
        HeroNode temp = head.next;
        for (int i = 0; i < size - index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //方法：获取到单链表的节点的个数(如果是带头结点的链表需要不统计头结点)
    public static int getLength(HeroNode head) {
        if (head.next == null) { //空链表
            return 0;
        }
        int count = 0;
        //定义一个辅助变量，这里我们没有统计头结点
        HeroNode temp = head.next;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

//定义一个SingleLinkedList来管理所有的节点
class SingleLinkedList {
    //先初始化一个头结点，头结点不要动，也不存放具体的数据
    private HeroNode head = new HeroNode(0, "", "");

    public HeroNode getHead() {
        return head;
    }

    //添加节点到单向列表
    //思路：当不考虑编号的顺序时
    //1.找到当前链表的最后节点，即next指向null
    //2.将最后节点的next域指向新的节点
    public void add(HeroNode node) {
        //因为head节点不能动，因此我们需要一个辅助变量】
        HeroNode temp = head;
        //遍历链表，找到最后
        while (true) {
            //找到链表的最后
            if (temp.next == null) {
                break;
            }
            //如果没有找到，temp就后移
            temp = temp.next;
        }
        //当退出循环时，temp就指向了链表的最后
        temp.next = node;
    }

    //修改节点的信息，根据编号来修改，即no编号不能改
    //1.根据newNode的no来修改
    public void update(HeroNode newNode) {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //找到需要修改的节点，根据no编号
        //先定义一个辅助变量
        HeroNode temp = head.next;
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

    //删除节点
    //1.head节点不能动，因此需要一个temp辅助节点，找到待删除节点的前一个节点
    //2.在比较时，是temp.next.no和需要删除的节点的no进行比较
    public void deleteNode(int no) {
        HeroNode temp = head;
        boolean flag = false; //标识是否找到待删除节点的前一个节点
        while (true) {
            if (temp.next == null) {
                System.out.println("找不到需要删除的节点，已经到链表最后！");
                break;
            }
            if (temp.next.no == no) {
                //找到了待删除节点的前一个节点
                flag = true;
                break;
            }
            temp = temp.next;
        }

        if (flag) { //找到
            //可以删除
            temp.next = temp.next.next;
        } else {
            System.out.printf("要删除的%d节点不存在\n", no);
        }
    }

    //显示链表（遍历）
    public void list() {
        //先判断链表是否为空
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        //因为头结点不能动，所以需要一个辅助变量来进行遍历
        HeroNode temp = head.next; //指向head节点后一个节点，如果没有的话，就证明链表是空的
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
}

//创建一个HeroNode，每个HeroNode对象就是一个节点
class HeroNode {
    public int no;
    public String name;
    public String nickname;
    public HeroNode next; //指向下一个节点

    public HeroNode(int no, String name, String nickname) {
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
