package test1;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

    //Map<Integer, Integer> map=new HashMap<>();

    public static int solve(int arr[], int index){


        int product=1;
        for (int i = 0; i < arr.length; i++) {
                if(i!=index){
                    product*=arr[i];
            }
        }
        return product;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};// 60 index 1 40 index 2
        int index =4;// 60/3*2
        System.out.println(solve(arr,index));
    }


}
