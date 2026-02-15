class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == '-') 
                continue;
            result.append(Character.toUpperCase(ch));
            count++;
            if (count == k) {
                result.append('-');
                count = 0;
            }
        }
        if (result.length() > 0 && result.charAt(result.length() - 1) == '-') {
            result.deleteCharAt(result.length() - 1);
        }
        return result.reverse().toString();
    }
}
