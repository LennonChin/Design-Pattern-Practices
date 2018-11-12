package com.coderap.SRP;

/**
 * 单一职责原则
 *
 * 定义：一个类只负责一个功能领域中的相应职责。
 * 单一职责原则将不同的职责分离到单独的类，每一个职责都是一个变化的中心。
 * 优点：降低类的复杂度；提高类的可读性，提高系统的可维护性；降低变更引起的风险（降低对其他功能的影响）。
 */

import org.junit.Test;

/**
 * @program: Design-Pattern-Practices
 * @description: 单一职责原则测试
 * @author: Lennon Chin
 * @create: 2018/11/13 00:06:50
 */
public class SRPTest {
	
	@Test
	public void test1() {
		Waitress lucy = new Waitress("Lucy");
		Customer tom = new Customer("Tom");
		lucy.receiveCustomer(tom);
		
		TShirt tShirt = new TShirt(1, "MUJI T-Shirt", 199d);
		lucy.introduceClothesInfo(tom, tShirt);
		
		// lucy.balance(tShirt);
	}
	
	@Test
	public void test2() {
		Waitress lucy = new Waitress("Lucy");
		Customer tom = new Customer("Tom");
		lucy.receiveCustomer(tom);
		
		TShirt tShirt = new TShirt(1, "MUJI T-Shirt", 199d);
		lucy.introduceClothesInfo(tom, tShirt);
		
		Counter marry = new Counter("Marry");
		marry.balance(tShirt);
	}
}
