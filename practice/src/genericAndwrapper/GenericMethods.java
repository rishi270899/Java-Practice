package genericAndwrapper;

public class GenericMethods {

    static void main(String[] args) {
        printData("Hello world");
        printData(123);
        printData(45.67);

        GenericMethods obj = new GenericMethods();
        obj.displayData("Generic Methods");
        obj.displayData(1245);
    }

    static <E> void printData( E data){
        System.out.println(data);
    }

    <E> void displayData(E data){
        System.out.println(data);
    }
}
