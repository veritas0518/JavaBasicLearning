package com.dataStructures.linkedList;

/**
 * @ClassName: Josephu
 * @Description:
 * @Author: TianXing.Xue
 * @Date: 2022/1/22 22:31
 **/

public class Josephu {
    public static void main(String[] args) {
        CircleSingleLinkedList circleSingleLinkedList = new CircleSingleLinkedList();
        circleSingleLinkedList.addBoy(25); //加入五个小孩节点
        circleSingleLinkedList.showBoy();

        //测试小孩出圈是否正确
        circleSingleLinkedList.countBoy(1,2,25);
    }
}

//创建环形的单向链表
class CircleSingleLinkedList {
    //先创建一个first节点，当前没有编号
    private Boy first = null;

    //t添加小孩的节点，构建成环形链表
    public void addBoy(int number) {
        if (number < 1) {
            System.out.println("number值不正确");
            return;
        }
        Boy curBoy = null; //辅助指针，帮助构建环形链表
        for (int i = 1; i <= number; i++) {
            //根据编号创建小孩节点
            Boy boy = new Boy(i);
            //如果是第一个小孩
            if (i == 1) {
                first = boy;
                first.setNext(first); //这句话就构成环状了
                curBoy = first; //让curBoy指向第一个小孩，因为first不能动
            } else {
                curBoy.setNext(boy);
                boy.setNext(first);
                curBoy = boy;
            }
        }
    }

    //遍历当前环形链表
    public void showBoy() {
        if (first == null) {
            System.out.println("链表为空，没有小孩");
            return;
        }
        Boy curBoy = first;
        while (true) {
            System.out.printf("小孩的编号%d\n", curBoy.getNo());
            if (curBoy.getNext() == first) { //说明已经遍历完毕
                break;
            }
            curBoy = curBoy.getNext();
        }
    }

    //根据用户的输入，计算出小孩出圈的顺序

    /**
     * @param startNo 表示从第几个小孩开始数数
     * @param countNo 表示数几下
     * @param nums    表示最初有多少小孩在圈中
     */
    public void countBoy(int startNo, int countNo, int nums) {
        //先对数据进行校验
        if (first == null || startNo < 1 || startNo > nums) {
            System.out.println("参数输入有误，请重新输入");
            return;
        }
        //创建一个辅助指针，帮助完成小孩出圈
        Boy helper = first;
        while (true) {
            if (helper.getNext() == first) { //说明helper指向了最后一个节点
                break;
            }
            helper = helper.getNext();
        }
        //小孩报数前，先让first和helper移动 startNo - 1 次
        for (int i = 1; i <= startNo - 1; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }

        while (true) {
            if (helper == first) { //说明圈中只有一个节点
                break;
            }
            //当小孩报数时，让first和helper同时移动 countNo - 1 次
            for (int i = 1; i <= countNo - 1; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            //这时first指向的节点，就是要出圈的小孩节点
            System.out.printf("小孩%d出圈\n",first.getNo());
            //将first指向的小孩节点出圈
            first = first.getNext();
            helper.setNext(first);
        }
        System.out.printf("最后留在圈中的小孩编号是%d\n",first.getNo());

    }
}

//先创建一个Boy类，表示一个节点
class Boy {
    private int no; //编号
    private Boy next;

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}
