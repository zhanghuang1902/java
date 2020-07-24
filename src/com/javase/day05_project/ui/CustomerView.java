package com.javase.day05_project.ui;

import com.javase.day05_project.bean.Customer;
import com.javase.day05_project.service.CustomerList;

import java.util.Scanner;


/**
 * ClassName:CustomerView
 * Package:com.javase.day05_project.ui
 * Description:
 *
 * @date:2020/7/23 9:35
 * @author:zh
 */
public class CustomerView {
    private CustomerList customerList=new CustomerList(10);

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
    /**
     * 显示界面
     */
    public  void enterMainMenu(){
        boolean isFlag=true;
        while (isFlag){
            System.out.println("---------客户操作系统---------");
            System.out.println("1.       查询客户信息         ");
            System.out.println("2.       增加客户信息         ");
            System.out.println("3.       删除客户信息         ");
            System.out.println("4.       修改客户信息         ");
            System.out.println("5.       退出         ");
            System.out.println("请开始您的操作:");
            int i = new Scanner(System.in).nextInt();
            switch (i){
                case 1 :
                    System.out.println("查询客户信息");
                    queryCustomer();
                    break;
                case 2:
                    System.out.println("增加客户信息");
                    addCustomers();
                    break;
                case 3:
                    System.out.println("删除客户信息");
                    deleteCustomers();
                    break;
                case 4:
                    System.out.println("修改客户信息");
                    break;
                case 5:
                    exit();
                    isFlag=false;
                    break;
        }
        }
    }

    /**
     * 删除客户的信息
     */
    private void deleteCustomers() {
        System.out.println("请删除客户的编号");
        int i = new Scanner(System.in).nextInt();
        boolean b = customerList.deleteCustomer(i);
        if(b){
            System.out.println("删除客户信息成功");
        }else {
            System.out.println("删除客户信息失败,不存在该用户!请重新删除信息确认!");
            deleteCustomers();
        }

    }

    /**
     * 查询客户信息
     */
    private void queryCustomer() {
        Customer[] allCustomers = customerList.getAllCustomers();
        for (Customer customer : allCustomers) {
            System.out.println(customer.toString());
        }
    }

    /**
     * 增加客户信息
     */
    private void addCustomers() {
        Customer customer = new Customer();
        System.out.println("请输入用户姓名");
        String s = new Scanner(System.in).nextLine();
        customer.setName(s);
        System.out.println("请输入用户性别");
        String s1 = new Scanner(System.in).nextLine();
        customer.setGender(s1);
        System.out.println("请输入用户年龄");
        String s2 = new Scanner(System.in).nextLine();
        customer.setAge(s2);
        System.out.println("请输入用户手机号");
        String s3 = new Scanner(System.in).nextLine();
        customer.setPhone(s3);
        System.out.println("请输入用户邮箱");
        String s4 = new Scanner(System.in).nextLine();
        customer.setEmail(s4);
        customerList.addCustomer(customer);
        System.out.println("添加客户信息成功");
    }

    /**
     * 退出界面
     */
    public void exit(){
        System.out.println("退出系统成功");
    }
}
