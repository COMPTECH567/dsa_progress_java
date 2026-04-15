class Solution {
    public static int countWords(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {

            
            if (s.charAt(i) == ' ') {
                continue;
            }

           
            count++;

            
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }
        }

        return count;
    }
}