class LRUCache 
{
    class Node
    {
        int key,value;
        Node next,prev;
        Node(int k,int v)
        {
            key=k;
            value=v;
            next=null;
            prev=null;
        }
    }
    Node head=null,tail=null;
    HashMap<Integer,Node> map = new HashMap<>();
    int capacity=0;
    public LRUCache(int capacity) 
    {
        this.capacity=capacity;
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;        
        tail.prev=head;        
    }
    
    public int get(int key) 
    {
        if(!map.containsKey(key))
        {
            return -1;
        }
        Node keyNode = map.get(key);
        delete(keyNode);
        add(keyNode);
        return keyNode.value;
    }
    
    public void put(int key, int value) 
    {
        if(map.containsKey(key))
        {
            Node rem = map.get(key);
            delete(rem);
            map.remove(key);
        }
        if(map.size()==capacity)
        {
            Node lru = tail.prev;
            delete(lru);
            map.remove(lru.key);
        }
        Node newNode =new Node(key,value);
        add(newNode);
        map.put(key,newNode);
    }
    public void add(Node n)
    {
        Node ptr = head.next;

        n.prev = head;
        n.next = ptr;
        head.next = n;
        ptr.prev = n;
    }
    public void delete(Node n)
    {
        n.prev.next = n.next;
        n.next.prev = n.prev;

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */