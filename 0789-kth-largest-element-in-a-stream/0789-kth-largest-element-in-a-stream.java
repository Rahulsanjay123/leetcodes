class KthLargest {
    PriorityQueue<Integer> pq;
    int s;
    public KthLargest(int k, int[] nums) {
        this.s = k;
        pq = new PriorityQueue<>(s);
        for(int v : nums)
        {
            add(v);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>s)
        {
            pq.poll();
        }

        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */