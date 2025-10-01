class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letterFrequency = new int[26]; // store count of each letter
        
        for (char c : magazine.toCharArray()) {
            letterFrequency[c - 'a']++;
        }
        
        for (char c : ransomNote.toCharArray()) {
            letterFrequency[c - 'a']--;
            if (letterFrequency[c - 'a'] < 0) {
                return false; // insufficient letters in magazine
            }
        }
        
        return true;
    }
}