package lessons.warmup1;

import javafx.scene.effect.Blend;

public class Warmup4 {
    public static void main(String[] args) {
       int[] res = post4(new int[] {2, 4, 1, 2});
       for (int num: res) {
           System.out.print(num + " ");
       }
        System.out.println();
        int[] res1 = post4(new int[] {4, 1, 4, 2});
        for (int num: res1) {
            System.out.print(num + " ");
        }
        System.out.println();
        int[] res2 = post4(new int[] {4, 4, 1, 2, 3});
        for (int num: res2) {
            System.out.print(num + " ");
        }
//    post4([4, 1, 4, 2]) → [2]
//    post4([4, 4, 1, 2, 3]) → [1, 2, 3]
    }

//    Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
//
//    countEvens([2, 1, 2, 3, 4]) → 3
//    countEvens([2, 2, 0]) → 3
//    countEvens([1, 3, 5]) → 0
    static int countEvens(int[] nums) {
        int count = 0;
//        for (int i=0; i<nums.length; i++) {
//            if (nums[i]%2==0) {
//                count++;
//            }
//        }
        for (int num : nums) {
            if (num%2==0) {
                count++;
            }
        }
        return count;
    }


//    Return the sum of the numbers in the array, returning 0 for an empty array.
//    Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.
//
//    sum13([1, 2, 2, 1]) → 6
//    sum13([1, 1]) → 2
//    sum13([1, 2, 2, 1, 13]) → 6
    static int sum13(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            } else {
                sum+=nums[i];
            }
        }
        return sum;
    }

//    Given an array of ints, return true if the array contains no 1's and no 3's.
//
//            lucky13([0, 2, 4]) → true
//    lucky13([1, 2, 3]) → false
//    lucky13([1, 2, 4]) → false
    static boolean lucky13(int[] nums) {
        for (int num : nums) {
            if (num==1 || num==3) {
                return false;
            }
        }
        return true;
    }

//    Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
//    The given n may be 0, in which case just return a length 0 array.
//    You do not need a separate if-statement for the length-0 case; the for-loop should naturally execute 0 times in that case, so it just works.
//    The syntax to make a new int array is: new int[desired_length]   (See also: FizzBuzz Code)
//
//    fizzArray(4) → [0, 1, 2, 3]
//    fizzArray(1) → [0]
//    fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    static int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i=0; i<n; i++) {
            result[i] = i;
        }
        return result;
    }


//    Given an array of ints, return true if it contains no 1's or it contains no 4's.
//
//    no14([1, 2, 3]) → true
//    no14([1, 2, 3, 4]) → false
//    no14([2, 3, 4]) → true
    static boolean no14(int[] nums) {
        boolean contains1 = false;
        boolean contains4 = false;

        for (int num: nums) {
            if (num == 1) {
                contains1 = true;
            }
            if (num == 4) {
                contains4 = true;
            }
        }
        return !(contains1 && contains4);
    }

//
//    Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2
//    (at the same index). Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
//
//    matchUp([1, 2, 3], [2, 3, 10]) → 2
//    matchUp([1, 2, 3], [2, 3, 5]) → 3
//    matchUp([1, 2, 3], [2, 3, 3]) → 2
    static int matchUp(int[] nums1, int[] nums2) {
        int count=0;
        for (int i=0; i<nums1.length; i++) {
            if (nums1[i] != nums2[i]) {
                if (Math.abs(nums1[i] - nums2[i]) <= 2 ) {
                    count++;
                }
            }
        }
        return count;
    }


//    Given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other.
//    modThree([2, 1, 3, 5]) → true
//    modThree([2, 1, 2, 5]) → false
//    modThree([2, 4, 2, 5]) → true
    static boolean modThree(int[] nums) {
        if (nums.length<3) {
            return false;
        }
        for (int i=0; i<nums.length-2; i++) {
            if (nums[i]%2==0 && nums[i+1]%2==0 && nums[i+2]%2==0) {
                return true;
            }
            if (nums[i]%2!=0 && nums[i+1]%2!=0 && nums[i+2]%2!=0) {
                return true;
            }
        }
        return false;
    }

//    Return true if the group of N numbers at the start and end of the array are the same.
//    For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3.
//    You may assume that n is in the range 0..nums.length inclusive.
//
//    sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
//    sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
//    sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
    static boolean sameEnds(int[] nums, int len) {
        if (nums.length<(2* len)) {
            return false;
        }
        for (int i=0; i<len; i++) {
            if (nums[i] != nums[nums.length-len+i]) {
                return false;
            }
        }
        return true;
    }


//    Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
//    You may modify and return the given array, or return a new array.
//
//    shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
//    shiftLeft([1, 2]) → [2, 1]
//    shiftLeft([1]) → [1]
    static int[] shiftLeft(int[] nums) {
        int first = nums[0];
        for (int i=1; i<nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = first;
        return nums;
    }


//    Given a non-empty array of ints, return a new array containing the elements from the original array that come after
//    the last 4 in the original array. The original array will contain at least one 4.
//    Note that it is valid in java to create an array of length 0.
//
//    post4([2, 4, 1, 2]) → [1, 2]
//    post4([4, 1, 4, 2]) → [2]
//    post4([4, 4, 1, 2, 3]) → [1, 2, 3]
    static int[] post4(int[] nums) {
        int count = 0;
        for (int i=nums.length-1; i>=0; i--) {
            if (nums[i]!=4) {
                count++;
            }
            if (nums[i]==4) {
                break;
            }
        }
        int[] res = new int[count];
        int j=0;
        for (int i=nums.length-count; i<nums.length; i++) {
            res[j] = nums[i];
            j++;
        }
        return res;
    }
}

