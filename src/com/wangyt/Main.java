package com.wangyt;

import java.util.Arrays;

import com.wangyt.sort.Sort;

public class Main {

	public static void main(String[] args) {
		int[] a = { 20, 40, 30, 10, 60, 50 };
		Sort.selectSort(a, a.length);
		System.out.println( Arrays.toString(a) );
	}
}
