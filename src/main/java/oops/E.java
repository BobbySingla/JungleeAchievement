package oops;

class D {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

}

public class E {
    public static void main(String[] args) {
        D d = new D();
        System.out.println(d.sum(11, 10.5));

    }
}
