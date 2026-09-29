class DynamicArray {
    int capacity;
    public DynamicArray(int capacity) {
        Arraylist<Integer> arr = new ArrayList<Integer>;
        if(capacity <= 0){
            return 0;
        }
    }

    public int get(int i) {
        return arr.get(i);
    }

    public void set(int i, int n) {
        arr.set(i,n)
    }

    public void pushback(int n) {
        for(int in = 0;i<arr.size();i++){
            if(in == n){

            }
        }
    }

    public int popback() {
        
    }

    private void resize() {
        this.capacity *=2;
    }

    public int getSize() {
        return arr.size();
    }

    public int getCapacity() {
        return this.capacity;
    }
}
