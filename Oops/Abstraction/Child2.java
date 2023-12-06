package Abstraction;

 class Child2 extends Parent2 {
    public void run(){
        System.out.println("i am ravi");

    }

    public static void main(String args[]){
        Parent2 obj=new Child2(); {
            obj.run();
        }
    }
}
