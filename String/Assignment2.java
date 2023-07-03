// ***************************


// PS D:\pptprogram> cd String
// PS D:\pptprogram\String> Java Assignment2.java 
// true
// PS D:\pptprogram\String> 




// ************************************


















// <!-- Given two strings s and t, *determine if they are isomorphic*.

// Two strings s and t are isomorphic if the characters in s can be replaced to get t.

// All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

// **Example 1:**

// **Input:** s = "egg", t = "add"

// **Output:** true -->

 
//  import java.util.HashMap;
// import java.util.Map;

// public class Assignment2 {
//     public static boolean isIsomorphic(String s, String t) {
//         if (s.length() != t.length()) {
//             return false;
//         }

//         Map<Character, Character> charMap = new HashMap<>();
//         Map<Character, Boolean> mappedChars = new HashMap<>();

//         for (int i = 0; i < s.length(); i++) {
//             char sChar = s.charAt(i);
//             char tChar = t.charAt(i);

//             if (charMap.containsKey(sChar)) {
//                 if (charMap.get(sChar) != tChar) {
//                     return false;
//                 }
//             } else {
//                 if (mappedChars.containsKey(tChar)) {
//                     return false;
//                 }
//                 charMap.put(sChar, tChar);
//                 mappedChars.put(tChar, true);
//             }
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         String s = "egg";
//         String t = "add";
//         boolean result = isIsomorphic(s, t);
//         System.out.println(result);  // Output: true
//     }
// } 



// <aside>
// 💡 **Question 2**

// Given a string num which represents an integer, return true *if* num *is a **strobogrammatic number***.

// A **strobogrammatic number** is a number that looks the same when rotated 180 degrees (looked at upside down).

// **Example 1:**

// **Input:** num = "69"

// **Output:**

// true

// </aside>


// public class Assignment2 {
//     public static boolean isStrobogrammatic(String num) {
//         int left = 0;
//         int right = num.length() - 1;
        
//         while (left <= right) {
//             char leftChar = num.charAt(left);
//             char rightChar = num.charAt(right);
            
//             if (!isStrobogrammaticPair(leftChar, rightChar)) {
//                 return false;
//             }
            
//             left++;
//             right--;
//         }
        
//         return true;
//     }
    
//     public static boolean isStrobogrammaticPair(char a, char b) {
//         return (a == '0' && b == '0') ||
//                (a == '1' && b == '1') ||
//                (a == '6' && b == '9') ||
//                (a == '8' && b == '8') ||
//                (a == '9' && b == '6');
//     }
    
//     public static void main(String[] args) {
//         String num = "69";
//         boolean result = isStrobogrammatic(num);
//         System.out.println(result);  // Output: true
//     }
// }



// <aside>
// 💡 **Question 3**

// Given two non-negative integers, num1 and num2 represented as string, return *the sum of* num1 *and* num2 *as a string*.

// You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

// **Example 1:**

// **Input:** num1 = "11", num2 = "123"

// **Output:**

// "134"

// </aside>



// public class Assignment2 {
//     public static String addStrings(String num1, String num2) {
//         StringBuilder result = new StringBuilder();
//         int carry = 0;
//         int i = num1.length() - 1;
//         int j = num2.length() - 1;

//         while (i >= 0 || j >= 0 || carry > 0) {
//             int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
//             int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;
//             int sum = digit1 + digit2 + carry;
//             carry = sum / 10;
//             int digit = sum % 10;
//             result.append(digit);
//             i--;
//             j--;
//         }

//         return result.reverse().toString();
//     }

//     public static void main(String[] args) {
//         String num1 = "11";
//         String num2 = "123";
//         String result = addStrings(num1, num2);
//         System.out.println(result);  // Output: "134"
//     }
// }












// aside>
// 💡 **Question 4**

// Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// **Example 1:**

// **Input:** s = "Let's take LeetCode contest"

// **Output:** "s'teL ekat edoCteeL tsetnoc"



// public class Assignment2 {
//     public static String reverseWords(String s) {
//         String[] words = s.split(" ");
//         StringBuilder result = new StringBuilder();

//         for (String word : words) {
//             StringBuilder reversedWord = new StringBuilder(word);
//             reversedWord.reverse();
//             result.append(reversedWord).append(" ");
//         }

//         return result.toString().trim();
//     }

//     public static void main(String[] args) {
//         String s = "Let's take LeetCode contest";
//         String result = reverseWords(s);
//         System.out.println(result);  
//     }
// }





// <aside>
// 💡 **Question 5**

// Given a string s and an integer k, reverse the first k characters for every 2k characters counting from the start of the string.

// If there are fewer than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and leave the other as original.

// **Example 1:**

// **Input:** s = "abcdefg", k = 2

// **Output:**

// "bacdfeg"

// </aside>





// public class Assignment2 {
//     public static String reverseStr(String s, int k) {
//         char[] chars = s.toCharArray();
//         int n = chars.length;

//         for (int start = 0; start < n; start += 2 * k) {
//             int i = start;
//             int j = Math.min(start + k - 1, n - 1);

//             while (i < j) {
//                 char temp = chars[i];
//                 chars[i] = chars[j];
//                 chars[j] = temp;
//                 i++;
//                 j--;
//             }
//         }

//         return new String(chars);
//     }

//     public static void main(String[] args) {
//         String s = "abcdefg";
//         int k = 2;
//         String result = reverseStr(s, k);
//         System.out.println(result);  // Output: "bacdfeg"
//     }
// }




// <aside>
// 💡 **Question 6**

// Given two strings s and goal, return true *if and only if* s *can become* goal *after some number of **shifts** on* s.

// A **shift** on s consists of moving the leftmost character of s to the rightmost position.

// - For example, if s = "abcde", then it will be "bcdea" after one shift.

// **Example 1:**

// **Input:** s = "abcde", goal = "cdeab"

// **Output:**

// true



// public class  Assignment2 {
//     public static boolean rotateString(String s, String goal) {
//         if (s.length() != goal.length()) {
//             return false;
//         }

//         String doubledS = s + s;
//         return doubledS.contains(goal);
//     }

//     public static void main(String[] args) {
//         String s = "abcde";
//         String goal = "cdeab";
//         boolean result = rotateString(s, goal);
//         System.out.println(result);  // Output: true
//     }
// }



// <aside>
// 💡 **Question 7**

// Given two strings s and t, return true *if they are equal when both are typed into empty text editors*. '#' means a backspace character.

// Note that after backspacing an empty text, the text will continue empty.

// **Example 1:**

// **Input:** s = "ab#c", t = "ad#c"

// **Output:** true

// **Explanation:**

// Both s and t become "ac".

// </aside>






// public class Assignment2{
//     public static boolean backspaceCompare(String s, String t) {
//         String finalS = processString(s);
//         String finalT = processString(t);
//         return finalS.equals(finalT);
//     }

//     private static String processString(String str) {
//         StringBuilder result = new StringBuilder();

//         for (char ch : str.toCharArray()) {
//             if (ch == '#') {
//                 if (result.length() > 0) {
//                     result.deleteCharAt(result.length() - 1);
//                 }
//             } else {
//                 result.append(ch);
//             }
//         }

//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String s = "ab#c";
//         String t = "ad#c";
//         boolean result = backspaceCompare(s, t);
//         System.out.println(result);  // Output: true
//     }
// }


