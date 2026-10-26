package org.exercises.record1._1;


public final class StudentSimilar {
    private final int id;
    private final String name;
    public StudentSimilar(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int id(){ //accessor method
        return id;
    }
    public String name(){ //accessor method
        return name;
    }

    @Override
    public String toString() {
        return "StudentSimilar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        StudentSimilar that = (StudentSimilar) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
