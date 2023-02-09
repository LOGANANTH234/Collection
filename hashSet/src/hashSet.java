import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {

        HashSet <Integer>hs= new HashSet();
           hs.add(89);
        hs.add(43);
        hs.add(9);
        hs.add(7);
      hs.add(89);

        Iterator <Integer> i = hs.iterator();
      while(i.hasNext()){
          Integer res =i.next();
         if(res<10){
             i.remove();
         }
      }

        System.out.println(hs);
    }
}