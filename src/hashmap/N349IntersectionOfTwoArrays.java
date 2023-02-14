package hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 */
public class N349IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};

        int[] ret = intersection(nums1, nums2);
        System.out.println(ret);
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int j = 0; j < nums2.length; j++){
            if(set.contains(nums2[j])){
                set2.add(nums2[j]);
            }
        }
        int[] res = new int[set2.size()];
        int k = 0;
        for(Integer i : set2){
            res[k++] = i;
        }
        return res;
    }
}
