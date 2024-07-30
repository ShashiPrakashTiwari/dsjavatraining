package oops;

public class CalculatoriInheritance extends calculator {
    public static void main(String[] args) {


        calculator calculator = new calculator();
        System.out.println(calculator.add(4, 5));
        System.out.println(calculator.sub(4,3));
        System.out.println(calculator.mul(4,3));
        System.out.println(calculator.div(4,3));
    }
}
class calculator {
    int add(int a,int b){
        return a+b;
    }


    int sub(int a,int b) {
        return a-b;
    }

    int  mul(int a,int b) {
        return a*b;
    }
    int div(int a,int b){
        return a/b;
    }
    }


