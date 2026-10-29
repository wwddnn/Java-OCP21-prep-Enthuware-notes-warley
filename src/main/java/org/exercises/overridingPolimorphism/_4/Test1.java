package org.exercises.overridingPolimorphism._4;

import java.util.List;

public class Test1 {

    public List<? super CharSequence> getList(int id) {
        return null;
    };

    class Derived extends Test1 {
        @Override
        public List<? super Object> getList(int id) { //é valido pois no Override deve ser mantido o tipo ou seu subtipo, nesse caso mantem o List
            return null;                        //Object é uma superclasse de CharSequence
        }

        //@Override
        //public List<CharSequence> getList(int id) { //é valido. tipo List é tipo ou subtipo. CharSequence é compatível
        //    return null;
        //}

        //@Override
        //public List<? extends CharSequence> getList(int id) { //nao é valido pois extends inverte o sentido do limite de tipos e quebra a compatibilidade de retorno
        //    return null;
        //}

        //Override
        //public ArrayList<StringBuilder> getList(int id) { //nao é valido. apesar de ArrayList manter o subtipo, nao podemos dizer o mesmo sobre StringBuilder que viola a compatibilidade dos generics
        //return null;
        //}


        //@Override
        //public List<String>getList(int id) { //nao é valido. tipo List é valido, porem o String nao é mais especifico que CharSequence e viola a compatibilidade dos generics
        //return null;
        //}

    }
}