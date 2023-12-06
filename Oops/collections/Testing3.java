package collections;

import java.util.*;

public class Testing3 {
    public static void main(String[]args){
        ArrayList<String> AL=new ArrayList<>();
        AL.add("s1");
        AL.add("s2");
        LinkedList<String> LL=new LinkedList<>();
        LL.add("y1");
        LL.add("y2");
        LL.add("y3");
        LL.add("y4");
        LL.add(1,"yy");
        LL.addAll(0,AL);
        System.out.println(LL);
        System.out.println(LL.get(3));
        System.out.println(LL.contains("y3"));
        LL.set(1,"ss");
        LL.set(2,"yy");
        System.out.println(LL);

    }
}
