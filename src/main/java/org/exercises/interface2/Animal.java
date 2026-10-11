package org.exercises.interface2;

public class Animal implements Movable, Growable {
        //implements interface methods -
        public void move(int dx){
            System.out.println("its movable");}
        public void grow(int dy){
            System.out.println("its growable");}

    static void main() {
        System.out.println(offSet);
        System.out.println(Movable.offSet);
        var a = new Animal();
        var b = new Animal();
        a.move(10);
        b.grow(300);

        }
}
