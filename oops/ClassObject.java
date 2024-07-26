package oops;
import java.util.Scanner;

public class ClassObject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=sc.nextLine();
        Trainer trainer=new Trainer();
        trainer.trainername="anuj tripathi";
        trainer.trainerTechnology="java";
        System.out.println("my name is "+trainer.trainername+
                "my technology is"+trainer.trainerTechnology);
        trainer.printTrainerprofile(trainer.trainername,trainer.trainerTechnology);

    }

}class  Trainer{
    String trainername;
    String trainerTechnology;
    void printTrainerprofile( String name,String technology){
        System.out.println(name+technology);


        }

    }

class student{
    String studentName;
    String studentEnrolledTechnology;
}
