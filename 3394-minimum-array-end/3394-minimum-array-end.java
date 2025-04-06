class Solution {
  public long minEnd(int n, int x) {
    final int MAX_BIT = bitLength(n) + bitLength(x);
    final long k = n - 1;
    long ans = x;
    int BINARY_INDEX = 0;

    for (int i = 0; i < MAX_BIT; ++i) {
      if ((ans >> i & 1) == 0) {
        if ((k >> BINARY_INDEX & 1) == 1)
          ans |= 1L << i;
        ++BINARY_INDEX;
      }
    }
    return ans;
  }

  private int bitLength(int n) {
    return 32 - Integer.numberOfLeadingZeros(n);
  }
}