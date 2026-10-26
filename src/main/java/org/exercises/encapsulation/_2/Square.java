package org.exercises.encapsulation._2;

public class Square {
    private double side = 0; //private para o campo
    private double area; //private para o campo

    public Square(double length) {
        this.side = length;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) { //chama o metodo privado calculateArea()
        this.side = side;
        calculateArea();
    }

    double getArea() {
        return area;
    }

    private void calculateArea() { //colocar o metodo privado para que somente a classe Square possa usa-lo
        this.area = side * side;
    }

    public static void main(String[] args) throws Exception {
        Square sq = new Square(10.0);
        sq.setSide(10.0);
        System.out.println(sq.getArea());
    }

    //alterações feitas para melhorar o encapsulamento do codigo.
    //os campos ficaram privados
    //foi criado um metodo privado calculateArea() que realiza o side * side para achar a area
    //dentro do metodo publico setSide vamos passar o valor do side e ele ja realiza o calculo para a area com o metodo calculateArea()

}


