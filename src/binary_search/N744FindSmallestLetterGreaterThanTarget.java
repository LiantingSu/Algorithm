package binary_search;

/**
 * You are given an array of characters letters that is sorted in non-decreasing order, and a character target.
 * There are at least two different characters in letters.
 *
 * Return the smallest character in letters that is lexicographically greater than target.
 * if such a character does not exist, return the first character in letters.
 */
public class N744FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = new char[]{'c','f','j'};
        char ret = nextGreatestLetter(letters, 'c');
        System.out.println(ret);
    }

    public static char nextGreatestLetter(char[] letters, char target) { // 2, 4, 6, 8, 10  t=7
        int left = 0;
        int right = letters.length; //5
        while(left < right){ // 0-5 3-5 3-4 3-3
            int mid = left + (right - left) / 2; // 2,4,3
            if(letters[mid] > target){
                right = mid;//4,3
            }
            else{ //letters[mid] <= target
                left = mid + 1; // 3
            }
        }
        return letters[right % letters.length];//3%5 [3]
    }
}
