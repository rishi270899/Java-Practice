public static void main(String[] args) {
    Dog dog = new Dog();
    dog.name = "Tommy";
    dog.bark();
    dog.walk();
}


static class Dog {
    // State of the objects
    String name;
    String color;
    String age;

    // Behaviour of the objects
    void bark(){
        System.out.println(name + " is barking");
    }void walk(){
        System.out.println(name + " is walking");
    }
}
