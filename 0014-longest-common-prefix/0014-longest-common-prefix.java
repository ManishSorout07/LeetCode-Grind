class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (String a : strs) {
                if (i >= a.length() || a.charAt(i) != ch) {
                    return str.toString();
                }
            }
            str.append(ch);
        }
        return str.toString();
    }
}