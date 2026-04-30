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
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */