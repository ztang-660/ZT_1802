package com.jihe;
import java.util.Arrays;
public class E28 {

	public static void main(String[] args) {
		int [] arr= {9,8,3,5,2};
		System.out.println("排序前");
		printArray(arr);
		Arrays.sort(arr);
		System.out.println("排序后");
		printArray(arr);
		int index=Arrays.binarySearch(arr,3);
		System.out.println("\n元素3的索引是:"+index);
		//拷贝数组元素
		int [] copiedArr=Arrays.copyOfRange(arr,2,8);
		System.out.println("\n被拷贝的数组是:");
		printArray(copiedArr);
		//替换数组元素
		System.out.println("\n被拷贝的数组元素替换成8以后是:");
		printArray(copiedArr);
	}
	public static void printArray(int[] arr) {
		for (int x =0;x<arr.length;x++) {
			if (x !=arr.length-1) {
				System.out.println(arr[x] +",");
			}else {
				System.out.println(arr[x] +"]");
			}
		}
	}
}
