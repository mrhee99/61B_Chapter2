
/** An SLList is a list of integers like IntList but better  */
public class SLList {
    
    

    // nested class (class inside class)
    // declare it static since the intnode class does not need to use any of the instance methods or variables of SLList. 
    private static class IntNode {
        public int item;
        public IntNode next;
    
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }

        
    }
    private IntNode first;
    private int size;
    

    public SLList(int x) {
        first = new IntNode(x, null);
        size =1;
    }

    // adding x to the front of the list
    public void addFirst (int x){
        // becasue x comes to the front, previous "first" list becomes the following ones after x. Therefore the parameter takes first as the second one. 
        first = new IntNode (x, first);
        size = size +1;
    }
    // retrieving the first item of the list
    public int getFirst () {
        // the first item of the "first" IntNode
        return first.item;
    }
    
    // adding x to the very back of the list 
    public void addLast (int x) {
        IntNode p = first;
        size = size +1;

        // moving p to the very last of the list
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode (x,null);
    }

    /* was not used since i already defined size upfront to make the system more efficient (caching)
    private static int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
    
        return 1 + size(p.next);
    }*/
  
    // the actual size method
    public int size () {
        return size;
    }
    
    public static void main(String[] args) {
        /* creates a list of one integer, 10 */
        SLList L = new SLList (10);
        L.addFirst (12);
        L.addFirst (24);
        L.addLast (45);
        System.out.println(L.getFirst());
    
    }
   
}
