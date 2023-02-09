import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;

public class linkedhashSett {

        public static void main(String[] args) {

            LinkedHashSet hs= new LinkedHashSet();

hs.add(2);
hs.add(9);
hs.add(1);
hs.add(7);
hs.add("j");
            System.out.println(hs);
        Object [] j= hs.toArray();
            System.out.println(Arrays.toString(j));

        }
    }
