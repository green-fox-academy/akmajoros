public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        a *= 3;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e *= 8 * 8;
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean isF1Bigger = (f1 > f2);
        System.out.println(isF1Bigger);

        int g1 = 350;
        int g2 = 200;
        boolean isDoubleG2Bigger = ( 2 * g2 > g1);
        System.out.println(isDoubleG2Bigger);

        long h = 1357988018575474L;
        boolean is11Divisor = (h % 11 == 0);
        System.out.println(is11Divisor);

        int i1 = 10;
        int i2 = 3;
        int i2Squared = i2 * i2;
        int i2Cubed = i2Squared * i2;
        boolean i1relation = (i2Squared < i1) && (i1 < i2Cubed);
        System.out.println(i1relation);

        int j = 1521;
        boolean jDividable = (j % 3 == 0) || (j % 5 == 0);
        System.out.println(jDividable);

        String k = "Apple";
        k = k + k + k + k;
        System.out.println(k);
    }
}
