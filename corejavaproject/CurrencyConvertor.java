package corejavaproject;

import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("welcom to the currency convertor");
        System.out.println("1 convert inr to usd");
        System.out.println("2 convert usd to inr");
        System.out.println("3 quit");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                convertInrToUsd();
                break;
            case 2:
                convertUsdToInr();
                break;
            case 3:
                System.out.println("thank you");
                return;
            default:
                System.out.println("Invalid choice.please try again");


        }
    }

    private static void convertInrToUsd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER the amount in usd: ");
        double usdamount = scanner.nextDouble();
        double inrAmount = usdamount * 83.5;
        System.out.println(usdamount + "USD IS EQUIVALENT TO" + inrAmount + "INR");
    }

    private static void convertUsdToInr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER the amount in inr: ");
        double inramount = scanner.nextDouble();
        double usdamount = inramount / 83.5;
        System.out.println(inramount + "inr IS EQUIVALENT TO" + usdamount + "INR");

    }
}