
public class str_SLList <LochNess> {
    
    
    private class StuffNode {
        public LochNess item;
        public StuffNode next;
    
        public StuffNode(LochNess i, StuffNode n) {
            item = i;
            next = n;
        }

        
    }
    
    private StuffNode first;
    private int size;
    
    public str_SLList (LochNess x) {
        
        first = new StuffNode(x, null);;
        size = 1;
    }

    
    public void addFirst (LochNess x){
       
        first = new StuffNode (x, first);
        size = size +1;
    }
   
    public LochNess getFirst () {
       
        return first.item;
    }
    
    
    public void addLast (LochNess x) {
        size = size +1;

        StuffNode p = first;
      

        
        while (p.next != null) {
            p = p.next;
        }
        p.next = new StuffNode (x,null);
    }

    /* was not used since i already defined size upfront to make the system more efficient (caching)
    private static int size(StuffNode p) {
        if (p.next == null) {
            return 1;
        }
    
        return 1 + size(p.next);
    }*/
  
    // the actual size method
    public int size () {
        return size;
    }
    
    
   
}
 
