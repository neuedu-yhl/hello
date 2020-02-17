package com.neusoft.test;

import java.util.Arrays;

/**
 * @author Neuedu
 * @Date 2020/02/17
 */
public class Test8 {

	public static void main(String[] args) {
		int[] arr = {8,2,3,7,1};
//        arr = bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        
        // java系统提供的排序方法 sort()
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        
		int function = function(5);
		System.out.println(function);
        
	}
	// 递归需要有出口
	// 5 + 3 + 1
	public static int function(int n)
	{
		if(n==1)
		return 1;
		int y = function(n-2) + n;
		return y;
	}
	
	 public static int[] bubbleSort(int[] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = 0; j < arr.length-i-1; j++) {
	                if(arr[j]>arr[j+1]) {
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	            }
	        }
	        return arr;
	    }
	
	
	
	// 引用数据类型 ----> 数组
	// 选择排序
	public static int[] selectionSort(int[] arr) {
        for (int i=0;i<arr.length-1;i++) {
            for (int j=i+1;j<arr.length;j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}