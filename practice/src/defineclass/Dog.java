package defineclass;

public class Dog {
    private String dogType;
    private String dogName;
    private String dogColor;
    private int dogAge;

    // constructor
    public Dog(String dogColor, String dogName, String dogType, int dogAge){
        super();
        this.dogColor = dogColor;
        this.dogName = dogName;
        this.dogType = dogType;
        this.dogAge = dogAge;
    }


    // getter method
    public String getDogType() {
        return dogType;
    }

    public String getDogName(){
        return dogName;
    }

    public String getDogColor(){
        return dogColor;
    }

    public int getDogAge(){
        return dogAge;
    }

    // setter method
    public void setDogName(String dogName){
        this.dogName = dogName;
    }

    public void setDogColor(String dogColor){
        this.dogColor = dogColor;
    }

    public void setDogType(String dogType){
        this.dogType = dogType;
    }

    public void setDogAge(int dogAge){
        this.dogAge = dogAge;
    }

    @Override
    public String toString(){
        return "Dog Type: " + dogType + "\n" +
                "Dog Name: " + dogName + "\n" +
                "Dog color: " + dogColor + "\n" +
                "Dog age: " + dogAge; // Assuming the last variable is 'dogAge', not 'dogColor' again
    }
}
