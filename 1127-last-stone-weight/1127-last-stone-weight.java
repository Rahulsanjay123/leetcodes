class Solution {
    public int lastStoneWeight(int[] stones) {
        // Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // for (int stone : stones)
        // {
        //     pq.offer(stone);
        // }
        // while (pq.size() >= 2) 
        // {
        //     int n1 = pq.poll();
        //     int n2 = pq.poll();
        //     if (n1 != n2)
        //     {
        //         pq.offer(n1 - n2);
        //     }
        // }
        // return pq.isEmpty()? 0:pq.peek();
        // int n=stones.length;
        // Arrays.sort(stones);
        // for(int i=n-1;i>0;i--)
        // {
        //     stones[i-1]=stones[i]-stones[i-1];
        //     Arrays.sort(stones);
        // }
        // return stones[0];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int s : stones) 
        {
            pq.offer(s);
        }

        while (pq.size() > 1)
        {
            pq.offer(pq.poll() - pq.poll());
        }
        return pq.peek();
    }
}