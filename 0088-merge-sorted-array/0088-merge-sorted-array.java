class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m];
        for (int l = 0; l < m; l++) 
        {
            arr[l] = nums1[l];
        }

        int i = 0, j = 0, k = 0;

        while (j < m && k < n) 
        {
            if (arr[j] < nums2[k]) 
            {
                nums1[i++] = arr[j++];
            } 
            else 
            {
                nums1[i++] = nums2[k++];
            }
        }

        while (j < m) 
        {
            nums1[i++] = arr[j++];
        }

        while (k < n) 
        {
            nums1[i++] = nums2[k++];
        }
    }
}