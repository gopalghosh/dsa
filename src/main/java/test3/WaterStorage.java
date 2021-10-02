package test3;

public class WaterStorage {
    static int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

    public static void main(String[] args) {

        WaterStorage ws = new WaterStorage();
        System.out.println("O(n2) ans: " + ws.maxWaterStorage(arr, 0));
        System.out.println(" O(n) ans: " + ws.trapRainWater(arr));
    }

    public int maxWaterStorage(int[] arr, int result) {

        for (int i = 2; i < arr.length; i++) {
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }
            int right = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                right = Math.max(right, arr[j]);
            }
            result += Math.min(left, right) - arr[i];
        }

        return result;
    }

    public int trapRainWater(int arr[]) {
        if (arr.length == 0)
            return 0;

        int left = 0;
        int right = arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int ans = 0;
        while (left < right) {
             leftMax=Math.max(leftMax,arr[left]);
             rightMax=Math.max(rightMax,arr[right]);
            if (rightMax > leftMax) {
                ans += Math.max(0, leftMax - arr[left]);
                left++;
            } else {
                ans += Math.max(0, rightMax - arr[right]);
                right--;
            }
        }
        return ans;
    }

}
