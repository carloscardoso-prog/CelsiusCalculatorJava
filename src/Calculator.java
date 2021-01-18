import com.sun.jdi.Value;

import java.util.Scanner;

public class Calculator {

    public static String CalculumToC(){
        Scanner ValueReceiverC = new Scanner(System.in);

        double value1;
        String FV;

        value1 = Double.parseDouble(ValueReceiverC.nextLine());

            value1 = (value1 * 1.8) + 32;

            value1 = value1 * 100;
            value1 = Math.round(value1);
            value1 = value1 / 100;
            FV = String.valueOf(value1);
            FV = FV.replace('.', ',');

        return FV;

    }

    public static String CalculumToF(){
        Scanner ValueReceiverF = new Scanner(System.in);

        double value2;
        String FV;

        value2 = Double.parseDouble(ValueReceiverF.nextLine());

            value2 = (value2 - 32) / 1.8;

            value2 = value2 * 100;
            value2 = Math.round(value2);
            value2 = value2 / 100;
            FV = String.valueOf(value2);
            FV = FV.replace('.', ',');


        return FV;

    }

    public static void main(String[] args) {

        while(true) {

            int type;
            Scanner Calc = new Scanner(System.in);

            System.out.println("Hello, welcome to the calculator. \n");
            System.out.println("Please, type which option do you want:");
            System.out.println("1- F to C. \n2- C to F. \n3- Exit");
            type = Calc.nextInt();

            if (type == 2) {

                System.out.println("Converting Cº to Fº");
                System.out.println("Please type the value");
                String FinalResultC = CalculumToC();
                System.out.println(FinalResultC + " Fº is the result");

                    //continue

            }else if(type == 1){

                System.out.println("Converting Fº to Cº");
                System.out.println("Please type the value");
                String FinalResultF = CalculumToF();
                System.out.println(FinalResultF + " Cº is the result");

                    //continue

            }else if(type == 3) {
                System.out.println("Bye bye");
                break;
            }else{
                System.out.println("Sorry, couldn't understand.");
                //continue
            }

        }

    }

}
