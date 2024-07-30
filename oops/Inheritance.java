package oops;

import javafx.scene.Parent;

public class Inheritance {
    public static void main(String[] args) {
        parents parents=new parents();
        parents.printParent();
        parents.printGrandParent();

    }
}
class parents extends GrandParents{
    void printParent(){
        System.out.println("im parent");
    }
}
class GrandParents{
    void printGrandParent(){
        System.out.println("i am grand parent");
    }
}