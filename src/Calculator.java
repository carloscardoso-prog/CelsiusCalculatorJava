import java.util.Scanner;

public class Calculator {

    public static double CalculumToC(){
        Scanner ValueReceiverC = new Scanner(System.in);

        double value1;

        value1 = ValueReceiverC.nextInt();

            ValueReceiverC.nextLine();

            value1 = (value1 * 1.8) + 32;

            return value1;

    }

    public static double CalculumToF(){
        Scanner ValueReceiverF = new Scanner(System.in);

        double value2;

        value2 = ValueReceiverF.nextInt();

            ValueReceiverF.nextLine();

            value2 = (value2 - 32) / 1.8;

            return value2;

    }

    public static void main(String[] args) {

        while(true) {

            String type;
            Scanner Calc = new Scanner(System.in);

            System.out.println("Hello, be welcome to the calculator. \n");
            System.out.println("Please, type which type of value you want to insert: celsius or fahrenheit.");
            type = Calc.nextLine();
            type.toLowerCase();

            if (type.equals("celsius")) {

                System.out.println("Converting Cº to Fº");
                System.out.println("Please type the value");
                double FinalResultC = CalculumToC();
                System.out.println(FinalResultC + " Fº is the result");
                System.out.println("Do you want to try again?");
                String answer1 = Calc.nextLine();
                answer1.toLowerCase();

                if(answer1.equals("yes")){
                    continue;
                }else{
                    System.out.println("Bye Bye");
                    break;
                }

            }else if(type.equals("fahrenheit")){

                System.out.println("Converting Fº to Cº");
                System.out.println("Please type the value");
                double FinalResultF = CalculumToF();
                System.out.println(FinalResultF + " Cº is the result");
                System.out.println("Do you want to try again?");
                String answer2 = Calc.nextLine();
                answer2.toLowerCase();

                if(answer2.equals("yes")){
                    continue;
                }else{
                    System.out.println("Bye Bye");
                    break;
                }

            }else{
                System.out.println("Please try again");
                continue;
            }

        }

    }

}
