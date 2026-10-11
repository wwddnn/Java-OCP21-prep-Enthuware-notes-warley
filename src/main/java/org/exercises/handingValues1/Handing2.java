package org.exercises.handingValues1;
public class Handing2 {
    static void main() {
        //what setence result in exactly 10 ?
        //1
        Object t = Integer.valueOf(106); //correct
        int k = ((Integer) t).intValue()/10;
        System.out.println(k);

        //2
        System.out.println(100/9.9);

        //3
        System.out.println(100/10.0);

        //4
        System.out.println(100/10); //correct

        //5
        System.out.println(3 + 100/10*2-13); //correct

        //6 //obs resolve % first
        int i = 21;
        float j = i%9+2;
        System.out.println((int)j);
    }
}
