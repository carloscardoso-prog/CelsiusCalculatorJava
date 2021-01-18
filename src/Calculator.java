import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        printMenu();

        int type = new Scanner(System.in).nextInt();
        int value = valueReceiver();

        switch(type){
            case 1:
                    result(convertFtoC(value), type);
                break;

            case 2:
                result(convertCtoF(value), type);
                break;

            case 3:
                System.out.println("Bye bye!");
                System.exit(0);
                break;

            default:


        }

    }

    public static void printMenu(){

        System.out.println("Hello, welcome to the calculator. \n");
        System.out.println("1- F to C.");
        System.out.println("2- C to F.");
        System.out.println("3- Exit");
        System.out.print("Please, type which option do you want:");

    }

    public static int valueReceiver(){

        System.out.print("Ok, please type the value:");
        int value = new Scanner(System.in).nextInt();
        return value; //não consegui retornar direto
    }

    public static void result(Double value, int type){

        switch (type) {
            case 1:
                System.out.printf("Your result was: %.2f Cº", value);
                break;
            case 2:
                System.out.printf("Your result was: %.2f Fº", value);
                break;
        }
    }


    public static Double convertCtoF(double value){

        return (value * 1.8) - 32;
    }

    public static Double convertFtoC(double value){

        return (value * 1.8) - 32;
    }



}
