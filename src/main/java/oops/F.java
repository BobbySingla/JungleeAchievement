package oops;

class G {
    public static void disp() {
        System.out.printf("metho d 1");
    }
}

public class F extends G {
    public static void disp() {
        System.out.printf("method 2");
    }

    public static void main(String[] args) {
        G f = new F();
        f.disp();
        G g = new G();
        g.disp();
    }
}
