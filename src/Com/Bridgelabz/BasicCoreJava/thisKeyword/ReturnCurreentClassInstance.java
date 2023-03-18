package Com.Bridgelabz.BasicCoreJava.thisKeyword;
    class A3 {
        A3 getA() {
            return this;
        }

        void msg() {
            System.out.println("Hello java");
        }
    }

    class ReturnCurrentClassInstance {
        public static void main(String args[]) {
            new A3().getA().msg();
        }
    }

