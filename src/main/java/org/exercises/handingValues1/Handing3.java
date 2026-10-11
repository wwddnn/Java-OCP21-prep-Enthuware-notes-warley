package org.exercises.handingValues1;
//Operations, promotion, casting
public class Handing3 {
    static void main() {
        Integer a = 10;
        Integer b = new Integer(10);
        int c = 10;
        String d = "home";
        String e = new String("Home");
        Long f = 10L;

        //test1
        System.out.println(a == b);

        //test2
        System.out.println(a.equals(b));

        //test3
        System.out.println(a == c); //Unboxing in Integer a

        //test4
        System.out.println(d.equals(e));

        //test5
        System.out.println(d == e);

        //test6
        System.out.println(a.equals(f));
    }
}
