package Polymorphism;

public class MethodOverloading {
    void m1(int a) {
        System.out.println("a");
    }
        void m1(int a , int b) {
            System.out.println(a);
        }
        void m1(int a, int b,float c){
        System.out.println(a+b*c);

    }
    public static void main(String args[]){
        MethodOverloading obj=new MethodOverloading();
            obj.m1(10);
            obj.m1(10,2);
            obj.m1(10,20,1.77f);
}
}