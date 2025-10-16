package creatingclass;

public class Dog {
   private String dogType;
   private String dogName;
   private String dogColor;
   private int dogAge;

    // This is constructor to initialize Dog field
    public Dog(String dogType, String dogName, String dogColor, int dogAge){
        super();
        this.dogType = dogType;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    public Dog(){

    }

    // Getter method to retrieve the value of Dog

    public String getDogType() {
        return dogType;
    }
    public String getDogName() {
        return  dogName;
    }
    public String getDogColor() {
        return dogColor;
    }
    public  int getDogAge() {
        return  dogAge;
    }

    // Set or mutator method

    public void setDogType(String dogType) {
        this.dogType = dogType;
    }
    public void setDogName(String dogName){
        this.dogName = dogName;
    }
    public void setDogColor(String dogColor){
        this.dogColor = dogColor;
    }
    public void setDogAge(int dogAge){
        this.dogAge = dogAge;
    }

    @Override
    public String toString() {
        return "Dog type:" + dogType + " Dog name:" + dogName + " Dog Color:" + dogColor + " Dog age" + dogAge;
     }

}
