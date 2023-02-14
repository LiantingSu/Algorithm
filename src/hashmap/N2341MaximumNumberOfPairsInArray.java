package hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * You are given a 0-indexed integer array nums. In one operation, you may do the following:
 *
 * Choose two integers in nums that are equal.
 * Remove both integers from nums, forming a pair.
 * The operation is done on nums as many times as possible.
 *
 * Return a 0-indexed integer array answer of size 2 where answer[0] is the number of pairs that are formed and
 * answer[1] is the number of leftover integers in nums after doing the operation as many times as possible.
 */
public class N2341MaximumNumberOfPairsInArray {
    public int[] numberOfPairs(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
                res[0]++;
            }
            else{
                set.add(nums[i]);
            }
        }
        res[1] = set.size();
        return res;
    }
}
