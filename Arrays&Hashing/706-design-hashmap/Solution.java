class MyHashMap {
    //Brute force create array of max possible key, value
    //Need to add 1 as indexing is 0 based
    int MAX_SIZE = 10000001;
    int[] map;
    public MyHashMap() {
        map = new int[MAX_SIZE];
        Arrays.fill(map, -1);
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

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */