package collections;

import java.util.*;

public class Testing {
    public static void main(String[]args){
        Vector<String> v1 = new Vector<>();
       v1.add("a");
       v1.add("b");
       v1.add("c");
        System.out.println(v1);
       Vector<String> v2 = new Vector<>();
       v2.add("d");
       v2.add("e");
       v1.addAll(v2);
        System.out.println(v1);
        System.out.println(v1.get(3));
        v1.remove("a");
        System.out.println(v1);

    }
}
