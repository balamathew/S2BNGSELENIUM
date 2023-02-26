package PackageB;

public class Protectedclass {

    protected class proclass {

        private int i = 0;
        public String s = "public string in defclass";
        protected char c = 'c';
        final String s2 = "final string in defclass";

        void defaul() {

            System.out.println("this is protected method in protected class");
        }

        public void pub() {

            System.out.println("this is public method in protected class");
        }

        private void pri() {

            System.out.println("this is pri method in protected class");
        }

        protected void prot() {

            System.out.println("this is public method in protected class");
        }

        protected void fin() {

            System.out.println("this is protected method in protected class");
        }

    }
}
