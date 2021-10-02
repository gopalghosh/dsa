package com.gg.dsa.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindTriplet {


    /*
     *triplet count in O(n2) brute force
     */
    public int findTriplet(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum[] = new int[4];
            int k = 0;
            for (int j = i + 1; j < arr.length; j++) {
                sum[k] = arr[i] + arr[j];
            }

            for (int j = 0; j < arr.length; j++) {
                for (int l = 0; l < sum.length; l++) {
                    if (arr[j] == sum[l]) {
                        System.out.println(arr[i] + ", " + (sum[l] - arr[i]));
                        count++;
                    }
                }
            }
        }
        System.out.println("Count of triplet:" + count);
        return count;
    }

    public int countTriplet(int arr[]) {
        int count = 0;
        Arrays.sort(arr);
        // 1 2 3 5
        for (int i=arr.length-1;i>=2;i--) {
            int left = 0;
            int right = i - 1;
            while (left < right) {
                if (arr[i] == arr[left] + arr[right]) {
                    count++;
                    System.out.println(arr[left] + ", " + arr[right]);
                    left++;
                    right--;
                }else if(arr[i] > arr[left] + arr[right]){
                    left++;
                }else{
                    right--;
                }

            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 2};
        FindTriplet f = new FindTriplet();
        //f.findTriplet(arr);// O(n2)
        System.out.println(f.countTriplet(arr));

    }
}
