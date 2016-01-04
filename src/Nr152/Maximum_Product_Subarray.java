package Nr152;

/**
 * Created by yunlongxu on 12/22/15.
 */
public class Maximum_Product_Subarray {
    public static void main(String[] args) {
        int[] nums = {2, -5, -2, -4, 3};
        int getResult = CalcMaxValue(nums);
        System.out.print(getResult);
    }


//    Method 1:
//    public static int CalcMaxValue(int[] nums) {
//        if (nums == null || nums.length == 0) {
//            return -1;
//        }
//        int[] max = new int[nums.length];
//        int[] min = new int[nums.length];
//        max[0] = nums[0];
//        min[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            max[i] = min[i] = nums[i];
//            if (nums[i] > 0) {
//                max[i] = Math.max(max[i], max[i - 1] * nums[i]);
//                min[i] = Math.min(min[i], min[i - 1] * nums[i]);
//            } else if (nums[i] < 0) {
//                max[i] = Math.max(max[i], min[i - 1] * nums[i]);
//                min[i] = Math.min(min[i], max[i - 1] * nums[i]);
//            }
//        }
//        int maxValue = max[0];
//        for (int i = 1; i < max.length; i++) {
//            if (max[i] > maxValue) {
//                maxValue = max[i];
//            }
//        }
//        return maxValue;
//    }

//  Method 2:
    public static int CalcMaxValue(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return -1;
        }
        int result = Integer.MIN_VALUE;
        int max = 1;
        int min = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                max = Math.max(nums[i], max * nums[i]);
                min = Math.min(1, min * nums[i]);
            } else {
                int tempMax = max;
                max = Math.max(nums[i], min * nums[i]);
                min = Math.min(nums[i], tempMax * nums[i]);
            }
            result = Math.max(result, max);
        }
        return result;
    }
}
