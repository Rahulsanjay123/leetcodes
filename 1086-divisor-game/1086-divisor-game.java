class Solution {
    public boolean divisorGame(int n) {
     int a=0,b=0;
     for(int i=1;i<n;i++)
     {
        if(i%2==0)
        {
            b++;
        }
        else
        {
            a++;
        }
     } 
     return a>b;  
    }
}