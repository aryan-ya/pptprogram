// package recursion;

// <aside>
// 💡 **Question 1**

// Given two strings s1 and s2, return *the lowest **ASCII** sum of deleted characters to make two strings equal*.

// **Example 1:**

// **Input:** s1 = "sea", s2 = "eat"

// **Output:** 231

// **Explanation:** Deleting "s" from "sea" adds the ASCII value of "s" (115) to the sum.

// Deleting "t" from "eat" adds 116 to the sum.

// At the end, both strings are equal, and 115 + 116 = 231 is the minimum sum possible to achieve this.

// </aside>


// public class Assignment1 {

//     public static int minimumDeleteSum(String s1, String s2) {
//         int m = s1.length();
//         int n = s2.length();
        
       
//         int[][] dp = new int[m + 1][n + 1];
        
        
//         for (int i = 1; i <= m; i++) {
//             dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
//         }
//         for (int j = 1; j <= n; j++) {
//             dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
//         }
        
       
//         for (int i = 1; i <= m; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
//                     dp[i][j] = dp[i - 1][j - 1];
//                 } else {
//                     dp[i][j] = Math.min(dp[i - 1][j] + s1.charAt(i - 1), dp[i][j - 1] + s2.charAt(j - 1));
//                 }
//             }
//         }
        
//         return dp[m][n];
//     }

//     public static void main(String[] args) {
//         String s1 = "sea";
//         String s2 = "eat";
//         int result = minimumDeleteSum(s1, s2);
//         System.out.println(result);
//     }
// }












// import java.util.Stack;

// public class ValidString {

//     public static boolean checkValidString(String s) {
//         Stack<Integer> leftStack = new Stack<>();
//         Stack<Integer> starStack = new Stack<>();

//         int n = s.length();
//         for (int i = 0; i < n; i++) {
//             char c = s.charAt(i);
//             if (c == '(') {
//                 leftStack.push(i);
//             } else if (c == '*') {
//                 starStack.push(i);
//             } else {
//                 if (!leftStack.isEmpty()) {
//                     leftStack.pop();
//                 } else if (!starStack.isEmpty()) {
//                     starStack.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         while (!leftStack.isEmpty() && !starStack.isEmpty()) {
//             if (leftStack.pop() > starStack.pop()) {
//                 return false;
//             }
//         }

//         return leftStack.isEmpty();
//     }

//     public static void main(String[] args) {
//         String s = "()";
//         boolean result = checkValidString(s);
//         System.out.println(result);
//     }
// }


// <aside>
// 💡 **Question 2**

// Given a string s containing only three types of characters: '(', ')' and '*', return true *if* s *is **valid***.

// The following rules define a **valid** string:

// - Any left parenthesis '(' must have a corresponding right parenthesis ')'.
// - Any right parenthesis ')' must have a corresponding left parenthesis '('.
// - Left parenthesis '(' must go before the corresponding right parenthesis ')'.
// - '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".

// **Example 1:**

// **Input:** s = "()"

// **Output:**

// true

// </aside>


// import java.util.Stack;

// public class Assignment1 {

//     public static boolean checkValidString(String s) {
//         Stack<Integer> leftStack = new Stack<>();
//         Stack<Integer> starStack = new Stack<>();

//         int n = s.length();
//         for (int i = 0; i < n; i++) {
//             char c = s.charAt(i);
//             if (c == '(') {
//                 leftStack.push(i);
//             } else if (c == '*') {
//                 starStack.push(i);
//             } else {
//                 if (!leftStack.isEmpty()) {
//                     leftStack.pop();
//                 } else if (!starStack.isEmpty()) {
//                     starStack.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }

//         while (!leftStack.isEmpty() && !starStack.isEmpty()) {
//             if (leftStack.pop() > starStack.pop()) {
//                 return false;
//             }
//         }

//         return leftStack.isEmpty();
//     }

//     public static void main(String[] args) {
//         String s = "()";
//         boolean result = checkValidString(s);
//         System.out.println(result);
//     }
// }



// public class Assignment1 {

//     public static int minDistance(String word1, String word2) {
//         int m = word1.length();
//         int n = word2.length();


//         int[][] dp = new int[m + 1][n + 1];

       
//         for (int i = 0; i <= m; i++) {
//             dp[i][0] = i;
//         }
//         for (int j = 0; j <= n; j++) {
//             dp[0][j] = j;
//         }

        
//         for (int i = 1; i <= m; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
//                     dp[i][j] = dp[i - 1][j - 1];
//                 } else {
//                     dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + 1;
//                 }
//             }
//         }

//         return dp[m][n];
//     }

//     public static void main(String[] args) {
//         String word1 = "sea";
//         String word2 = "eat";
//         int result = minDistance(word1, word2);
//         System.out.println(result);
//     }
// }






// <aside>
// 💡 **Question 4**

// You need to construct a binary tree from a string consisting of parenthesis and integers.

// The whole input represents a binary tree. It contains an integer followed by zero, one or two pairs of parenthesis. The integer represents the root's value and a pair of parenthesis contains a child binary tree with the same structure.
// You always start to construct the **left** child node of the parent first if it exists.

// ![Screenshot 2023-05-29 010548.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bdbea2d1-34a4-4c4b-a450-ea6db7410c43/Screenshot_2023-05-29_010548.png)

// **Input:** s = "4(2(3)(1))(6(5))"

// **Output:** [4,2,6,3,1,5]

// </aside>




// import java.util.Stack;

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int val) {
//         this.val = val;
//     }
// }

// public class Assignment1 {

//     public static TreeNode str2tree(String s) {
//         if (s.isEmpty()) {
//             return null;
//         }

//         int firstParen = s.indexOf('(');

//         // The string only contains an integer (root node)
//         if (firstParen == -1) {
//             return new TreeNode(Integer.parseInt(s));
//         }

//         int rootVal = Integer.parseInt(s.substring(0, firstParen));
//         TreeNode root = new TreeNode(rootVal);

//         int start = firstParen;
//         int openParenCount = 0;

//         for (int i = start; i < s.length(); i++) {
//             if (s.charAt(i) == '(') {
//                 openParenCount++;
//             } else if (s.charAt(i) == ')') {
//                 openParenCount--;
//             }

//             // Found the end of the left child tree
//             if (openParenCount == 0 && start == firstParen) {
//                 root.left = str2tree(s.substring(start + 1, i));
//                 start = i + 1;
//             }

//             // Found the start of the right child tree
//             else if (openParenCount == 0 && start > firstParen) {
//                 root.right = str2tree(s.substring(start + 1, i));
//             }
//         }

//         return root;
//     }

//     public static void inorderTraversal(TreeNode root) {
//         if (root == null) {
//             return;
//         }

//         inorderTraversal(root.left);
//         System.out.print(root.val + " ");
//         inorderTraversal(root.right);
//     }

//     public static void main(String[] args) {
//         String s = "4(2(3)(1))(6(5))";
//         TreeNode root = str2tree(s);
//         inorderTraversal(root);
//     }
// }










// <aside>
// 💡 **Question 5**

// Given an array of characters chars, compress it using the following algorithm:

// Begin with an empty string s. For each group of **consecutive repeating characters** in chars:

// - If the group's length is 1, append the character to s.
// - Otherwise, append the character followed by the group's length.

// The compressed string s **should not be returned separately**, but instead, be stored **in the input character array chars**. Note that group lengths that are 10 or longer will be split into multiple characters in chars.

// After you are done **modifying the input array,** return *the new length of the array*.

// You must write an algorithm that uses only constant extra space.

// **Example 1:**

// **Input:** chars = ["a","a","b","b","c","c","c"]

// **Output:** Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]

// **Explanation:**

// The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".

// </aside>














// public class Assignment1 {

//     public static int compress(char[] chars) {
//         int n = chars.length;
//         int write = 0; // pointer for writing
//         int anchor = 0; // anchor to mark the start of a group

//         for (int read = 0; read < n; read++) {
//             if (read + 1 == n || chars[read] != chars[read + 1]) {
//                 chars[write++] = chars[anchor]; // write the character

//                 if (read > anchor) {
//                     // write the count as characters
//                     int count = read - anchor + 1;
//                     String countStr = String.valueOf(count);
//                     for (char c : countStr.toCharArray()) {
//                         chars[write++] = c;
//                     }
//                 }

//                 anchor = read + 1; // move the anchor to the next group
//             }
//         }

//         return write;
//     }

//     public static void main(String[] args) {
//         char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
//         int length = compress(chars);

//         System.out.print("Compressed Array: ");
//         for (int i = 0; i < length; i++) {
//             System.out.print(chars[i] + " ");
//         }
//     }
// }






// <aside>
// 💡 **Question 6**

// Given two strings s and p, return *an array of all the start indices of* p*'s anagrams in* s. You may return the answer in **any order**.

// An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

// **Example 1:**

// **Input:** s = "cbaebabacd", p = "abc"

// **Output:** [0,6]

// **Explanation:**

// The substring with start index = 0 is "cba", which is an anagram of "abc".

// The substring with start index = 6 is "bac", which is an anagram of "abc".

// </aside>

// import java.util.ArrayList;
// import java.util.List;

// public class Assignment1 {

//     public static List<Integer> findAnagrams(String s, String p) {
//         List<Integer> result = new ArrayList<>();
//         int[] pCount = new int[26];
//         int[] sCount = new int[26];
//         int pLen = p.length();
//         int sLen = s.length();

//         // Count the frequencies of characters in p
//         for (char c : p.toCharArray()) {
//             pCount[c - 'a']++;
//         }

//         // Initialize the sliding window
//         for (int i = 0; i < pLen - 1; i++) {
//             sCount[s.charAt(i) - 'a']++;
//         }

//         // Slide the window through s
//         for (int i = pLen - 1; i < sLen; i++) {
//             // Add the current character to the window
//             sCount[s.charAt(i) - 'a']++;

//             // Compare the counts of characters in the window with p
//             if (matches(pCount, sCount)) {
//                 result.add(i - pLen + 1);
//             }

//             // Remove the leftmost character from the window
//             sCount[s.charAt(i - pLen + 1) - 'a']--;
//         }

//         return result;
//     }

//     private static boolean matches(int[] pCount, int[] sCount) {
//         for (int i = 0; i < 26; i++) {
//             if (pCount[i] != sCount[i]) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String s = "cbaebabacd";
//         String p = "abc";
//         List<Integer> indices = findAnagrams(s, p);
//         System.out.println("Anagram Start Indices: " + indices);
//     }
// }


// <aside>
// 💡 **Question 7**

// Given an encoded string, return its decoded string.

// The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

// You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

// The test cases are generated so that the length of the output will never exceed 105.

// **Example 1:**

// **Input:** s = "3[a]2[bc]"

// **Output:** "aaabcbc"

// </aside>



// 


// <aside>
// 💡 **Question 8**

// Given two strings s and goal, return true *if you can swap two letters in* s *so the result is equal to* goal*, otherwise, return* false*.*

// Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

// - For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

// **Example 1:**

// **Input:** s = "ab", goal = "ba"

// **Output:** true

// **Explanation:** You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.

// </aside>







// public class Assignment1 {

//     public static boolean canBeEqual(String s, String goal) {
//         int mismatchCount = 0;
//         int[] count = new int[26];

//         // Count the frequencies of characters in both strings
//         for (int i = 0; i < s.length(); i++) {
//             count[s.charAt(i) - 'a']++;
//             count[goal.charAt(i) - 'a']--;
//         }

//         // Check for mismatched characters
//         for (int i = 0; i < 26; i++) {
//             if (count[i] != 0) {
//                 mismatchCount++;
//                 if (mismatchCount > 2) {
//                     return false;
//                 }
//             }
//         }

//         return mismatchCount == 2;
//     }

//     public static void main(String[] args) {
//         String s = "ab";
//         String goal = "ba";
//         boolean canSwap = canBeEqual(s, goal);
//         System.out.println("Can swap two letters: " + canSwap);
//     }
// }
