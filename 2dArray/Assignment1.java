


// 💡 **Question 1**
// Given three integer arrays arr1, arr2 and arr3 **sorted** in **strictly increasing** order, return a sorted array of **only** the integers that appeared in **all** three arrays.

// **Example 1:**

// Input: arr1 = [1,2,3,4,5], arr2 = [1,2,5,7,9], arr3 = [1,3,4,5,8]

// Output: [1,5]

// **Explanation:** Only 1 and 5 appeared in the three arrays.




// import java.util.ArrayList;
// import java.util.List;

// public class Assignment1 {
//     public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
//         List<Integer> result = new ArrayList<>();
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         int n3 = arr3.length;
//         int i = 0, j = 0, k = 0;

//         while (i < n1 && j < n2 && k < n3) {
//             if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
//                 result.add(arr1[i]);
//                 i++;
//                 j++;
//                 k++;
//             } else if (arr1[i] < arr2[j]) {
//                 i++;
//             } else if (arr2[j] < arr3[k]) {
//                 j++;
//             } else {
//                 k++;
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] arr1 = {1, 2, 3, 4, 5};
//         int[] arr2 = {1, 2, 5, 7, 9};
//         int[] arr3 = {1, 3, 4, 5, 8};
//         List<Integer> commonElements = findCommonElements(arr1, arr2, arr3);
//         System.out.println("Common Elements: " + commonElements);
//     }
// }



// 💡 **Question 2**

// Given two **0-indexed** integer arrays nums1 and nums2, return *a list* answer *of size* 2 *where:*

// - answer[0] *is a list of all **distinct** integers in* nums1 *which are **not** present in* nums2*.*
// - answer[1] *is a list of all **distinct** integers in* nums2 *which are **not** present in* nums1.

// **Note** that the integers in the lists may be returned in **any** order.

// **Example 1:**

// **Input:** nums1 = [1,2,3], nums2 = [2,4,6]

// **Output:** [[1,3],[4,6]]

// **Explanation:**

// For nums1, nums1[1] = 2 is present at index 0 of nums2, whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2. Therefore, answer[0] = [1,3].

// For nums2, nums2[0] = 2 is present at index 1 of nums1, whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2. Therefore, answer[1] = [4,6].



// import java.util.ArrayList;
// import java.util.HashSet;
// import java.util.List;
// import java.util.Set;

// public class Assignment1 {
//     public static List<List<Integer>> findDistinctIntegers(int[] nums1, int[] nums2) {
//         List<List<Integer>> result = new ArrayList<>();
//         Set<Integer> set1 = new HashSet<>();
//         Set<Integer> set2 = new HashSet<>();

//         for (int num : nums1) {
//             set1.add(num);
//         }

//         for (int num : nums2) {
//             set2.add(num);
//         }

//         List<Integer> distinct1 = new ArrayList<>();
//         for (int num : set1) {
//             if (!set2.contains(num)) {
//                 distinct1.add(num);
//             }
//         }
//         result.add(distinct1);

//         List<Integer> distinct2 = new ArrayList<>();
//         for (int num : set2) {
//             if (!set1.contains(num)) {
//                 distinct2.add(num);
//             }
//         }
//         result.add(distinct2);

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] nums1 = {1, 2, 3};
//         int[] nums2 = {2, 4, 6};
//         List<List<Integer>> distinctIntegers = findDistinctIntegers(nums1, nums2);
//         System.out.println("Distinct Integers: " + distinctIntegers);
//     }
// }


// 💡 **Question 3**
// Given a 2D integer array matrix, return *the **transpose** of* matrix.

// The **transpose** of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

// **Example 1:**

// Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]

// Output: [[1,4,7],[2,5,8],[3,6,9]]



// public class Assignment1 {
//     public static int[][] transpose(int[][] matrix) {
//         int rows = matrix.length;
//         int columns = matrix[0].length;
//         int[][] transposedMatrix = new int[columns][rows];

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < columns; j++) {
//                 transposedMatrix[j][i] = matrix[i][j];
//             }
//         }

//         return transposedMatrix;
//     }

//     public static void main(String[] args) {
//         int[][] matrix = {
//                 {1, 2, 3},
//                 {4, 5, 6},
//                 {7, 8, 9}
//         };

//         int[][] transposedMatrix = transpose(matrix);

//         System.out.println("Transposed Matrix:");
//         for (int[] row : transposedMatrix) {
//             for (int num : row) {
//                 System.out.print(num + " ");
//             }
//             System.out.println();
//         }
//     }

// }



//  **Question 4**
// Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ..., (an, bn) such that the sum of min(ai, bi) for all i is **maximized**. Return *the maximized sum*.

// **Example 1:**

// Input: nums = [1,4,3,2]

// Output: 4

// **Explanation:** All possible pairings (ignoring the ordering of elements) are:

// 1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3

// 2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3

// 3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4

// So the maximum possible sum is 4.



// import java.util.Arrays;

// public class Assignment1 {
//     public static int arrayPairSum(int[] nums) {
//         Arrays.sort(nums); 
//         int sum = 0;
//         for (int i = 0; i < nums.length; i += 2) {
//             sum += nums[i]; 
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int[] nums = {1, 4, 3, 2};
//         int maxSum = arrayPairSum(nums);
//         System.out.println("Maximized Sum: " + maxSum);
//     }
// }




// <aside>
// 💡 **Question 5**
// You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase **may be** incomplete.

// Given the integer n, return *the number of **complete rows** of the staircase you will build*.

// **Example 1:**

// []()

// ![v2.jpg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4bd91cfa-d2b1-47b3-8197-a72e8dcfff4b/v2.jpg)

// **Input:** n = 5

// **Output:** 2

// **Explanation:** Because the 3rd row is incomplete, we return 2.

// </aside>





// public class Assignment1 {
//     public static int arrangeCoins(int n) {
//         int left = 0;
//         int right = n;
//         int completeRows = 0;

//         while (left <= right) {
//             int mid = left + (right - left) / 2;
//             long currSum = (long) mid * (mid + 1) / 2;

//             if (currSum == n) {
//                 return mid;
//             } else if (currSum < n) {
//                 completeRows = mid;
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         return completeRows;
//     }

//     public static void main(String[] args) {
//         int n = 5;
//         int completeRows = arrangeCoins(n);
//         System.out.println("Number of Complete Rows: " + completeRows);
//     }
// }



// <aside>
// 💡 **Question 6**
// Given an integer array nums sorted in **non-decreasing** order, return *an array of **the squares of each number** sorted in non-decreasing order*.

// **Example 1:**

// Input: nums = [-4,-1,0,3,10]

// Output: [0,1,9,16,100]

// **Explanation:** After squaring, the array becomes [16,1,0,9,100].
// After sorting, it becomes [0,1,9,16,100]

// </aside>


// import java.util.Arrays;

// public class Assignment1 {
//     public static int[] sortedSquares(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];
//         int left = 0;
//         int right = n - 1;
//         int i = n - 1;

//         while (left <= right) {
//             int squareLeft = nums[left] * nums[left];
//             int squareRight = nums[right] * nums[right];

//             if (squareLeft > squareRight) {
//                 result[i] = squareLeft;
//                 left++;
//             } else {
//                 result[i] = squareRight;
//                 right--;
//             }

//             i--;
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] nums = {-4, -1, 0, 3, 10};
//         int[] squares = sortedSquares(nums);
//         System.out.println("Sorted Squares: " + Arrays.toString(squares));
//     }
// }
 

// <aside>
// 💡 **Question 7**
// You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

// Count and return *the number of maximum integers in the matrix after performing all the operations*

// **Example 1:**

// ![q4.jpg](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/4d0890d0-7bc7-4f59-be8e-352d9f3c1c52/q4.jpg)

// **Input:** m = 3, n = 3, ops = [[2,2],[3,3]]

// **Output:** 4

// **Explanation:** The maximum integer in M is 2, and there are four of it in M. So return 4.

// </aside>



// public class Assignment1 {
//     public static int maxCount(int m, int n, int[][] ops) {
//         int minRow = m;
//         int minCol = n;

//         for (int[] op : ops) {
//             minRow = Math.min(minRow, op[0]);
//             minCol = Math.min(minCol, op[1]);
//         }

//         return minRow * minCol;
//     }

//     public static void main(String[] args) {
//         int m = 3;
//         int n = 3;
//         int[][] ops = {{2, 2}, {3, 3}};
//         int count = maxCount(m, n, ops);
//         System.out.println("Number of Maximum Integers: " + count);
//     }
// }







// <aside>
// 💡 **Question 8**

// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

// *Return the array in the form* [x1,y1,x2,y2,...,xn,yn].

// **Example 1:**

// **Input:** nums = [2,5,1,3,4,7], n = 3

// **Output:** [2,3,5,4,1,7]

// **Explanation:** Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

// </aside>





// public class Assignment1 {
//     public static int[] interleave(int[] nums, int n) {
//         int[] result = new int[2 * n];
//         int index = 0;

//         for (int i = 0; i < n; i++) {
//             result[index++] = nums[i];
//             result[index++] = nums[i + n];
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         int[] nums = {2, 5, 1, 3, 4, 7};
//         int n = 3;
//         int[] interleavedArray = interleave(nums, n);

//         System.out.print("Interleaved Array: ");
//         for (int num : interleavedArray) {
//             System.out.print(num + " ");
//         }
//     }
// }
