package exceptionExample;

public class PhoneExceptionTester {
    public static void main(String[] args){
        String[] numbers = new String[] {"123-4567", null, "234-4567", "345-5687"};
        String[] phones = new String[] {"Iphone", "Samsung", "Lg", null};
        for (int i = 0; i < numbers.length; i++){
            try {
                System.out.println(new Phone(phones[i], numbers[i]));
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getLocalizedMessage());
            }
        }
    }
}
