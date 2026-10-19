package org.exercises.ooa;

public class Onion {
    private String data = "skin";

    private class Layer extends Onion {
        String data = "thegoodpart";
        public String getData() {
            return data;
        }
    }
    public String getData() {
        return new Layer().getData();
    }

    static void main(String[] args) {
        var o = new Onion();
        System.out.println(o.getData());
    }

    //otima questao! dentro do metodo main quando criamos um objeto do tipo Onion, e na linha seguinte chamamos o.getData() ocorre o seguinte...
    //... esse metodo vai retornar um novo objeto com o tipo Layer e vai chamar o metodo getData() desse Layer que é a inner class ...
    //... então teremos o retorno desse metodo chamando a variavel 'data' que esta dentro da propria inner class, o resultado final sera a impressao de "thegoodpart".
}
