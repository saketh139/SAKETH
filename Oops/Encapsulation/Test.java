package Encapsulation;

public class Test {
    int a; //a is a data
    public void setid (int b){ //int b is method
        this.a=b;// combination of data and method

    }
    public int getid(){ //getid is a method
        return a;

    }
    public static void main(String args[]){
        Test obj =new Test();
        obj.setid(12);
        System.out.println(obj.getid());
    }
}
