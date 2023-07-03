// Question 1
// Given an integer array nums of length n and an integer target, find three integers
// in nums such that the sum is closest to the target.
// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

// Example 1:
// Input: nums = [-1,2,1,-4], target = 1
// Output: 2

// Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).










// import java.util.Arrays;

// public class Assignment3 {
//     public static int threeSumClosest(int[] nums, int target) {
//         Arrays.sort(nums); 
//         int closestSum = nums[0] + nums[1] + nums[2]; 
        
//         for (int i = 0; i < nums.length - 2; i++) {
//             int left = i + 1; 
//             int right = nums.length - 1; 
            
//             while (left < right) {
//                 int sum = nums[i] + nums[left] + nums[right]; 
                
//                 if (sum == target) {
//                     return sum; 
//                 }
                
//                 if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
//                     closestSum = sum; 
//                 }
                
//                 if (sum < target) {
//                     left++; 
//                 } else {
//                     right--; 
//                 }
//             }
//         }
        
//         return closestSum; 
//     }
    
//     public static void main(String[] args) {
//         int[] nums = {-1, 2, 1, -4};
//         int target = 1;
//         int closestSum = threeSumClosest(nums, target);
//         System.out.println("Closest sum: " + closestSum);
//     }
// }



// Question 2
// Given an array nums of n integers, return an array of all the unique quadruplets
// [nums[a], nums[b], nums[c], nums[d]] such that:
//            ● 0 <= a, b, c, d < n
//            ● a, b, c, and d are distinct.
//            ● nums[a] + nums[b] + nums[c] + nums[d] == target

// You may return the answer in any order.

// Example 1:
// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]


// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Assignment3 {
//     public static List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> quadruplets = new ArrayList<>();
//         Arrays.sort(nums); 
        
//         for (int i = 0; i < nums.length - 3; i++) {
//             if (i > 0 && nums[i] == nums[i - 1]) {
//                 continue; 
//             }
            
//             for (int j = i + 1; j < nums.length - 2; j++) {
//                 if (j > i + 1 && nums[j] == nums[j - 1]) {
//                     continue; 
//                 }
                
//                 int left = j + 1; 
//                 int right = nums.length - 1; 
                
//                 while (left < right) {
//                     int sum = nums[i] + nums[j] + nums[left] + nums[right]; 
                    
//                     if (sum == target) {
//                         quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right])); 

//                         while (left < right && nums[left] == nums[left + 1]) {
//                             left++;
//                         }
                        
                     
//                         while (left < right && nums[right] == nums[right - 1]) {
//                             right--;
//                         }
                        
//                         left++; 
//                         right--; 
//                     } else if (sum < target) {
//                         left++; 
//                     } else {
//                         right--; 
//                     }
//                 }
//             }
//         }
        
//         return quadruplets; 
//     }
    
//     public static void main(String[] args) {
//         int[] nums = {1, 0, -1, 0, -2, 2};
//         int target = 0;
//         List<List<Integer>> quadruplets = fourSum(nums, target);
//         System.out.println("Quadruplets: " + quadruplets);
//     }
// }



// public class Assignment3 {
//     public static void nextPermutation(int[] nums) {
//         int n = nums.length;
//         int i = n - 2;

//         while (i >= 0 && nums[i] >= nums[i + 1]) {
//             i--;
//         }

//         if (i >= 0) {
//             int j = n - 1;
//             while (j >= 0 && nums[j] <= nums[i]) {
//                 j--;
//             }

//             swap(nums, i, j);
//         }

//         reverse(nums, i + 1);
//     }

//     private static void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }

//     private static void reverse(int[] nums, int start) {
//         int i = start;
//         int j = nums.length - 1;
//         while (i < j) {
//             swap(nums, i, j);
//             i++;
//             j--;
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3};
//         nextPermutation(nums);
//         System.out.print("Next Permutation: ");
//         for (int num : nums) {
//             System.out.print(num + " ");
//         }
//     }
// }


// Question 4
// Given a sorted array of distinct integers and a target value, return the index if the
// target is found. If not, return the index where it would be if it were inserted in
// order.

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [1,3,5,6], target = 5
// Output: 2



// public class Assignment3 {
//     public static int searchInsert(int[] nums, int target) {
//         int left = 0;
//         int right = nums.length - 1;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             } else if (nums[mid] < target) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return left;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 3, 5, 6};
//         int target = 5;
//         int insertIndex = searchInsert(nums, target);
//         System.out.println("Insert Index: " + insertIndex);
//     }
// }



// <aside>
// 💡 **Question 5**
// You are given a large integer represented as an integer array digits, where each
// digits[i] is the ith digit of the integer. The digits are ordered from most significant
// to least significant in left-to-right order. The large integer does not contain any
// leading 0's.

// Increment the large integer by one and return the resulting array of digits.

// **Example 1:**
// Input: digits = [1,2,3]
// Output: [1,2,4]

// **Explanation:** The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].

// </aside>



// public class Assignment3 {
//     public static int[] plusOne(int[] digits) {
//         int n = digits.length;

//         for (int i = n - 1; i >= 0; i--) {
//             if (digits[i] < 9) {
//                 digits[i]++;
//                 return digits;
//             }

//             digits[i] = 0;
//         }

//         int[] result = new int[n + 1];
//         result[0] = 1;
//         return result;
//     }

//     public static void main(String[] args) {
//         int[] digits = {1, 2, 3};
//         int[] result = plusOne(digits);
//         System.out.print("Result: ");
//         for (int digit : result) {
//             System.out.print(digit + " ");
//         }
//     }
// }



// Question 6
// Given a non-empty array of integers nums, every element appears twice except
// for one. Find that single one.

// You must implement a solution with a linear runtime complexity and use only
// constant extra space.

// Example 1:
// Input: nums = [2,2,1]
// Output: 1


// public class Assignment3 {
//     public static int singleNumber(int[] nums) {
//         int result = 0;

//         for (int num : nums) {
//             result ^= num;
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 2, 1};
//         int single = singleNumber(nums);
//         System.out.println("Single Number: " + single);
//     }
// }




// Question 7
// You are given an inclusive range [lower, upper] and a sorted unique integer array
// nums, where all elements are within the inclusive range.

// A number x is considered missing if x is in the range [lower, upper] and x is not in
// nums.

// Return the shortest sorted list of ranges that exactly covers all the missing
// numbers. That is, no element of nums is included in any of the ranges, and each
// missing number is covered by one of the ranges.

// Example 1:
// Input: nums = [0,1,3,50,75], lower = 0, upper = 99
// Output: [[2,2],[4,49],[51,74],[76,99]]

// Explanation: The ranges are:
// [2,2]
// [4,49]
// [51,74]
// [76,99]


// import java.util.ArrayList;
// import java.util.List;

// public class Assignment3 {
//     public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
//         List<String> ranges = new ArrayList<>();

//         addRange(ranges, lower, upper);

//         int n = nums.length;
//         for (int i = 0; i < n; i++) {
//             if (i > 0 && nums[i] == nums[i - 1]) {
//                 continue;
//             }

//             if (nums[i] > lower) {
//                 addRange(ranges, lower, nums[i] - 1);
//             }

//             lower = nums[i] + 1;
//         }

//         if (lower <= upper) {
//             addRange(ranges, lower, upper);
//         }

//         return ranges;
//     }

//     private static void addRange(List<String> ranges, int start, int end) {
//         if (start == end) {
//             ranges.add(Integer.toString(start));
//         } else if (start < end) {
//             ranges.add(start + "->" + end);
//         }
//     }

//     public static void main(String[] args) {
//         int[] nums = {0, 1, 3, 50, 75};
//         int lower = 0;
//         int upper = 99;
//         List<String> missingRanges = findMissingRanges(nums, lower, upper);
//         System.out.println("Missing Ranges: " + missingRanges);
//     }
// }










// 💡 **Question 8**
// Given an array of meeting time intervals where intervals[i] = [starti, endi],
// determine if a person could attend all meetings.

// **Example 1:**
// Input: intervals = [[0,30],[5,10],[15,20]]
// Output: false












import java.util.Arrays;

public class Assignment3 {
    public static boolean canAttendMeetings(int[][] intervals) {
        int n = intervals.length;


        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        for (int i = 0; i < n - 1; i++) {
            int endTimeCurrent = intervals[i][1];
            int startTimeNext = intervals[i + 1][0];

            if (endTimeCurrent >= startTimeNext) {
               
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        boolean canAttend = canAttendMeetings(intervals);
        System.out.println("Can attend all meetings: " + canAttend);
    }
}
