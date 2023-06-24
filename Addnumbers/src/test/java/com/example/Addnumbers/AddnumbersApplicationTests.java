package com.example.Addnumbers;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


@SpringBootTest
class AddnumbersApplicationTests {

	@Test
	public void testAddition() {
		int a = 5;
		int b = 7;
		int expected = 12;
		Model model = new Model(a,b);
		Add addObject = new Add();
		int result = addObject.add(model);
		Assertions.assertEquals(expected, result);
	}
}
