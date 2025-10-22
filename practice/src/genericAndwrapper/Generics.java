package genericAndwrapper;

public class Generics {
    static void main(String[] args) {
//        Dog d1 = new Dog("123hgd");
//        Dog d2 = new Dog("456jkl");

        Dog<String> d1 = new Dog<>("123hgd");
        Dog<String> d2 = new Dog<>("456jkl");

        // in future i want change data type
//         Dog d3 = new Dog(55);
        Dog<Integer> d3 = new Dog<>(55);
        System.out.println(d3.getId());
    }
}
class Dog<GEN>{
    GEN id;

    public Dog(GEN id){
        this.id = id;
    }

    GEN getId(){
        return id;
    }
}



