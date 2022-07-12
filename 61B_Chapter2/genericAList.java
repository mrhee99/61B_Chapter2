public class genericAList<Item> {
    private Item[] items;
    private int size;
    /** Creates an empty list. */

    public AList() {
        items = (Item[]) new Object[5];
        size = 0;
        
    }

    // resize the array once array is full
    private void resize (int capacity) {
        Item[] a = (Item[]) new Object [capacity];
        System.arraycopy(items,0,a,0,size);
        items = a;

    }
    /** Inserts X into the back of the list. */
    // Invariants:
    // addLast: The next item we want to add will go into position size 
    // size: The number of items in the list should be size 
    public void addLast(Item x) {
       // if the array gets full
        if (size == items.length) {
            resize(size + 1);
       
       }
       // putting x in the last
       items[size] = x;
       size += 1;
    }

    /** Returns the item from the back of the list. */
    // getLast: The item we want to return is in position size - 1
    public Item getLast() {
        return items[size-1];        
    }
    /** Gets the ith item in the list (0 is the front). */
    public Item get(int i) {
        return items[i];        
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public Item removeLast() {
        Item x = getLast();
        items[size-1] = null;
        size = size -1;
        return x;
       // items [size-1] = items [size-2];
        //int l = items[size-1];
        //size = size -1;
        //return l;
    }
}  
    
