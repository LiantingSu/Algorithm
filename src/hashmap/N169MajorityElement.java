package hashmap;

import utils.Printer;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
public class N169MajorityElement {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        int ret = majorityElement(nums);
        System.out.println(ret);
    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer> set = new HashMap<>();
        int n = nums.length;
        for(int i =0; i < nums.length; i++){
            if(set.containsKey(nums[i])){
                set.replace(nums[i], set.get(nums[i])+1);
            }
            else{
                set.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : set.entrySet()){
            if(entry.getValue() > n/2){
                return entry.getKey();
            }
        }
        return 0;
    }
}
