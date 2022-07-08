import java.util.List;
public class list1exercise {

    

    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        /* Your code here. */
    //    List<Integer> copy = new IntList <Integer> ();
    //    int i = 0;
    //    int a = copy.get(i);
    //    for (i = 0; i < copy.size(); i++){
    //        a = a+x; // list[i] = list[i] + x
    //     }
    //     return copy;

        IntList copy = new IntList(L.first+x, L.rest);
        System.out.println("copy @ 0" + copy.get(0));

        for (int i=0; i<copy.size(); i++) {
            copy.rest.first += x;
            copy = copy.rest;
        }
        System.out.println("copy @ 1" + copy.get(0));
        return copy;
        
    }

     //TODO: check if contents of A is correct
              
 
    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        //System.out.println(L.size());
       // System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        System.out.println(L.get(1));
        System.out.println(incrList(L, 3));
        // System.out.println(dincrList(L, 3));        
    }
}