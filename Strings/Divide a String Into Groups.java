/*  Divide a String Into Groups of Size k
A string s can be partitioned into groups of size k using the following procedure:
The first group consists of the first k characters of the string, the second group consists of the next k characters of the string, and so on. 
Each element can be a part of exactly one group.
For the last group, if the string does not have k characters remaining, a character fill is used to complete the group.

Example:
Input: s = "abcdefghij", k = 3, fill = "x"
Output: ["abc","def","ghi","jxx"]
*/

class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            StringBuilder grp = new StringBuilder();
            for(int j = 0;j < k;j++){
                if(i < s.length()){
                    grp.append(s.charAt(i));
                    i++;
                }else{
                    grp.append(fill);
                }
            }
            result.add(grp.toString());
        }
        return result.toArray(new String[0]);
    }
}
