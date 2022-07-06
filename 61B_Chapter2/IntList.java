
public class IntList {
    // containing two variables
    public int first;
    public IntList rest;

    public IntList (int f, IntList r) {
        first = f;
        rest = r;
    }

    // Return the size of the list using recursion
    public int size() {

        // if there is nothing coming after
        if (rest == null) {
            return 1;
        }
        // if yes, add 1 to the length of the rest of the blocks
        return 1+ this.rest.size();

    }

    // Return the size of the list using iteration
    public int iterative_size (){
        IntList p = this;
        int totalSize = 0;

        // as long as p is not null
        while (p != null) {
            // total size increases by 1
            totalSize += 1;
            // and moves on to the next p
            p = p.rest;
        }
        return totalSize;
    }

    public static void main(String[] args) {
        IntList L = new IntList (15, null);
        L = new IntList (342, L);
        L = new IntList (534, L);
    
    System.out.println(L.iterative_size());
    }
}