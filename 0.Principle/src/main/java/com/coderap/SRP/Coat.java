package com.coderap.SRP;

/**
 * @program: Design-Pattern-Practices
 * @description: 大衣
 * @author: Lennon Chin
 * @create: 2018/10/01 16:32:25
 */
public class Coat implements IClothes {
	
	private Integer id;
	private String name;
	private Double price;
	
	public Coat(Integer id, String name, Double price) {
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
		return "Coat{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
