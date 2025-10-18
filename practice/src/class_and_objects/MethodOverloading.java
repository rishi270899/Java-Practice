package class_and_objects;

public class MethodOverloading {
    static void main(String[] args) {
        Greet greet = new Greet();
        greet.greeting();
        greet.greeting("Rishi");
        greet.greeting("rishi", 5);
    }
}

class Greet{
void greeting(){
    System.out.println("Hello, Good Morning");
}
void greeting(String name){
    System.out.println("Hello "+ name + ", Good Morning");
}

void greeting(String name, int count){
    System.out.println(name + " " +  count);
}
}
