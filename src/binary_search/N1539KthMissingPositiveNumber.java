package binary_search;

/**
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 *
 * Return the kth positive integer that is missing from this array.
 */
public class N1539KthMissingPositiveNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,4,7,11};
        int ret = findKthPositive(nums, 5);
        System.out.println(ret);
    }
    public static int findKthPositive(int[] arr, int k) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int h = arr[mid]-1-mid;
            if (h < k) {
                l = mid + 1;
            } else if (h > k) {
                r = mid;
            } else {
                int j = mid;
                while (j > 0 && arr[j-1]+1 == arr[j]) j--;
                return arr[j] - 1;
            }
        }
        if (arr[r]-1-r >= k) {
            return r + k;
        } else {
            return k + arr.length;
        }
    }
}
