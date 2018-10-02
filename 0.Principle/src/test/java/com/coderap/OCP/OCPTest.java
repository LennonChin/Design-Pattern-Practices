package com.coderap.OCP;

import org.junit.Test;

/**
 * 开闭原则
 *
 * 定义：一个软件实体，如类、模块和函数应该对扩展开放，对修改关闭。
 * 用抽象构建框架，用实现扩展细节。
 * 优点：提高软件系统的可复用性及可维护性。
 */

/**
 * @program: Design-Pattern-Practices
 * @description: 开闭原则测试
 * @author: Lennon Chin
 * @create: 2018/10/01 16:11:32
 */
public class OCPTest {
	
	@Test
	public void test1() {
		IClothes tShirt = new TShirt(1, "MUJI T-Shirt", 199d);
		IClothes coat = new Coat(2, "UNIQLO", 499d);
		System.out.println(tShirt + "，价格：" + tShirt.getPrice());
		System.out.println(coat + "，价格：" + coat.getPrice());
	}
	
	/**
	 * 带有折扣的衣服价格
	 */
	@Test
	public void test2() {
		IClothes tShirt = new DiscountedTShirt(1, "MUJI T-Shirt", 199d);
		IClothes coat = new Coat(2, "UNIQLO", 499d);
		System.out.println("无折扣：" + coat + "，价格：" + coat.getPrice());
		System.out.println("折扣前：" + tShirt + "，价格：" + tShirt.getPrice());
		DiscountedTShirt discountedTShirt = (DiscountedTShirt) tShirt;
		discountedTShirt.setDiscount(0.8);
		System.out.println("折扣后：" + discountedTShirt + "，价格：" + discountedTShirt.getPrice() + "，原价：" + discountedTShirt.getOriginPrice());
	}
}
