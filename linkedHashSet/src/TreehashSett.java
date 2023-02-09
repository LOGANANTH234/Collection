import java.util.LinkedList;
import java.util.TreeSet;

public class TreehashSett {
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(-1);
        ll.add(4);
        ll.add(0);
        ll.add(0);
        System.out.println(ll);

      TreeSet ts= new TreeSet<>(ll);
//        ts.add(1);
//        ts.add(-1);
//        ts.add(2);
//        ts.add(7);
//        ts.add(   6);
//
   System.out.println(ts);
    }
}
