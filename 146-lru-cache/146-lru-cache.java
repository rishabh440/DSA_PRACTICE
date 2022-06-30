class LRUCache {
  Node head = new Node(0,0) , tail = new Node(0,0);
    Map<Integer , Node> map = new HashMap<>();
    int cap;
    public LRUCache(int capacity) {
       cap = capacity;
        head.next = tail;
        tail.prev= head;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insert(node);
            
           return node.value;
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
            remove(tail.prev);
        }
        insert(new Node( key ,value));
    }
  private void   remove(Node node){
      map.remove(node.key);
      node.next.prev = node.prev;
      node.prev.next= node.next;
  }
    private void insert(Node node){
        map.put(node.key , node);
        Node headnext = head.next;
        head.next = node ;
        headnext.prev = node;
        node.next= headnext;
        node.prev = head;
    }
    class Node{
        Node  prev ,next;
        int key , value;
            Node(int _key , int _value){
            key=_key;
            value=_value;
        }
    }
    
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */