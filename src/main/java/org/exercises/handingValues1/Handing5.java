package org.exercises.handingValues1;
public class Handing5 {
    static void main() {
        // equals compare where references point
        Object obj1 = new Object();
        Object obj2 = obj1;
        if( obj1.equals(obj2) ) System.out.println("true");
        else  System.out.println("false");
    }
}
