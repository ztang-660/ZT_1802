package com.jihe;
import java.util.*;
public class Arrays {

	public static void main(String[] args) {
		int [] arr = {9,8,3,5,2};
		System.out.println("排序前");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("排序后");
		printArray(arr);
	}
	public static void printArray(int[] arr) {
		for (int x =0;x<arr.length;x++) {
			if (x !=arr;x<arr.length-1) {
				System.out.println(arr[x] +",");
			}else {
				System.out.println(arr[x] +"]");
			}
		}
	}
}
