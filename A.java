public class A extends B {
    private int i;

    public A(int m) {
        super(m);
        this.i = m;
    }

    public int m1(int m) {
        return i + m;
    }

    public String m3(int n) {
        return Integer.toString(n * 2);
    }

    public C m2(int n) {
        C ret = new C(n);
        return ret;
    }
}