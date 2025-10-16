package creatingclass;

public class DogMain {
    public static void main(String[] args){
        Dog myDog = new Dog("Labrador", "Buddy", "Golden", 3);
        // Use the methods of the Dog class
        System.out.println(myDog.getDogType());
        System.out.println(myDog.getDogName());
        System.out.println(myDog.getDogColor());
        System.out.println(myDog.getDogAge());

        // Or print the entire information using the toString method
        System.out.println(myDog);
        Dog myDog2 = new Dog("Wild", "Ramu", "Black", 5);
        // Use the methods of the Dog class
        System.out.println(myDog2.getDogType());
        System.out.println(myDog2.getDogName());
        myDog2.setDogColor("red");
        System.out.println(myDog2.getDogColor());
        System.out.println(myDog2.getDogAge());

        // Or print the entire information using the toString method
        System.out.println(myDog2);

        Dog myDog3  = new Dog();
        myDog3.setDogAge(5);
        myDog3.setDogName("Labra");
        myDog3.setDogType("lonley");
        myDog3.setDogColor("Orange");
        System.out.println("----------------------------")
;        System.out.println(myDog3.getDogAge());
        System.out.println(myDog3.getDogColor());
        System.out.println((myDog3.getDogType()));
        System.out.println((myDog3.getDogName()));



    }
}
