package com.coderap.DIP;

/**
 * @program: Design-Pattern-Practices
 * @description: 裤子
 * @author: Lennon Chin
 * @create: 2018/10/01 16:10:07
 */
public class Trousers implements IClothes {
	
	private Integer id;
	private String name;
	private Double price;
	
	public Trousers(Integer id, String name, Double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public Integer getId() {
		return this.id;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public Double getPrice() {
		return this.price;
	}
	
	@Override
	public String dressedIn() {
		return "试穿了" + this.name;
	}
	
	@Override
	public String toString() {
		return "Trousers{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
