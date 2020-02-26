package com.wangyt.test;

public interface DefaultTestInterface2 {

	default public void test() {
		System.out.println( "DefaultTestInterface2 test() " );
	}
}
