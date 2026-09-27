public abstract class B {
    private int i;

    B(int i) {
        this.i = i;
    }

    abstract int m1(int i);

    class C {
        private int j;

        C(int j) {
            this.j = j + i;
        }

        String m2(String s) {
            return s.replace('a', 'b') + " " + j;
        }
    }

    int m4() {
        return i;
    }
}