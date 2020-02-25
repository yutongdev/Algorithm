package com.wangyt.sort;

public class Sort {

	/**
	 * 选择排序
	 * @param a 待排序数组
	 * @param n 数组长度
	 * @return 排好序数组
	 */
	public static void selectSort(int[] a, int n) {

		int i; // 有序区的末尾位置
		int j; // 无序区的起始位置
		int min; // 无序区中最小元素位置

		for (i = 0; i < n; i++) {
			min = i;

			for (j = i + 1; j < n; j++) {
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

	}


	/**
	 * 希尔排序（插入排序增强版）
	 * @param a 待排序数组
	 * @return 排好序数组
	 */
	public static void shellSort(int[] a) {

		int gap = a.length / 2;

		while (1 <= gap) {

			for (int i = gap; i < a.length; i++) {
				int j = 0;
				int tmp = a[i];

				for (j = i - gap; j >= 0 && tmp < a[j]; j = j - gap) {
					a[j + gap] = a[j];
				}

				a[j + gap] = tmp;
			}
			gap /= 2;
		}

	}
}
