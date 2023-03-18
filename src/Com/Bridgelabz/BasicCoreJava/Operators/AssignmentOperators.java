package Com.Bridgelabz.BasicCoreJava.Operators;

public class AssignmentOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a+=b : a = " + (a += b));
        System.out.println("a-=b : a = " + (a -= b));
        System.out.println("a*=b : a = " + (a *= b));
        System.out.println("a/=b : a = " + (a /= b));
        System.out.println("a%=b : a = " + (a %= b));
        System.out.println("a<<=b : a = " + (a <<= 2));
        System.out.println("a>>=b : a = " + (a >>= 2));
        System.out.println("a&=b : a = " + (a &= 2));
        System.out.println("a|=b : a = " + (a |= 2));
        System.out.println("a^=b : a = " + (a ^= 2));
    }
}
