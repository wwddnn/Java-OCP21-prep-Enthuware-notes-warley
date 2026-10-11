package org.exercises.arrays1;
public class Array8 {
    static void main(String... args) {
            try {
                System.out.println(args[args.length-1]);
                return;
            }
            catch (ArrayIndexOutOfBoundsException e) {    }

            main("House");
    }
}
