package org.exercises.overridingPolimorphism._3;

import java.util.ArrayList;
import java.util.List;

public class Test1{
  class A {
      public List<Number> getList() {return getList(); };
  }

  class B extends A {
      @Override
      public ArrayList<Number> getList() {return getList();}; //correto, o retorno pode ser ArrayList que é um sobtipo de List, covariancia ok e tem que manter o generics <<Number> ok

      //@Override
      //public List<Integer> getList(){return getList();} //errado, pois manteve o tipo de retorno List, mas alterou o generics para <Integer>.

  }

  //questao sobre override, sobrescrita de metodos, polimorfismo.
  //na classe A temos um metodo getList() que retorna uma List do tipo Number.
  //na classe B temos um override do metodo, que tem que ter o mesmo nome ou seja getList, e pode ter covariancia de tipos de retorno, nesse caso pode ser ArrayList ja que é subtipo de List
  //ainda na classe B temos que manter a invariancia de tipos genericos, ou seja, se o tipo generico é <Number> entao deve ser o mesmo quando fazemos override do metodo

  //o java exige que ocorra a invariancia em tipos genericos, nao podemos mudar o tipo generics, tem que ser o mesmo do original, nesse caso <Number>
}
