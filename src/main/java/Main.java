public class Main {
    public static void main(String[] args) {
        System.out.println(devision(6,2));
    }

    public static int devision(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("division bu zero");
        }
        int c = a / b;
        return c;
    }

}
