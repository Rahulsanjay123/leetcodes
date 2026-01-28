class Solution {
    public int clumsy(int n) {
        // Stack <Integer> stack = new Stack<>();
        // int op=0;
        // stack.push(n--);
        // while(n>0){
        //     if(op==0){
        //         stack.push(stack.pop()*n);
        //     }
        //     else if(op==1)
        //     {
        //         stack.push(stack.pop()/n);
        //     }
        //     else if(op==2)
        //     {
        //         stack.push(n);
        //     }
        //     else
        //     {
        //         stack.push(-n);
        //     }
        //     op = (op + 1) % 4;
        //     n--;
        // }
        // int ans=0;
        // while(!stack.isEmpty())
        // {
        //     ans += stack.pop();
        // }
        // return ans;
        int ans = 1;
        if(n <= 4)
        {
            if(n <= 2) 
            {
                return n;
            }
            else if(n == 3) 
            {
                return 6;
            }
            else if(n == 4) 
            {
                return 7;
            }
        } 
        else 
        {
            if(n%4 == 1 || n%4 == 2) 
            {
                ans = n+2;
            }
            else if(n%4 == 3) 
            {
                ans = n-1;
            }
            else 
            {
                ans = n+1;
            }
        }
        return ans;
    }
}