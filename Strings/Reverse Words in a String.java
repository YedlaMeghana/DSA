/* Reverse Words in a String
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. 
The returned string should only have a single space separating the words. Do not include any extra spaces.

Example :
Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.  */

class Solution {
    public String reverseWords(String s) {
        s = s.trim() + " ";
        Stack<String> st = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (str.length() > 0) {
                    st.push(str.toString());
                    str.setLength(0);
                }
            } else {
                str.append(s.charAt(i));
            }
        }

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
            if (!st.isEmpty()) ans.append(" ");
        }

        return ans.toString();
    }
}
