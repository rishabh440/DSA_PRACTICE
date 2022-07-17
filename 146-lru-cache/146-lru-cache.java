class LRUCache {
   Map<Integer , Node > map = new HashMap();
    Node head = new Node(0,0) , tail = new Node(0,0);
    int cap;
    public LRUCache(int capacity) {
        cap = capacity;
        head.next = tail;
        tail.perv = head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
           Node node =  map.get(key);
      remove(node);
            insert(node);
            return node.val;
        }
        else{
            return -1;
        }
       
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(map.get(key));
        }
      if(map.size()==cap){
          remove(tail.perv);
      }
        insert(new Node(key , value));
  
    }
    
    class Node{
        Node  perv,next;
        int key, val;
        Node( int _key , int _val){
            key = _key;
            val = _val;
        }
    }
    private void remove(Node node){
            map.remove(node.key);
            node.next.perv = node.perv;
            node.perv.next = node.next;
        }
      private  void insert( Node node){
            map.put(node.key , node);
            Node headnext = head.next;
            head.next = node;
            headnext.perv = node;
            node.perv = head;
            node.next = headnext;
        }
            
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */