class Solution {
    public boolean isValid(String s) {
        char[] stack = new char[s.length()];
        int top = -1;

        for (char ch : s.toCharArray()) {
            switch (ch) 
            {
                case '(':
                case '[':
                case '{':
                    stack[++top] = ch;
                    break;
                case ')':
                {
                    if (top == -1 || stack[top--] != '(') 
                    {
                        return false;
                    }
                    break;
                }
                case ']':
                {
                    if (top == -1 || stack[top--] != '[') 
                    {
                        return false;
                    }
                    break;
                }
                case '}':
                {
                    if (top == -1 || stack[top--] != '{') 
                    {
                        return false;
                    }
                    break;
                }
                default:
                {
                    break;
                }
            }
        }
        return top == -1;
    }
};