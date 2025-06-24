class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder();
        
        String y = date.substring(0,4);
        String m = date.substring(5,7);
        String d = date.substring(8,10);

        sb.append(Integer.toBinaryString(Integer.parseInt(y)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(m)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(d)));

        return sb.toString();
    }
}