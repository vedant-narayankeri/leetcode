class MyHashMap {
    //Optimized linked list solution
    int MAX_SIZE = 10000;//As max number of operations is 10^4 hence these can be max number of elemetns
    class Node {
        int key;
        int value;
        Node next;
        Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private Node[] buckets;

    public MyHashMap() {
        buckets = new Node[MAX_SIZE];
        //Setting something default,first node of bucket is irrelevant for us(we use for hash-index purpose)
        for(int i = 0;i<MAX_SIZE;i++){
            buckets[i] = new Node(0, 0);
        }
    }
    
    public void put(int key, int value) {
        Node node = buckets[getHash(key)];
        while(node.next != null){
            if(node.next.key == key ){
                node.next.value = value;
                return;
            }
            node = node.next;
        }
        node.next = new Node(key, value);
    }
    
    public int get(int key) {
        Node node = buckets[getHash(key)];
        while(node.next != null){
            if(node.next.key == key ){
                return node.next.value;
            }
            node = node.next;
        }
        return -1;
    }
    
    public void remove(int key) {
        Node node = buckets[getHash(key)];
        while(node.next != null){
            if(node.next.key == key){
                //prev - node
                node.next = node.next.next;
                return;
            }
            node = node.next;//Keep moving forward
        }
    }

    private int getHash(int key){
        return key%MAX_SIZE;
    }
}

/**
class MyHashMap {
    //Brute force create array of max possible key, value
    //Need to add 1 as indexing is 0 based
    int MAX_SIZE = 10000001;
    int[] map;
    public MyHashMap() {
        map = new int[MAX_SIZE];
        Arrays.fill(map, -1);//As we have to return -1 default
    }
    
    public void put(int key, int value) {
        map[key] = value;
    }
    
    public int get(int key) {
        return map[key];
    }
    
    public void remove(int key) {
        map[key] = -1;
    }
}
*/

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */