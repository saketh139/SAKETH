package collections;

import java.util.*;

public class Testing2 {
    public static void main(String[]args){
        Stack<String> books = new Stack<>();
        books.push("red book");
        books.push("black book");
        books.push("white book");
        System.out.println(books);
        System.out.println(books.search("white book"));
        System.out.println(books.peek());
        System.out.println(books);
        System.out.println(books.pop());
        System.out.println(books);
    }

}
