package Com.Bridgelabz.BasicCoreJava.StaticDemo;

public class NonStaticVariableInStaticMethod {
   /* int a = 40;// non static

    public Static void main(String args[]) {
        System.out.println(a); //error because non static declare but main method is static aahe mhnun non static  ch variable he static mday output yet nahi error dakhvato
    }*/

     static int a =40; // static

    public static void main(String[] args) {
        System.out.println(a); // 40
    }
}
