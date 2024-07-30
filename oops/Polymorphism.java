package oops;

public class Polymorphism {
    public static void main(String[] args) {
//        method calling for addition integer
//       8 int
//      16 double
        System.out.println("m1 "+"="+add(5,6)+" m2"+"=" +add(2.5,9.3));
    }
    private static double add(double v,double v1){
//        double value=v+v1;
        return v+v1;
    }

    private static int add(int a,int b) {
//        int c=a+b;
        return (a+b);
    }
}
