class MinStackNode {
    int data;
    MinStackNode next;
    int minElement;
    
    public MinStackNode(int data){
        this.data = data;
        next = null;
        minElement = data;
    }
}
class MinStack {
        MinStackNode root;
    /** initialize your data structure here. */
    public MinStack() {
        root=null;
    }
    
    public void push(int x) {
        MinStackNode newNode = new MinStackNode(x);
        if(root == null){
            root = newNode;
        }
        else{
            newNode.next = root;
            if(x < root.minElement){
                newNode.minElement = x;
            }
            else newNode.minElement = root.minElement;
            root = newNode;
        }
    }
    
    public void pop() {
        // if(root.minElement == root.data)
        root = root.next;
        
    }
    
    public int top() {
        return root.data;
    }
