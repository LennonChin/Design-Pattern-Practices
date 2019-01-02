package com.coderap.ISP;

/**
 * @program: Design-Pattern-Practices
 * @description: 接待员类
 * @author: Lennon Chin
 * @create: 2019/01/01 12:10:26
 */
public class Waitress implements ReceiveAction {

    private String name;

    public Waitress(String name) {
        this.name = name;
    }

    @Override
    public void receiveCustomer(Customer customer) {
        System.out.println(this.name + "接待了顾客：" + customer);
    }

    @Override
    public void introduceClothesInfo(Customer customer, IClothes iClothes) {
        System.out.println(this.name + "向顾客：" + customer + "，介绍了：" + iClothes);
    }
}
