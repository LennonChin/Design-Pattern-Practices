package com.coderap.ISP;

/**
 * @program: Design-Pattern-Practices
 * @description: 服务操作
 * @author: Lennon Chin
 * @create: 2019/01/01 12:04:01
 */
public interface ServiceAction {
    // 接待顾客
    void receiveCustomer(Customer customer);

    // 介绍商品
    void introduceClothesInfo(Customer customer, IClothes iClothes);

    // 结算商品
    void balance(IClothes clothes);
}
