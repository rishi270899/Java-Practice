package genericAndwrapper;

import java.util.ArrayList;

public class GenericExercise {
    static void main(String[] args) {
        ArrayList<Object> values = new ArrayList<>();

        values.add("Rishi");
        values.add(27);
        values.add('a');
        values.add(true);

        for (Object value : values){
            System.out.println(value.getClass().getName() + " " + value);
        }
    }
}
