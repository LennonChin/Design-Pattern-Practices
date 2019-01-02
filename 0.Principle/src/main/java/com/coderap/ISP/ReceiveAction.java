package com.coderap.ISP;

/**
 * @program: Design-Pattern-Practices
 * @description: 接待操作
 * @author: Lennon Chin
 * @create: 2019/01/01 12:04:22
 */
public interface ReceiveAction {

    void receiveCustomer(Customer customer);

    void introduceClothesInfo(Customer customer, IClothes iClothes);
}
