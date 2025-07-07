class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) 
        {
            if (!stack.isEmpty() && ch == stack.peek()) 
            {
                stack.pop();
            } 
            else 
            {
                stack.push(ch);
            }
        }
        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) 
        {
            res.insert(0, stack.pop());
        }
        return res.toString();
    }
}