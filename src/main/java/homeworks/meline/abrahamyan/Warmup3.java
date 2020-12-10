package homeworks.meline.abrahamyan;

public class Warmup3 {


//    Given an array of ints, return true if the array is length 1 or more,
//    and the first element and the last element are equal.
//
//
//    sameFirstLast([1, 2, 3]) → false
//    sameFirstLast([1, 2, 3, 1]) → true
//    sameFirstLast([1, 2, 1]) → true

    public boolean sameFirstLast(int[] nums) {
        if (nums.length >= 1 && nums[0] == nums[nums.length-1]){
            return true;
        }
        return false;
    }


//    Given an array of ints length 3, return the sum of all the elements.
//    sum3([1, 2, 3]) → 6
//    sum3([5, 11, 2]) → 18
//    sum3([7, 0, 0]) → 7

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }



//    Given an array of ints length 3, figure out which is larger, the first or last element in the array,
//    and set all the other elements to be that value. Return the changed array.
//
//
//    maxEnd3([1, 2, 3]) → [3, 3, 3]
//    maxEnd3([11, 5, 9]) → [11, 11, 11]
//    maxEnd3([2, 11, 3]) → [3, 3, 3]


    public int[] maxEnd3(int[] nums) {
        int max;
        if(nums[0] > nums[2]){
            max = nums[0];
        } else {
            max = nums[2];
        }
        nums[0] = max;
        nums[1] = max;
        nums[2] = max;
        return nums;
    }


//    Given an array of ints, return a new array length 2 containing the first and last elements
//    from the original array. The original array will be length 1 or more.
//
//
//    makeEnds([1, 2, 3]) → [1, 3]
//    makeEnds([1, 2, 3, 4]) → [1, 4]
//    makeEnds([7, 4, 6, 2]) → [7, 2]


    public int[] makeEnds(int[] nums) {
        int[] nums1 = new int[2];
        nums1[0] = nums[0];
        nums1[1] = nums[nums.length-1];
        return nums1;
    }

//    Given an int array, return a new array with double the length where its last element is the
//    same as the original array, and all the other elements are 0.
//    The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
//
//
//    makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
//    makeLast([1, 2]) → [0, 0, 0, 2]
//    makeLast([3]) → [0, 3]

    public int[] makeLast(int[] nums) {
        int size  = 2 * nums.length;
        int[] nums1 = new int[size];
        for (int i = 0; i < size - 1; i++){
            nums1[i] = 0;
        }
        nums1[size-1] = nums[nums.length-1];
        return nums1;
    }


//    Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as
//    their first element.
//
//
//    start1([1, 2, 3], [1, 3]) → 2
//    start1([7, 2, 3], [1]) → 1
//    start1([1, 2], []) → 1

    public int start1(int[] a, int[] b) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1){
                count ++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] == 1){
                count ++;
            }
        }
        return count;
    }


//    Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
//
//
//    plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
//    plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
//    plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]

    public int[] plusTwo(int[] a, int[] b) {
        int size = a.length + b.length;
        int[] c = new int[size];
        for (int i = 0; i < a.length; i++){
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++){
            c[a.length + i] = b[i];
        }
        return c;
    }


//    Given an array of ints of odd length, look at the first, last, and middle values in the array
//    and return the largest. The array length will be a least 1.
//
//
//    maxTriple([1, 2, 3]) → 3
//    maxTriple([1, 5, 3]) → 5
//    maxTriple([5, 2, 3]) → 5

    public int maxTriple(int[] nums) {
        int a = nums[0];
        int b = nums[nums.length/2];
        int c = nums[nums.length-1];
        if (a > b && a > c){
            return a;
        } else if (b > a && b > c){
            return b;
        }
        return c;
    }

}
