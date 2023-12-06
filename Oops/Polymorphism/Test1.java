package Polymorphism;
public class Test1 extends Test {
  public  void run(){
     super.run();
    System.out.println("EATING");
    }

    public static void  ain(String args[]){
      Test1 obj=new Test1();
         obj.run();
    }
}