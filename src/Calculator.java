import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        int type;

        do{
            printMenu();

            type = new Scanner(System.in).nextInt();

            switch (type) {
                case 1:
                    double value = valueReceiver();
                    System.out.println("Converting Fahrenheit to Celsius");
                    result(convertFtoC(value), type);
                    break;

                case 2:
                    value = valueReceiver();
                    System.out.println("Converting Celsius to Fahrenheit");
                    result(convertCtoF(value), type);
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Sorry, couldn't understand");
                    continue;

            }
        }while(type != 3);

        System.out.println("Bye bye!");
        System.exit(0);

    }

        public static void printMenu () {

            System.out.println("Hello, welcome to the calculator. \n");
            System.out.println("1- F to C.");
            System.out.println("2- C to F.");
            System.out.println("3- Exit");
            System.out.print("Please, type which option do you want: ");

        }

        public static int valueReceiver () {

            System.out.print("Ok, please type the value: ");
            int double = new Scanner(System.in).nextDouble();
            return value; //não consegui retornar direto
        }

        public static void result (Double value,int type){

            switch (type) {
                case 1:
                    System.out.printf("Your result was: %.2f Cº \n", value);
                    break;
                case 2:
                    System.out.printf("Your result was: %.2f Fº \n", value);
                    break;
                default:

            }
        }


        public static Double convertCtoF ( double value){

            return (value * 1.8) + 32;
        }

        public static Double convertFtoC ( double value){

            return (value - 32) / 1.8;
        }


    }

