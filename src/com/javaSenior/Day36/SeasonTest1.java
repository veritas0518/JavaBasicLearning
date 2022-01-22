package com.javaSenior.Day36;

/**
 * @ClassName: SeasonTest1
 * @Description: 使用enum关键字定义枚举类
 * @Author: TianXing.Xue
 * @Date: 2021/8/1 14:25
 * @Version: 1.0
 * <p>
 * 说明：定义的枚举类
 **/
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);
        //toString()
        System.out.println(summer.toString());

        //values
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
            values[i].show();
        }

        //valueOf(String objName):返回枚举类中对象名是objName的对象
        //如果没有objName的枚举类对象，则抛出异常
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
        winter.show();
    }
}

interface Info {
    void show();
}

enum Season1 implements Info {
    //1.提供当前枚举类的对象，多个对象之间用","隔开，末尾对象";"结束
    SPRING("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("春天方法被调用了");
        }
    },
    SUMMER("夏天", "夏日炎炎") {
        @Override
        public void show() {
            System.out.println("夏天方法被调用了");
        }
    },
    AUTUMN("秋天", "秋高气爽") {
        @Override
        public void show() {
            System.out.println("秋天方法被调用了");
        }
    },
    WINTER("冬天", "冰天雪地") {
        @Override
        public void show() {
            System.out.println("冬天方法被调用了");
        }
    };

    //
    private final String seasonName;
    private final String seasonDec;

    private Season1(String seasonName, String seasonDec) {
        this.seasonName = seasonName;
        this.seasonDec = seasonDec;
    }


    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDec() {
        return seasonDec;
    }

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}