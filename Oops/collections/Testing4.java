package collections;

import com.google.common.base.Strings;
import org.openqa.selenium.Keys;

import java.security.Key;
import java.util.*;

public class Testing4 {
    public static void main(String[]args){
        Map<Integer,String> m = new HashMap<>();
        m.put(601301,"chennai");
        m.put(500038 ,"hyderabad");
        m.put(524126, "delhi");
        m.put(524129,"vijayawada");
        m.put(600001,"tamarack");
        m.put(300052,"mansion");
        Set<Integer> keys= m.keySet();
        for (Integer key: keys){
            System.out.println(key);
        }
        System.out.println();
        Collection<String> values=m.values();
        for (String value:values){
            System.out.println(value);
        }

    }
}
