public class assignment3 {
    public class FirstUniqueCharacter {
    public static int firstUniqChar(String s) {
        int[] count = new int[26]; 

      
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

      
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "leetcode";
        System.out.println(firstUniqChar(s1));

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar(s2)); 

        String s3 = "aabb";
        System.out.println(firstUniqChar(s3)); 
    }
}

}
