package com.coderap.ISP;

/**
 * @program: Design-Pattern-Practices
 * @description: 结算员类
 * @author: Lennon Chin
 * @create: 2019/01/01 12:11:12
 */
public class Counter implements CountAction {

    private String name;

    public Counter(String name) {
        this.name = name;
    }

    @Override
    public void balance(IClothes clothes) {
        System.out.println(this.name + "结算商品：" + clothes + "，价格是：" + clothes.getPrice());
    }
}
