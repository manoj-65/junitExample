package com.ty;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculaterTest {
	@Test
	public void addTest() {
		int input1 = 10;
		int input2 = 20;
		int execpectedOutPut = 30;
		int acutalOutPut = new Calculater().add(input1, input2);
		assertEquals(execpectedOutPut, acutalOutPut);

	}

	@Test
	public void subTest() {
		int input1 = 10;
		int input2 = 20;
		int execpectedOutPut = -10;
		int acutalOutPut = new Calculater().sub(input1, input2);
		assertEquals(execpectedOutPut, acutalOutPut);

	}

	@Test
	public void mulTest() {
		int input1 = 10;
		int input2 = 20;
		int execpectedOutPut = 200;
		int acutalOutPut = new Calculater().mul(input1, input2);
		assertEquals(execpectedOutPut, acutalOutPut);

	}

	@Test
	public void divPosTest() {
		int input1 = 100;
		int input2 = 20;
		int execpectedOutPut = 5;
		int acutalOutPut = new Calculater().div(input1, input2);
		assertEquals(execpectedOutPut, acutalOutPut);

	}

	@Test
	public void divNegTest() {
		int input1 = 100;
		int input2 = 0;

		assertThrows(ArithmeticException.class, () -> {
			new Calculater().div(input1, input2);
		});

	}
}
