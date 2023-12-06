package Abstraction;
class Child1 extends Parent1 {
    public void run() {
        System.out.println("i will eat");
    }

    public static void main(String args[]) {
        Parent1 obj = new Child1();{
            obj.run();
        }
    }
}