package class_and_objects;

public class LearnConstructor {
   public static void main(String[] args) {
       Complex complex = new Complex(2,3);
       Complex comple2 = new Complex(5,6);
//       complex.print();
//       comple2.print();

    }
}

class Complex{
    int a, b;

    public Complex(int a, int b){
        this.a = a;
        this.b = b;
    }
    void print(){
        System.out.println(a+ " and "+b);
    }
}

