package org.exercises.switchExpress;

sealed class Automobile permits Car, Bus {
        public static Automobile getSomething(){ //metodo estatico que retorna um objeto do tipo Car, Bus ou Automobile
            final int x = 1;
            return switch(x){
                case 0 -> new Car();
                case 1 -> new Bus();
                default -> new Automobile();
        };
    }
    static void main() {
            Automobile a = Automobile.getSomething();
            System.out.println(a);
    }
}
