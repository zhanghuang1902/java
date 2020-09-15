package com.compare;

/**
 * ClassName:Goods
 * Package:com.compare
 * Description:
 *
 * @date:2020/9/15 11:54
 * @author:zh
 */
public class Goods implements Comparable{

    private String name;

    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Goods() {
    }

    public Goods(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
       if(o instanceof Goods){
           Goods goods=(Goods)o;
           if(this.price>goods.price){
               return 1;
           }else if(this.price<goods.price){
               return -1;
           }else {
               return 0;
           }
       }
       throw new RuntimeException("传入参数不正确");
    }
}
