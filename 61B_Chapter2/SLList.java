
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
    /* The first item (if it exists) is at sentinel.next */
    private IntNode sentinel;
    private int size;
    
    public SLList () {
        // sentinel has to have some value in it
        sentinel = new IntNode(5, null);;
        size = 0;
    }

    public SLList(int x) {
         
        sentinel = new IntNode(5, null);
        // the first item 
        sentinel.next = new IntNode(x, null);
        size =1;
    }

    // adding x to the front of the list
    public void addFirst (int x){
        // the new value will become sentinel.next and the previous sentinel.next will go behind it
        sentinel.next = new IntNode (x, sentinel.next);
        size = size +1;
    }
    // retrieving the first item of the list
    public int getFirst () {
        // sentinel.next is the first value in the list
        return sentinel.next.item;
    }
    
    // adding x to the very back of the list 
    public void addLast (int x) {
        size = size +1;

        IntNode p = sentinel;
      

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
        SLList L = new SLList ();
        L.addLast (45);
        System.out.println(L.size());
    
    }
   
}
