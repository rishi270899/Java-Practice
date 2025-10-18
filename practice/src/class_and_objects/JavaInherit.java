package class_and_objects;

public class JavaInherit extends Vehicle {

    String color;

    public JavaInherit() {
        super(4);
        System.out.println("Java inherit constructor");
    }

    // method overriding
    void start(){
//        super.start();
        System.out.println("new car");
//        System.out.println(this);

    }

    void accelerate(){

    }


    static void main(String[] args) {
        JavaInherit car = new JavaInherit();
        car.start();
        car.wheelsCount = 41;
    }
}
