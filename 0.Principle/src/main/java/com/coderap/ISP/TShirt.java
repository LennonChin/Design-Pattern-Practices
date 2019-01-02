package com.coderap.ISP;

/**
 * @program: Design-Pattern-Practices
 * @description: T恤
 * @author: Lennon Chin
 * @create: 2019/01/01 12:01:26
 */
public class TShirt implements IClothes {
	
	private Integer id;
	private String name;
	private Double price;
	
	public TShirt(Integer id, String name, Double price) {
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
		return "TShirt{" +
				"id=" + id +
				", name='" + name + '\'' +
				", price=" + price +
				'}';
	}
}
