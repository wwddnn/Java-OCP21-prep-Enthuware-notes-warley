package org.exercises.interface1;

public class Test1 {

    interface Classic {
        int version = 1;
        public void read();
    }

    static class MediaReader implements Classic {
        int version = 2;
        public void read() {
            System.out.println(Classic.version); // ou  (((Classic) this).version)
        }
    }

    public static void main(String[] args) {
        MediaReader mr = new MediaReader();
        mr.read();
    }

    //uma questão sobre interface
    //os campos da interface sao implicitamente final static
    //queremos que o metodo read() da class MediaReader imprima o campo version = 1 que esta na interface
    //entao para acessar esse campo usamos Classic.version com nome da interface na frente e o ponto para acessar o campo da interface
}
