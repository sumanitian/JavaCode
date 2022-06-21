public class FunctionDemo {
    public static void main(String[] args) {
        // System.out.println("hello");
        // function call
        // addition();
        // additionParams(10, 20);
        // additionParams(20, 30);
        int sum = additionReturn(30, 40);
        System.out.println(sum);
        // System.out.println("bye");
    }
    public static int additionReturn(int a, int b){
        int sum = a + b;
        return sum;
    }
    // public static void additionParams(int a, int b){
    //     int sum = a + b;
    //     System.out.println(sum);
    // }
    // // function definition
    // public static void addition(){
    //     int a = 5;
    //     int b = 10;
    //     int c = a + b;
    //     System.out.println(c);
    // }
}
