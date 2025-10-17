package mathfunction;

public class MathFunction {
    static void main(String[] args) {
        int a = 15;
        int b = 21;
//        System.out.println(Math.min(a, b));
//        System.out.println(Math.sqrt(81));
//        System.out.println(Math.pow(4,5));
//        System.out.println(Math.abs(-8));
//        System.out.println((int)(Math.random()*6 + 1));
        System.out.println((int)(Math.random()*(b-a+1) + a));
    }
}
