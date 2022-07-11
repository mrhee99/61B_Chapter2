public class basicarray {
    public static void main(String[] args) {
        int[] x, y;
    
        x = new int [] {45,56,67,78,89,99};
        y = x;
        x = new int[] {44,55,66,77,88,99,111};
        y = new int[] {123,234,345,456,567};
        int xL = x.length;
        int yL = y.length;

        String [] j = {"stars", "blackhole", "andromeda", "constellation"} ;
        
        
        System.arraycopy (x, 1, y, 2, 2);
        System.out.println (xL);
        System.out.println (j[2]);
        System.out.println (y[3]);
    }

    
}
