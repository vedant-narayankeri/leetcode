/*
class MyHashSet {

    private List<Integer> array;

    public MyHashSet() {
        array = new ArrayList<>();
    }
    
    public void add(int key) {
        if(!array.contains(key)){
            array.add(key);
        }
    }
    
    public void remove(int key) {
        //Note - remove(int) -> removes number at index
        //But, remove(Integer) -> removes the actual number from the data structure
        array.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        return array.contains(key);
    }
}*/

class MyHashSet {
    //Linked-list Implementation
    class Node{
        int val;
        Node next;
        Node(int key){
            this.val = key;
        }
    }
    //Index = hash(data)
    //At index we put data and continue extending nodes when same hash found

    //Max number of operations = 10^4 that means, at max we can potentially add 10^4 elements
    //Setting this as size, doesn't matter what are numbers inserted as we compute hash
    private static int MAX_SIZE = 10000;
    private Node[] buckets;

    public MyHashSet() {
        buckets = new Node[MAX_SIZE];
        for(int i = 0;i<MAX_SIZE;i++){
            buckets[i] = new Node(0);// Default node at each bucket start
        }
    }
    
    public void add(int key) {
        Node node = buckets[getHashIndex(key)];
        //For iteration to reach last node
        while(node.next != null){
            if(node.next.val == key){
                return;//Exit if key already exists
            }
            node = node.next;
        }
        //Base case
        node.next = new Node(key);
    }
    
    public void remove(int key) {
        Node node = buckets[getHashIndex(key)];
        //Simple removal from list
        while(node.next != null){
            if(node.next.val == key){
                //prev - node
                node.next = node.next.next;
                return;//Exit once done
            }
            node = node.next;
        }
    }
    
    public boolean contains(int key) {
        Node node = buckets[getHashIndex(key)];
        while(node.next != null){
            if(node.next.val == key){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    private int getHashIndex(int key){
        return key%MAX_SIZE;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */