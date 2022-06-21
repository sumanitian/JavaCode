public class PassbyValue {
    public static void main(String[] args) {
        int one = 10;
        int two = 20;
        System.out.println(one + ", " + two);
        Swap(one, two);
        System.out.println(one + ", " + two);
    }
    public static void Swap(int one, int two){
        System.out.println(one + ", " + two);

        int temp = one;
        one = two;
        two = temp;

        System.out.println(one + ", " + two);
    }
}
