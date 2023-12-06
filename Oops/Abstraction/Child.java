package Abstraction;
class Child extends Parent {
    public void run(){
        System.out.println("I WILL RUN");

    }
    public static void main(String args[]){

        Parent obj=new Child();
        obj.run();

    }
}
