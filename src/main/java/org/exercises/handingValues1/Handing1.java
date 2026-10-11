package org.exercises.handingValues1;
public class Handing1 {
    static int mx(int s){
        for(int i=0; i<3; i++){
            s = s + i;
        }
        return s;
    }
    static void main() {
        System.out.println(mx(5));
    }
}
