package hashmap;

import utils.Printer;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */
public class N1TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] ret = twoSum(nums, 9);
        Printer.print(ret);
    }

    public static int[] twoSum(int[] nums, int target) {//2,7,11,15 n=9
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){//i=0,1
            if(map.containsKey(target-nums[i])){//n,
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                break;
            }
            map.put(nums[i],i);//2,
        }
        return result;
    }
}
