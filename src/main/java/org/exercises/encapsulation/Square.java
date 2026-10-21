package org.exercises.encapsulation;

public class Square {
    private double side = 0; //esse campo deve ter o modificador private para proteger o atributo da classe
    //double area; //retirar esse campo, pois ele deve ser um metodo, area é o resultado de side * side

    public Square(double length) {
        this.side = length;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() { //esse metodo deve ser publico para ser acessivel
        //return area;
        return side * side; //esse deve ser o retorno do metodo area, que é a multiplicacao de side * side que vai retornar o valor da area. por isso area deve ser um metodo e nao um campo
    }

    public static void main(String[] args) throws Exception {
        Square sq = new Square(10.0);
        System.out.println(sq.getArea());
    }
    //a questao trata de melhorias no codigo em termos de encapsulamento.
    //devemos sempre manter os campos como private e os metodos como public para o facil acesso.
    //nessa questao o campo side deve ser private, e o campo area nao deve existir pois area deve ser um metodo e nao um campo ja que é calculado multiplando side * side
    //em relacao ao metodo getArea() devemos colocar seu modificador como public e seu retorno como side * side
}
