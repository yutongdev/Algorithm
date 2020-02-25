package com.wangyt;

import java.util.Arrays;

import com.wangyt.sort.Sort;

public class Main {

	public static void main(String[] args) {
//		int[] a = { 20, 40, 30, 10, 60, 50 };
//		int[] a = { 9, 1, 2, 5, 7, 4, 8, 6, 3, 5 };
//		int[] a = { 1 };
		int[] a = { 1, 2, 3, 4 };
//		Sort.selectSort(a, a.length);
		Sort.shellSort(a);
		System.out.println(Arrays.toString(a));
	}

}
