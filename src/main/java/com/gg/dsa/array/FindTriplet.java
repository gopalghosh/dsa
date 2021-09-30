package com.gg.dsa.array;

public class FindTriplet {


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

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 2};// O(n2)
        FindTriplet f = new FindTriplet();
        f.findTriplet(arr);

    }
}
