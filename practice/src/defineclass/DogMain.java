package defineclass;

public class DogMain {
    public static void main(String[] args){
        Dog dog1 = new Dog("Brown","Tommy", "German Sheperd", 5);
//        System.out.println(dog1);
        Dog dog2 = new Dog("Black", "Leo", "Wolf",9);
//        System.out.println(dog2);
        System.out.println(dog2.getDogColor());
        System.out.println(dog2.getDogName());
    }
}
