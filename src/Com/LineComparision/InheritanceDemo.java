package Com.LineComparision;

public class InheritanceDemo {
    public static void main(String[] args) {
        B objB = new B();
        objB.methodB();
        objB.methodA();
        A objA = new A();
        objA.methodA();
    }
}
class A {
    public void methodA() {
        System.out.println("In method A of class A");
    }
}
class B extends A{
    public void methodB() {
        System.out.println("In method B of class B");
    }
}
