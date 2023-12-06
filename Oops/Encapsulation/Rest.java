package Encapsulation;

public class Rest{
        int a;
        public void setid(int b){
            this.a=b;
        }
        public int getid(){
            return a;

        }
        public static void main(String args[]){
            Rest obj=new Rest();
            obj.setid(10);
            System.out.println(obj.getid());
        }

    }

