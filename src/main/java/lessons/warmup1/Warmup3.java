package lessons.warmup1;

public class Warmup3 {
    public static void main(String[] args) {
        System.out.println(unlucky1(new int[]{1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{2, 1, 3, 4, 5}));
        System.out.println(unlucky1(new int[]{1, 1, 1}));
    }

//    Given an array of ints, return true if 6 appears as either the first or last element in the array.
//    The array will be length 1 or more.
//
//    firstLast6([1, 2, 6]) → true
//    firstLast6([6, 1, 2, 3]) → true
//    firstLast6([13, 6, 1, 2, 3]) → false
    static boolean firstLast6(int[] nums) {
        return (nums[0]==6 || nums[nums.length-1]==6);
    }

//    Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
//    Both arrays will be length 1 or more.
//
//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true
    static boolean commonEnd(int[] a, int[] b) {
        return (a[0]==b[0] || a[a.length-1] == b[b.length-1]);
    }

//    Given an array of ints length 3, return a new array with the elements in reverse order,
//    so {1, 2, 3} becomes {3, 2, 1}.
//
//    reverse3([1, 2, 3]) → [3, 2, 1]
//    reverse3([5, 11, 9]) → [9, 11, 5]
//    reverse3([7, 0, 0]) → [0, 0, 7]
    static int[] reverse3(int[] nums) {
        int tmp = nums[0];
        nums[0] = nums[nums.length-1];
        nums[nums.length-1] = tmp;
        return nums;
    }

//    Given an int array length 2, return true if it does not contain a 2 or 3.
//
//    no23([4, 5]) → true
//    no23([4, 2]) → false
//    no23([3, 5]) → false
    static boolean no23(int[] nums) {
        return (nums[0]!=2 && nums[0]!=3 && nums[1]!=2 && nums[1]!=3);
    }


//    Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
//    Return the changed array.
//
//    fix23([1, 2, 3]) → [1, 2, 0]
//    fix23([2, 3, 5]) → [2, 0, 5]
//    fix23([1, 2, 1]) → [1, 2, 1]
    static int[] fix23(int[] nums) {
        if (nums[0]==2) {
            if (nums[1] == 3) {
                nums[1]=0;
            }
        }
        if (nums[1]==2) {
            if (nums[2] == 3) {
                nums[2] = 0;
            }
        }
        return nums;
    }


//    Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
//    The original array will be length 2 or more.
//
//    makeMiddle([1, 2, 3, 4]) → [2, 3]
//    makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
//    makeMiddle([1, 2]) → [1, 2]
    static int[] makeMiddle(int[] nums) {
//        int[] result = new int[2];
//        result[0] = nums[nums.length/2-1];
//        result[1] = nums[nums.length/2];
//        return result;
        return new int[]{nums[nums.length/2-1], nums[nums.length/2]};
    }
//
//    Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
//    The array length will be at least 3.
//
//    midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
//    midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
//    midThree([1, 2, 3]) → [1, 2, 3]
    static int[] midThree(int[] nums) {
        int[] result = new int[3];
        result[0] = nums[nums.length/2-1];
        result[1] = nums[nums.length/2];
        result[2] = nums[nums.length/2+1];
        return result;
    }

//    We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
//    Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
//
//    unlucky1([1, 3, 4, 5]) → true
//    unlucky1([2, 1, 3, 4, 5]) → true
//    unlucky1([1, 1, 1]) → false
    static boolean unlucky1(int[] nums) {
        if ((nums[0]==1 && nums[1]==3) || (nums[1]==1 && nums[2]==3)) {
            return true;
        }
        if ((nums[nums.length-2]==1 && nums[nums.length-1]==3)) {
            return true;
        }
        return false;

//        return ((nums[0]==1 && nums[1]==3) || (nums[1]==1 && nums[2]==3) || (nums[nums.length-2]==1 && nums[nums.length-1]==3));
    }
}
