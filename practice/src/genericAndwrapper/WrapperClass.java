package genericAndwrapper;

public class WrapperClass {

    static void main(String[] args) {
        Integer obj = new Integer(12);

        Integer obj2  = Integer.valueOf(12);

        Integer obj3 = 12; // AutoBoxing

        int age = obj3; // UnBoxing

//        printValues();

        // print all the value
            System.out.println("obj: " + obj);
            System.out.println("obj2: " + obj2);
            System.out.println("obj3: " + obj3);
            System.out.println("age: " + age);

    }
}
