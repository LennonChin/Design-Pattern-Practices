package com.coderap.LOD;

/**
 * @program: Design-Pattern-Practices
 * @description: 描述顾客的类
 * @author: Lennon Chin
 * @create: 2018/10/02 15:50:42
 */
public class Customer {
	private String name;
	private IClothes iClothes;
	
	public Customer(String name) {
		this.name = name;
	}
	
	public Customer(String name, IClothes iClothes) {
		this.name = name;
		this.iClothes = iClothes;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				'}';
	}
}

