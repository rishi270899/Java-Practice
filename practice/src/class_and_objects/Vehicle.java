package class_and_objects;

public class Vehicle {

   final int gears = 0;
    static void main(String[] args) {
        Vehicle v1 = new Vehicle();
//        v1.gears  = 5;
    }


    int wheelsCount;



    void start(){
        System.out.println("Vehicle is start");
    }
    final void accelerate (){
        System.out.println("Vehicle is accelerate");
    }
    public Vehicle(){
        System.out.println("Vehicle Instance");
    }
    public Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("This wheel count constructor");
    }


}
