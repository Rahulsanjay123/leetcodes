class Solution {
    public String countAndSay(int n) {
    String s = "1";
    for (int i = 2; i <= n; i++) {
        StringBuilder temp = new StringBuilder();
        char prev = s.charAt(0);
        int count = 1;
        for (int j = 1; j < s.length(); j++) {
            if (s.charAt(j) == prev) {
                count++;
            } else {
                temp.append(count).append(prev);
                prev = s.charAt(j);
                count = 1;
            }
        }
        temp.append(count).append(prev);
        s = temp.toString();
    }
    return s;
}

}