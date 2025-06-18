class Solution {
    public List<String> fizzBuzz(int n) {
        List <String> lst = new ArrayList<>(n);
        for(int i=0;i<n;i++)
        {
            if((i+1)%5==0 && (i+1)%3==0)
            {
                lst.add("FizzBuzz");
            }
            else if((i+1)%5==0)
            {
                lst.add("Buzz");
            }
            else if((i+1)%3==0)
            {
                lst.add("Fizz");
            }
            else
            {
                lst.add(String.valueOf(i+1));
            }
        }
        return lst;
    }
}