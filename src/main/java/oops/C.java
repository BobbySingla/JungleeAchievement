package oops;

class A {
    public void disp() {
        System.out.printf("disp method  1");
    }

    void make() {
        System.out.printf("method make 1");
    }
}

class B extends A {
    public void disp() {
        System.out.printf("disp method  1");
    }
}

public class C {
    public static void main(String[] args) {
//        B b=new A();
//       B b=new A();
//       b.make();
        A a = new B();
        a.disp();
    }

}
