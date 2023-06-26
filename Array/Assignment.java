
// // 💡 **Q1.** Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// // You may assume that each input would have exactly one solution, and you may not use the same element twice.

// // You can return the answer in any order.

// // **Example:**
// // Input: nums = [2,7,11,15], target = 9
// // Output0 [0,1]

// // **Explanation:** Because nums[0] + nums[1] == 9, we return [0, 1][





// // public class Assignment {
// //     public static int[] twoSum(int[] nums, int target) {
// //         for (int i = 0; i < nums.length; i++) {
// //             for (int j = i + 1; j < nums.length; j++) {
// //                 if (nums[i] + nums[j] == target) {
// //                     return new int[]{i, j};
// //                 }
// //             }
// //         }
// //         throw new IllegalArgumentException("No two numbers add up to the target");
// //     }

// //     public static void main(String[] args) {
// //         int[] nums = {2, 7, 11, 15};
// //         int target = 9;

// //         int[] result = twoSum(nums, target);
// //         System.out.println(result[0] + " " + result[1]); // Output: 0 1
// //     }
// // }





// // 💡 **Q2.** Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// // Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// // - Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// // - Return k.

// // **Example :**
// // Input: nums = [3,2,2,3], val = 3
// // Output: 2, nums = [2,2,_*,_*]

// // **Explanation:** Your function should return k = 2, with the first two elements of nums being 2. It does not matter what you leave beyond the returned k (hence they are underscores)[

// // import java.util.Arrays;

// // public class Assignment {
// //     public static int removeElement(int[] nums, int val) {
// //         int k = 0; 

// //         for (int i = 0; i < nums.length; i++) {
// //             if (nums[i] != val) {
// //                 nums[k] = nums[i];
// //                 k++;
// //             }
// //         }

// //         return k;
// //     }

// //     public static void main(String[] args) {
// //         int[] nums = {3, 2, 2, 3};
// //         int val = 3;

// //         int k = removeElement(nums, val);
// //         System.out.println(k); // 
// //         System.out.println(Arrays.toString(nums)); 
// //     }
// // }












// // 💡 **Q3.** Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// // You must write an algorithm with O(log n) runtime complexity.

// // **Example 1:**
// // Input: nums = [1,3,5,6], target = 5

// // Output: 2















// // public class Assignment {
// //     public static int searchInsert(int[] nums, int target) {
// //         int left = 0;
// //         int right = nums.length;

// //         while (left < right) {
// //             int mid = left + (right - left) / 2;

// //             if (nums[mid] < target) {
// //                 left = mid + 1;
// //             } else {
// //                 right = mid;
// //             }
// //         }

// //         return left;
// //     }

// //     public static void main(String[] args) {
// //         int[] nums = {1, 3, 5, 6};
// //         int target = 5;

// //         int index = searchInsert(nums, target);
// //         System.out.println(index); 
// //     }
// // }






// 💡 **Q4.** You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

// Increment the large integer by one and return the resulting array of digits.

// **Example 1:**
// Input: digits = [1,2,3]
// Output: [1,2,4]

// **Explanation:** The array represents the integer 123.

// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

// import java.util.Arrays;

// public class Assignment {
//     public static int[] plusOne(int[] digits) {
//         int n = digits.length;

//         for (int i = n - 1; i >= 0; i--) {
//             if (digits[i] != 9) {
//                 digits[i]++;
//                 return digits;
//             } else {
//                 digits[i] = 0;
//             }
//         }

//         int[] result = new int[n + 1];
//         result[0] = 1;
//         return result;
//     }

//     public static void main(String[] args) {
//         int[] digits = {1, 2, 3};
//         int[] result = plusOne(digits);
//         System.out.println(Arrays.toString(result)); 
//     }
// }












// 💡 **Q5.** You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

// Merge nums1 and nums2 into a single array sorted in non-decreasing order.

// The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

// **Example 1:**
// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]

// **Explanation:** The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

// import java.util.Arrays;

// public class Assignment {
//     public static void merge(int[] nums1, int m, int[] nums2, int n) {
//         int p1 = m - 1; // Pointer for nums1
//         int p2 = n - 1; // Pointer for nums2
//         int p = m + n - 1; // Pointer for merged array

//         while (p1 >= 0 && p2 >= 0) {
//             nums1[p--] = (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--];
//         }

//         // Copy remaining elements from nums2 to nums1 if any
//         System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
//     }

//     public static void main(String[] args) {
//         int[] nums1 = {1, 2, 3, 0, 0, 0};
//         int m = 3;
//         int[] nums2 = {2, 5, 6};
//         int n = 3;

//         merge(nums1, m, nums2, n);
//         System.out.println(Arrays.toString(nums1)); 
//     }
// }








// 💡 **Q6.** Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

// **Example 1:**
// Input: nums = [1,2,3,1]

// Output: true











// import java.util.Arrays;

// public class Assignment {
//     public static boolean containsDuplicate(int[] nums) {
       
//         Arrays.sort(nums);

     
//         for (int i = 0; i < nums.length - 1; i++) {
//             if (nums[i] == nums[i + 1]) {
//                 return true; 
//             }
//         }

//         return false; 
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 1};
//         boolean containsDuplicate = containsDuplicate(nums);
//         System.out.println(containsDuplicate);
//     }
// }







// 💡 **Q7.** Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the nonzero elements.

// Note that you must do this in-place without making a copy of the array.

// **Example 1:**
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]


// public class Assignment {
//     public static void moveZeroes(int[] nums) {
//         int left = 0; 

       
//         for (int right = 0; right < nums.length; right++) {
//          
//             if (nums[right] != 0) {
//                 int temp = nums[left];
//                 nums[left] = nums[right];
//                 nums[right] = temp;
//                 left++; 
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {0, 1, 0, 3, 12};
//         moveZeroes(nums);


//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }






// 💡 **Q8.** You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

// You are given an integer array nums representing the data status of this set after the error.

// Find the number that occurs twice and the number that is missing and return them in the form of an array.

// **Example 1:**
// Input: nums = [1,2,2,4]
// Output: [2,3]


import java.util.Arrays;

public class Assignment {
    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] count = new int[nums.length + 1];

        // Count the occurrences of each number
        for (int num : nums) {
            count[num]++;
        }

        // Find the missing and duplicate numbers
        for (int i = 1; i <= nums.length; i++) {
            if (count[i] == 2) {
                result[0] = i; // Duplicate number
            } else if (count[i] == 0) {
                result[1] = i; // Missing number
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        int[] result = findErrorNums(nums);
        System.out.println(Arrays.toString(result));
    }
}












