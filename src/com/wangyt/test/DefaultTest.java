package com.wangyt.test;

public class DefaultTest implements DefaultTestInterface, DefaultTestInterface2 {

	@Override
	public void test() {
		DefaultTestInterface.super.test();
	}

}
