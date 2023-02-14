package binary_search;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class N35SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,3,5,5,6};
        int ret = searchInsert(nums, 5);
        System.out.println(ret);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return right;
    }
}
