package collection;

import java.util.*;

public class SetExercise {
    static void main(String[] args) {

//        Set<String> name = new HashSet<>();  // O(1)
//        Set<Integer> val = new LinkedHashSet<>(); // O(n)
//          Set<Integer> val = new TreeSet<>();  // O(logn)

//        val.add(100);
//        val.add(90);
//        val.add(50);
//        val.add(10);
//        System.out.println(val);

   Set<Student>  students = new HashSet<>();

   students.add(new Student(1, "Rishi"));
   students.add(new Student(1, "Rishi"));
   students.add(new Student(1, "Rishi"));

        System.out.println(students);



    }
}


class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}


