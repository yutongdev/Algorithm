package com.wangyt.test;

public interface DefaultTestInterface {

	default public void test() {
		System.out.println( "DefaultTestInterface test() " );
	}
}
