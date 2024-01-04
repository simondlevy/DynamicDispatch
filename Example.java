class C1 {

    public int m1() {
        return 1;
    }

    public int m2() {
        return this.m1();
    }
}

class C2 extends C1 {

    public int m1() {
        return 2;
    }

    public int m3() {
        return super.m1();
    }
}

public class Example {

    public static void main(String [] args) {

        C1 o1 = new C1();
        C2 o2 = new C2();

        System.out.printf("o1.m1=%d\n", o1.m1());
        System.out.printf("o2.m1=%d\n", o2.m1());

        System.out.printf("o2.m3=%d\n", o2.m3()); // ???
        System.out.printf("o2.m2=%d\n", o2.m2()); // ???
    }


}
