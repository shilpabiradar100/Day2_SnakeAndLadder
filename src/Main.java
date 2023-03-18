public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
/*public static void main(String args) {
        System.out.println("1");
    }
    public final int main(int args) {
        System.out.println("3");
        return args;
    }
    public static final strictfp void main(String[] args) {
        System.out.println("2");
    }
]*/
/*public static final strictfp void main(String[] args) {
        add(10, 20);
    }
    public static void add(int a, long b) {
        System.out.println("1");
    }
    public static void add(long a, int b) {
        System.out.println("2");
    }*/

//method ovrriding =
/*//methodOverriding
//1. must be in diff clas where have IS-A relation
//2. method name must be same
//3. number type and seq of arguments must be same
//4. signature must be same
public class MethodOverridingDemo {
    public static void main(String[] args) {
        ICICI i = new ICICI();
        i.ROI();

//        RBI obj1 = new RBI();
//        RBI obj2 = new ICICI();
//        ICICI obj3 = new RBI();
    }
class RBI {
    public void ROI() {
        System.out.println("K class show(): 5%");
    }
}

class ICICI extends RBI {
    @Override
    public void ROI() {
        super.ROI();
        System.out.println("L class show(): 7%");
    }
}*/

//encapsulation =
/*
    KALPESH10:09
    class UserInputs {
        private int age;
        public void setAge(int userAge) {
            if (userAge > 18) {
                System.out.println("Welcome");
                age = userAge;
            } else {
                System.out.println("Age Invalid");
            }
        }
        public int getAge() {
            return age;
        }
    }
    public class GenericsDemo {
        public static void main(String[] args) {
            UserInputs u = new UserInputs();
            u.setAge(15);
        }
    }
*/

/*//DRY
//SOLID
//S->SRP
//O-> Open for extension close for modification
//K- Key
//v- Value
//T - Type
//E- Element
//R- Return
//U - Extra
class UserInputs<T,U> {
    private T a;
    private U b;
    public T getA() {
        return a;
    }
    public void setA(T a) {
        this.a = a;
    }
    public U getB() {
        return b;
    }
    public void setB(U b) {
        this.b = b;
    }
}
public class GenericsDemo {
    public static void main(String[] args) {
        UserInputs<Integer,Float> in = new UserInputs();
        in.setA(10);
        in.setB(20.20f);

        UserInputs<Float,String> in1 = new UserInputs<Float,String>();
        in1.setA(10.20f);
        in1.setB("abc");

        UserInputs<String,Long> in2 = new UserInputs<>();
        in2.setA("abc");
        in2.setB(1234l);
    }
}*/

//interface
/*
//abstract class
//interface
public class AbstractionDemo {
    public static void main(String[] args) {
        DemoInterface obj = new SubDemoA();
        obj.show();
    }
}

//0-100% abstraction
abstract class DemoA {
    abstract public void show();
    public void display() {
        System.out.println("In display method");
    }
}
interface DemoInterface {
    abstract public void show();
    public void display();
}

//C Ext C
//C Imp I
class SubDemoA implements DemoInterface {
    @Override
    public void show() {
        System.out.println("Show Method");
    }
    @Override
    public void display(){
        System.out.println("In Display");
    }
}*/

//regex
/*public static void main(String[] args) {
        String name = "Kalpesh";
        String nameRegex = "^[A-Z]{1}[a-z]{2,}$";

        Pattern p = Pattern.compile(nameRegex);
        Matcher m = p.matcher(name);
        boolean flag = m.matches();
        System.out.println(flag);

        String mobileNumber = "91 9876543210";
        String numberRegex = "^[91]{2}\\s[6789]{1}[0-9]{9}$";
        boolean flag2 = Pattern.matches(numberRegex, mobileNumber);
        System.out.println(flag2);
}*/