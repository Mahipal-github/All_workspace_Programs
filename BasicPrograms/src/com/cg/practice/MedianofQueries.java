package com.cg.practice;

import java.util.Arrays;

public class MedianofQueries {
    private static int median( int N, int[] A) {
        int[] arr = Arrays.copyOfRange(A,0,A.length);
        Arrays.sort(arr);
        int mid = (int) Math.ceil(N / 2);
        if (mid + mid == arr.length) {
            return arr[mid-1];
        } else {
            return arr[mid];
        }
    }

    private static void getMedian(int[] A){
        while (A.length >=1) {
            System.out.println(median(A.length, A));
            int mid = (int) Math.ceil(A.length/2);
            A = Arrays.copyOfRange(A, 1, mid+1);
        }
    }
	public static void main(String[] args) {
		int a[]= {2,3,4,5,6,1};
		getMedian(a);
	}
}
