class Solution {
    public int clumsy(int n) {
        Stack <Integer> stack = new Stack<>();
        int op=0;
        stack.push(n--);
        while(n>0){
            if(op==0){
                stack.push(stack.pop()*n);
            }
            else if(op==1)
            {
                stack.push(stack.pop()/n);
            }
            else if(op==2)
            {
                stack.push(n);
            }
            else
            {
                stack.push(-n);
            }
            op = (op + 1) % 4;
            n--;
        }
        int ans=0;
        while(!stack.isEmpty())
        {
            ans += stack.pop();
        }
        return ans;
    }
}