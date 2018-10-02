package com.coderap.DIP;

/**
 * 依赖倒置原则
 *
 * 定义：依赖倒转原则是程序要依赖于抽象接口，不要依赖于具体实现。简单的来说就是要求面向抽象进行编程，不要面向实现进行编程，这样就降低了客户与实现模块的耦合。
 * 高层模块不应该依赖低层模块，二者都应该依赖其抽象。
 * 抽象不应该依赖细节，细节应依赖于抽象。
 * 优点：可以减少类间的耦合性，提高系统稳定性，提高代码可读性和可维护性，可降低修改程序所造成的风险。
 */

import org.junit.Test;

/**
 * @program: Design-Pattern-Practices
 * @description: 依赖倒置原则测试类
 * @author: Lennon Chin
 * @create: 2018/10/02 16:05:01
 */
public class DIPTest {
	
	@Test
	public void test1() {
		Customer tom = new Customer("Tom");
		tom.dressedInTShirt();
		tom.dressedInCoat();
	}
	
	@Test
	public void test2() {
		Customer tom = new Customer("Tom");
		IClothes tShirt = new TShirt(1, "MUJI T-Shirt", 199d);
		IClothes coat = new Coat(2, "UNIQLO Coat", 499d);
		IClothes trousers = new Trousers(3, "Levi's Trousers", 299d);
		tom.dressedIn(tShirt);
		tom.dressedIn(coat);
		tom.dressedIn(trousers);
	}
}
