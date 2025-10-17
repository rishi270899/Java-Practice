package arrayExercise;

public class ArrayPractice {
   public static void main(String[] args){
       int[] myInteger = new int[20];
       myInteger[10]  = 55;
       String myString[] = new String[50];

       for (int i = 0; i < myInteger.length; i++) {
           System.out.println(myInteger[i]);
       }

       for (int i = 0; i < myString.length; i++) {
          System.out.println(myString[i]);
       }
   }
}
