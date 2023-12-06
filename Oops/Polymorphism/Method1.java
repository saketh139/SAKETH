package Polymorphism;

public class Method1 extends Method {
    public void run(){
        super.run();
        System.out.println("EATING");
    }

    public static void main(String args[]){
        Method1 obj=new Method1();
        obj.run();
    }
}
