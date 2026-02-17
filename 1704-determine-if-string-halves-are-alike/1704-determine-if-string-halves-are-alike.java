class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int half = n / 2;
        int left = 0, right = 0;

        for (int i = 0; i < half; i++) {
            char c1 = Character.toLowerCase(s.charAt(i));
            char c2 = Character.toLowerCase(s.charAt(i + half));

            // Count vowels in the left half
            if (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u') {
                left++;
            }

            // Count vowels in the right half
            if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') {
                right++;
            }
        }

        return left==right;
    }
}