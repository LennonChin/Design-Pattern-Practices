package com.coderap.SRP;

/**
 * @program: Design-Pattern-Practices
 * @description: 服务员类
 * @author: Lennon Chin
 * @create: 2018/11/12 23:59:09
 */
public class Waitress {
	
	private String name;
	
	public Waitress(String name) {
		this.name = name;
	}
	
	void receiveCustomer(Customer customer) {
		System.out.println(this.name + "接待了顾客：" + customer);
	}
	
	void introduceClothesInfo(Customer customer, IClothes iClothes) {
		System.out.println(this.name + "向顾客：" + customer + "，介绍了：" + iClothes);
	}
}
