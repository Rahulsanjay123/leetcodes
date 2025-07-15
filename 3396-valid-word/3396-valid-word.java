class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)return false;
        
        int vowels = 0, consonants = 0;
        for (char ch : word.toCharArray()) 
        {
            if (!Character.isLetterOrDigit(ch)) return false; 
            char lower = Character.toLowerCase(ch);
            if ("aeiou".indexOf(lower) >= 0) vowels++;
            else if (Character.isLetter(lower)) consonants++;
        }
        return vowels > 0 && consonants > 0;

    }
}