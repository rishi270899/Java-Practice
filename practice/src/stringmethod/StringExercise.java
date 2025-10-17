package stringmethod;

public class StringExercise {
    static void main(String[] args) {
        String text = "rishi";
        String text2 = "rishi";
        String text3 = new String("rishi");

        if(text2.equals(text3)){
            System.out.println("same value");
        }else{
            System.out.println("not same");
        }
//        if(text == text2){
//            System.out.println("Same");
//        } else {
//            System.out.println("not same");
//        }
//
//        if(text == text3){
//            System.out.println("Same name");
//        }else{
//            System.out.println("not same");
//        }

//        int a = 4;
//        int b = 4;
//        if(a == b){
//            System.out.println("same");
//        } else{
//            System.out.println("not same");
//        }
    }
}
