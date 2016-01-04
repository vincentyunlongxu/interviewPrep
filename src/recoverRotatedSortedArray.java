import java.util.ArrayList;

/**
 * Created by yunlongxu on 12/27/15.
 */
public class recoverRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,4,4,0,4,4,4,0,2};
        System.out.println(removeElement(nums, 4));
        for (int i = 0; i < removeElement(nums, 4); i++) {
            System.out.println(nums[i]);
        }
        System.out.print(nums);
        System.out.println(String.valueOf("hello"));
    }
    public static int removeElement(int[] A, int elem) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == elem) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[j] != elem) {
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                        count++;
                        break;
                    }
                }
            } else {
                count++;
            }
        }
        return count;
    }
}
