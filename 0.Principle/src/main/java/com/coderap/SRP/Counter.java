package com.coderap.SRP;

/**
 * @program: Design-Pattern-Practices
 * @description: 结算员
 * @author: Lennon Chin
 * @create: 2018/11/13 00:24:10
 */
public class Counter {
	
	private String name;
	
	public Counter(String name) {
		this.name = name;
	}
	
	void balance(IClothes iClothes) {
		System.out.println(this.name + "结算商品：" + iClothes + "，价格是：" + iClothes.getPrice());
	}
}
