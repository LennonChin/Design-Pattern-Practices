package com.coderap.DIP;

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
	
	public void setiClothes(IClothes iClothes) {
		this.iClothes = iClothes;
	}
	
	public void dressedIn() {
		System.out.println(this.name + this.iClothes.dressedIn());
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void dressedInTShirt() {
		System.out.println(this.name + "穿了T恤");
	}
	
	public void dressedInCoat() {
		System.out.println(this.name + "试穿了大衣");
	}
	
	public void dressedIn(IClothes iClothes) {
		System.out.println(this.name + iClothes.dressedIn());
	}
	
	@Override
	public String toString() {
		return "Customer{" +
				"name='" + name + '\'' +
				'}';
	}
}
