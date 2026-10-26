package org.exercises.arrays._2;
public class Paper {
    public String title;
    public int id;
    public Paper(String title, int id){
        this.title = title;
        this.id = id;
    }
    public static void main(String[] args) {
        var papers = new Paper[]{
                new Paper("T1", 1),
                new Paper("T2", 2),
                new Paper("T3", 3)
        };
        System.out.println(papers);
        System.out.println(papers[1]);
        System.out.println(papers[1].id);
    }
}

