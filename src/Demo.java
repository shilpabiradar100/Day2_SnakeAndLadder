
    public class Demo {

        String location;
        int pincode;

        Demo() {
            System.out.println("Default constructor");
        }

        Demo(String location, int pin) {
            this.location = location;
            this.pincode = pin;

        }

        void display() {
            System.out.println(location + "   " + pincode);
        }

        public static void main(String[] args) {

            Demo d = new Demo();
            Demo d1 = new Demo("Chennai", 600096);

            d.display();
            d1.display();


        }
    }