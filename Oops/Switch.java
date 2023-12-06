public class Switch {
    public static void main(String args){
        int num = 1;

        int a = 10;
        int b = 20;

        switch (num){
            case 1 : System.out.println(a+b);
            break;

            case 2: System.out.println(a-b);
            break;

            case 3: System.out.println(a*b);
            break;

            default : System.out.println("invaild" );

        }
    }
}
