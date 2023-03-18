package Com.LineComparision;
// constuctors
public class StringLearing {
    public StringLearing(int a) {
        System.out.println("in constructor: " + a);
    }

    public StringLearing() {
        System.out.println("in constructor");
    }

    public static void main(String[] args) {
        System.out.println("before constructor");
        StringLearing str = new StringLearing();
        System.out.println(str.hashCode());
        System.out.println("after constructor");
    }

}
