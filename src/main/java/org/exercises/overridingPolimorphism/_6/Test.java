package org.exercises.overridingPolimorphism._6;

import java.util.List;

public class Test {

    public List<? extends Number> getList() {
        return null;
    }

    class B extends Test {
        @Override
        public List<? extends Integer> getList() { //é valido, pois tem o mesmo tipo List, e subtipo <? extends Integer> é subtipo de <? extends Number>
            return null;
        }

        //@Override
        //public List<Integer> getList(){ //é valido, pois o tipo é o mesmo List, e o <Integer> é subtipo de <Number>
        //    return null;
        //}

        //@Overide
        //public ArrayList<Integer> getList() { //é valido, pois o tipo ArrayList é subtipo de List, e <Integer> é  subtipo de <Number>
        //return null;
        //}
    }
}
