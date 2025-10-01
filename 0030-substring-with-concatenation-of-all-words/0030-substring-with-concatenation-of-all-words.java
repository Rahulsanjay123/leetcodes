public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words == null || words.length == 0) return result;

        int wordLen = words[0].length();
        int wordNum = words.length;
        int totalLen = wordLen * wordNum;

        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i, count = 0;
            Map<String, Integer> windowCount = new HashMap<>();

            while (right + wordLen <= s.length()) {
                String sub = s.substring(right, right + wordLen);
                right += wordLen;

                if (wordCount.containsKey(sub)) {
                    windowCount.put(sub, windowCount.getOrDefault(sub, 0) + 1);
                    count++;

                    while (windowCount.get(sub) > wordCount.get(sub)) {
                        String leftWord = s.substring(left, left + wordLen);
                        windowCount.put(leftWord, windowCount.get(leftWord) - 1);
                        left += wordLen;
                        count--;
                    }

                    if (count == wordNum) {
                        result.add(left);
                    }
                } else {
                    windowCount.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }
}
