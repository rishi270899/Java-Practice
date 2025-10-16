package setExample;
import java.util.*;
public class SetExercise {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<String>();
           numbers.add("10");
           numbers.add("11");
           numbers.add("10");
           numbers.add("11");

           Set<String> uniqueNumbers = new HashSet<String>(numbers);

           for(String number : uniqueNumbers){
               System.out.println(number);
           }
    }
}
