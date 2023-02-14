package hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 */
public class N268MissingNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        int ret = missingNumber(nums);
        System.out.println(ret);
    }

    public static int missingNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int n = nums.length;
        for(int j = 0; j <= n; j++){
            if(set.contains(j)){
                continue;
            }
            else{
                res = j;
                break;
            }
        }
        return res;
    }
}
