class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int row1 = coordinate1.charAt(1) - '0';
        int row2 = coordinate2.charAt(1) - '0';
        
        int col1 = coordinate1.charAt(0) - 'a' + 1;
        int col2 = coordinate2.charAt(0) - 'a' + 1;
        
        // Squares are same color if sum of row + col have same parity
        return (row1 + col1) % 2 == (row2 + col2) % 2;

    }
}