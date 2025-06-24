class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        
        String yearBin = Integer.toBinaryString(year);
        String monthBin = Integer.toBinaryString(month);
        String dayBin = Integer.toBinaryString(day);
        
        return yearBin + "-" + monthBin + "-" + dayBin;
    }
}
