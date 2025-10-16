package javainonevideo.oops;

class Car {
  private int speed;
  private String color;

  public Car(int speed, String color){
      this.speed = speed;
      this.color = color;
  }

    void drive(){
        System.out.println("Driving car....");
        System.out.println(speed);
        System.out.println(color);
    }
}

