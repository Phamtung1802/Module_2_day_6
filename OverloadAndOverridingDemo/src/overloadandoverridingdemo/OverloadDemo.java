package overloadandoverridingdemo;

public class OverloadDemo {
    public static void main(String[] args) {
        C c = new C();
        c.p(10);
        c.p(10.0);
    }

}
class C extends B {
    public void p(int number) {
        System.out.println(number);
    }
}
