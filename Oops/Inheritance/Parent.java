package Inheritance;

public class Parent extends Child{
    public void m3(){
        System.out.println("SLEEPING");
    }
    public void m4(){
        System.out.println("WALKING");
    }

    public static void main(String args[]){
        Parent obj=new Parent();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
    }
}
