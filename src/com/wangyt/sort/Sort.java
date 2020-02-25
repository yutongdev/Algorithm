package com.wangyt.sort;

public class Sort {

	/**
	 * 选择排序
	 * @param a 待排序数组
	 * @param n 数组长度
	 * @return 返回排序数组
	 */
	public static int[] selectSort(int[] a, int n) {
		
		int i;  // 有序区的末尾位置
		int j;  // 无序区的起始位置
		int min;  // 无序区中最小元素位置
		
		for (i=0; i<n; i++) {
			min = i;
			
			for (j=i+1; j<n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			
			if (min != i) {
				int tmp = a[i];
				a[i] = a[min];
				a[min] = tmp;
			}
		}
		
		return a;
	}
}
