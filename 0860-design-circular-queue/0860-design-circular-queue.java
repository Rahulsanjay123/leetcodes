class MyCircularQueue {
    int [] queue;
    int rear,front,size,capacity;
    public MyCircularQueue(int k) {
        capacity=k;
        queue=new int[k];
        front=0;
        rear=-1;
        size=0;
    }
    
    public boolean enQueue(int value) {
        if (size == capacity) 
        {
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (size == 0) 
        {
            return false;
        }
        int val = queue[front];
        front = (front + 1) % capacity;
        size--;
        return true;
    }
    
    public int Front() {
        return size==0?-1:queue[front];
    }
    
    public int Rear() {
        return size==0?-1:queue[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */