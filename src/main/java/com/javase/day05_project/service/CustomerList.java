package com.javase.day05_project.service;

import com.javase.day05_project.bean.Customer;

/**
 * ClassName:CustomerList
 * Package:com.javase.day05_project.service
 * Description:
 *
 * @date:2020/7/23 9:35
 * @author:zh
 */
public class CustomerList {

    private Customer[] customers;

    private int total;//数组存储个数

    /**
     * 初始化数组长度
     * @param total
     */
    public CustomerList(int total) {
        customers=new Customer[total];
    }
    /**
     * 将指定的客户添加到数组中
     */
    public boolean addCustomer(Customer customer){
        if(total>=customers.length){
            return  false;
        }
        customers[total++]=customer;
        return true;
    }

    /**
     * 修改指定位置的索引信息
     */
    public boolean replaceCustomer(int index,Customer customer){
        if(index>=total || index<0){
            return false;
        }
        customers[index]=customer;
        return true;
    }
    /**
     * 删除指定索引位置上的客户
     */
    public boolean deleteCustomer(int index){
        if(index<0 || index>total){
           return false;
        }
        for(int i=index;i<total-1;i++){
            customers[i]=customers[i+1];
        }
        //最后一个需制空
        customers[--total]=null;
        return true;
    }
    /**
     * 获取所有的客户信息
     */
    public Customer[] getAllCustomers(){
        Customer[] customers = new Customer[total];
        for (int i = 0; i < customers.length; i++) {
            customers[i]=this.customers[i];
        }
        return customers;
    }

    /**
     * 获取指定位置的客户
     */
    public  Customer getCustomer(int index){
        if(index<0 || index>=total){
            return null;
        }
        return customers[index];
    }

    /**
     * 获取客户的数量
     */
    public int  getTotal(){
        return total;
    }
}
