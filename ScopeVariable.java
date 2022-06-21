public class ScopeVariable {
    public static int val = 20;
    public static void main(String[] args) {
        System.out.println(val);
        int val = 200;
        int one = 10;
        System.out.println(val);
        System.out.println(GlobalDemo.val);
        int ans = DemoGlobalScopes(one);
        System.out.println(ans);
    }
    public static int DemoGlobalScopes(int one) {
        int sum = one + val;
        return sum;
    }
}
