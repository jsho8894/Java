package com.bit.day14;

public class Ex15 {
	public static void main(String[] args) {
		int[] arr1 = {1,3,5,7};
		
		System.out.println(arr1);
		System.out.println(java.util.Arrays.toString(arr1));//배열의 내용을 확인
		
//		int[] arr2 = new int[arr1.length];
//		for(int i = 0; i < arr1.length; i++){
//			arr2[i] = arr1[i];
//		}
		int[] arr2 = new int[2];
		for(int i = 0; i < arr2.length; i++){
			arr2[i] = arr1[i+1];
		}
		System.out.println(java.util.Arrays.toString(arr2));
//		int[] arr3 = new int[arr1.length];
//		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
//		System.out.println(java.util.Arrays.toString(arr3));
		
		int[] arr3 = new int[2];
		System.arraycopy(arr1, 1, arr3, 0, 2);
		System.out.println(java.util.Arrays.toString(arr3));
			
//		int[] arr4 = java.util.Arrays.copyOf(arr1, arr1.length);
//		System.out.println(java.util.Arrays.toString(arr4));
		
		int[] arr4 = java.util.Arrays.copyOfRange(arr1, 1, 3);
		System.out.println(java.util.Arrays.toString(arr4));
		
		int[] rans = {41,2,23,10,11,28};
		java.util.Arrays.sort(rans);
		System.out.println(java.util.Arrays.toString(rans));
		System.out.println(java.util.Arrays.binarySearch(rans, 11));//binarySearch를 사용할때에는 sort로 정렬을 해야합니다.
	}
}
