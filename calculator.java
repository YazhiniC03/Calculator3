public class calculator {

    public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }

    public static int divide(int a, int b) {
        if(b==0){
            return 0;
        }
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("Calculator");
    }
}