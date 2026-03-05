class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer>map=new HashMap<>();
        String row1="qwertyuiop";
        String row2="asdfghjkl";
        String row3="zxcvbnm";
        for(char ch:row1.toCharArray()){
            map.put(ch,1);
        }
        for(char ch:row2.toCharArray()){
            map.put(ch,2);
        }
        for(char ch:row3.toCharArray()){
            map.put(ch,3);
        }
        List<String> result=new ArrayList<>();
        for(String word:words){
            String lower=word.toLowerCase();
            int firstrow=map.get(lower.charAt(0));
            boolean valid=true;
            for(char ch:lower.toCharArray()){
                if(map.get(ch)!=firstrow){
                    valid=false;
                    break;
                }
            }
            if(valid){
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}