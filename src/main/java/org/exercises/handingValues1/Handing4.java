package org.exercises.handingValues1;
public class Handing4 {
    static void main() {
        int x = 10, y = 20;
        int dx, dy;
        try{
            dx = x % 5;
            dy =  y/dx;
        }catch(ArithmeticException ae){
            System.out.println("Caught AE");
            dx = 2;             dy = y/dx;
        }
        x = x/dx;
        y = y/dy;
        System.out.println(dx+" "+dy);
        System.out.println(x+" "+y);
    }
}
