package org.exercises.overridingPolimorphism._7;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public List<Number> getList() {
        return null;
    }

    class B extends Test {

        @Override
        public ArrayList<Number> getList() { //é valido pois ArrayList é subtipo covariante de List, e o generics mantem o mesmo que é Number
            return null;
        }
    }
    //essa questao trata de polimorfismo usando override que é a sobrescrita de metodo
    //o tipo de retorno pode ser igual ou subtipo, por exemplo nesse caso podemos usar o List ou ArrayList que esta correto, mas nao podemos usar Object
    //quanto ao generics é necessario manter igual, entao continua <Number>
}
