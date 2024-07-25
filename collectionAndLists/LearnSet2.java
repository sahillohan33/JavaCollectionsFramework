package collectionAndLists;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }


}
public class LearnSet2 {
    public static void main(String[] args) {
        Set<Student> set=new HashSet<>();
        Student s1=new Student(1,"Preeti");
        Student s2=new Student(1,"Preeti");
        System.out.println(s1.equals(s2));
        set.add(new Student(101,"Sahil"));
        set.add(new Student(102,"Ankit"));
        set.add(new Student(102,"Ankit"));
        System.out.println(set);
    }
}
