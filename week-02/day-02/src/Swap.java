public class Swap {
    public static void main(String[] args) {
        int a = 123;
        int b = 526;
        int c = a;
        int d = b;
        a = d;
        b = c;
        System.out.println(a);
        System.out.println(b);
    }
}
