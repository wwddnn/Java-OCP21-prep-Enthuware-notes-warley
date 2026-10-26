package org.exercises.programFlow._1;

public class Test1 {
    void loop() {
        var c = 0;
        Jack: while (c < 8) {
            Jill:
            {
                System.out.println(c);
                if (c > 3) break Jack; else c++; //usar o break Jack é essencial para quando o c for maior que 3 ele sair do while e encerrar o programa, imprimindo no total ate aqui de 0 a 4
            }
        }
    }

    static void main() {
        Test1 t = new Test1();
        t.loop();
    }
}

