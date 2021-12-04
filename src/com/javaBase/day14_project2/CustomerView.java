package com.javaBase.day14_project2;

/**
 * @Descripton: 主模块，负责菜单的显示和处理用户的操作
 * @Author:薛天行 Email:1450985307@qq.com or github.com/veritas0518
 * @Belong project:
 * @Belong package:
 * @Date:Create in 15:40 2021/7/2
 */

public class CustomerView {
    CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("小薛", '男', 21, "13890478597", "13450869485@qq.com");
        customerList.addCustomer(customer);
    }

    //显示客户信息管理软件界面的方法
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("\n-------------------客户信息管理软件--------------------");
            System.out.println("                     1.添加客户                       ");
            System.out.println("                     2.修改客户                       ");
            System.out.println("                     3.删除客户                       ");
            System.out.println("                     4.客户列表                       ");
            System.out.println("                     5.退 出\n                       ");
            System.out.println("                     请选择(1-5):                     ");
            char menu = CMUitility.readMenuSelection();
            switch (menu) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.print("确认是否退出(Y/N)");
                    char isExit = CMUitility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
            }
        }
    }

    //添加客户的操作
    public void addNewCustomer() {
        System.out.println("\n-------------------添加客户--------------------");
        System.out.print("姓名：");
        String name = CMUitility.readString(10);
        System.out.print("性别：");
        char gender = CMUitility.readChar();
        System.out.print("年龄：");
        int age = CMUitility.readInt();
        System.out.print("电话：");
        String phone = CMUitility.readString(13);
        System.out.print("邮箱：");
        String eMail = CMUitility.readString(30);
        //将上述数据封装到对象中
        Customer customer = new Customer(name, gender, age, phone, eMail);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess = true) {
            System.out.println("\n-------------------添加完成--------------------");
        } else {
            System.out.println("\n------------客户目录已满，添加失败----------------");
        }
    }

    //修改客户的操作
    public void modifyCustomer() {
        System.out.println("\n-------------------修改客户--------------------");
        Customer cust;
        int number;
        for (; ; ) {
            System.out.print("请选择修改客户的编号(-1退出)");
            number = CMUitility.readInt();

            if (number == -1) {
                return;
            }

            cust = customerList.getCustomer(number - 1);

            if (cust == null) {
                System.out.println("无法找到指定的客户！");
            } else {
                //找到了相应编号的客户
                break;
            }
        }

        //修改客户信息
        System.out.print("姓名(" + cust.getName() + "):");
        String name = CMUitility.readString(10, cust.getName());

        System.out.print("性别(" + cust.getGender() + "):");
        char gender = CMUitility.readChar(cust.getGender());

        System.out.print("年龄(" + cust.getAge() + "):");
        int age = CMUitility.readInt(cust.getAge());

        System.out.print("电话(" + cust.getPhone() + "):");
        String phone = CMUitility.readString(13, cust.getPhone());

        System.out.print("邮箱(" + cust.getEmail() + "):");
        String eMail = CMUitility.readString(30, cust.getEmail());

        Customer newCust = new Customer(name, gender, age, phone, eMail);

        boolean isReplaced = customerList.replaceCustomer(number , newCust);
        //这里的 number-1 是因为程序员是从 0 开始的，而客户是从 1 开始的
        if (isReplaced) {
            System.out.println("\n-------------------修改完成--------------------");
        } else {
            System.out.println("\n-------------------修改失败--------------------");
        }
    }

    //删除客户的操作
    public void deleteCustomer() {
        System.out.println("\n-------------------删除客户-------------------");
        int number;
        for (; ; ) {
            System.out.print("请选择待删除客户的编号(-1退出)：");
            number = CMUitility.readInt();

            if (number == -1) {
                return;
            }
            Customer customer = customerList.getCustomer(number - 1);
            if (customer == null) {
                System.out.print("无法找到指定的客户！");
            } else {
                break;
            }
        }
        System.out.print("确认是否删除(Y/N):");
        char isDelete = CMUitility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean deleteSuccess = customerList.deleteCustomer(number - 1);
            if (deleteSuccess) {
                System.out.println("\n-------------------删除成功-------------------");
            } else {
                System.out.println("\n-------------------删除失败-------------------");
            }
        } else {
            return;
        }
    }

    //显示客户列表的操作
    public void listAllCustomer() {
        System.out.println("\n-------------------客户列表--------------------");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录!");

        } else {
            System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t邮箱");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                Customer cust = custs[i];
                System.out.println((i + 1) + "\t\t" + cust.getName() + "\t\t" + cust.getGender() + "\t\t" + cust.getAge() +
                        "\t\t" + cust.getPhone() + "\t" + cust.getEmail());
            }
        }


        System.out.println("--------------------客户列表完成------------------");
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }
}
