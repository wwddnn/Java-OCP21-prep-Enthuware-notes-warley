package org.exercises.interfaces._2;

public class Test2 {

    interface Tool{    //1
        void operate(); //2
    }

    abstract class PowerTool implements Tool{ } //3

    class PowerSaw implements Tool{  //4
        @Override //5
        public void operate(){ }
    }

    class SteamPowerSaw extends PowerSaw{ //6
        @Override //7
        public void operate(){ }
    }

    //criamos uma interface Tool
    //criamos uma classe abstrata chamada PowerTool que implementa a interface Tool, e como é abstrata nao implementa o metodo da interface
    //criamos uma classe PowerSaw que implementa a interface Tool e seu metodo operate()
    //criamos uma classe StreamPowerSaw que extende a classe PowerSaw que por sua vez implementa o metodo da interface Tool indiretamente
}
