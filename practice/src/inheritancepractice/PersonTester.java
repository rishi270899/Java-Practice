package inheritancepractice;

public class PersonTester {
    static void main(String[] args) {
        Person sally = new Person("Sally", "Philpi");
        System.out.println(sally);
        Person mike = new Student("Mike", "Thompson", "12345");
        System.out.println(mike);
        StudentEmployee jeff = new StudentEmployee("Jeff", "Sam", "4567", 514.5, "#4872");
        System.out.println(jeff);
    }
}
