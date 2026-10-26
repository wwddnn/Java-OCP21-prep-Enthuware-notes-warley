package org.exercises.overrridingPolimorfism;

import java.util.ArrayList;
import java.util.List;

public abstract class Test2 {


    public List<? super Integer> getList() {
        return  null;
    }

    class B extends Test2 {
        @Override
        public List<? super Number> getList() { //valido. o tipo List é mantido. o generics com wildcards e super Number mantem a compatibilidade entre generics
            return null;
        }

        //@Override
        //public List<? extends Integer> getList() { //nao é valido. o generics com extends Integer quebra a compatibilidade
        //    return null;
        //}

        //@Override
        //public ArrayList<Number> getList() { //valido. o tipo ArrayList é um subtipo de List, tudo ok. o generics Number mantem a compatibilidade entre generics
        //    return null;
        //}

    }
}
