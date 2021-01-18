import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        while(true) {
            calculator.printMenu();
            calculator.readMenuInput();
            }

        }

    private void printMenu () {

        System.out.println("Hello, welcome to the calculator. \n");
        System.out.println("Choose one of the options above: ");
        System.out.println("1- F to C.");
        System.out.println("2- C to F.");
        System.out.println("3- Exit");
        System.out.print("Please, type which option do you want: ");
    }

    private void readMenuInput(){

        int type;

        while(true){
            int menuOption = new Scanner(System.in).nextInt();
            if(menuOption == 1 || menuOption == 2){
                result(menuOption);
                break;
            }
            if(menuOption == 3){
                System.out.println("Bye bye!");
                System.exit(0);

            }else{
                System.out.println("Sorry, couldn't understand");
                break;
            }
        }

    }

    private void result (int type){

            double convertedValue = 0.0;
            if(type == 1){
                System.out.println("Converting Fahrenheit to Celsius");
                convertedValue = convertCtoF(valueCalc());
                System.out.printf("Result is %.2f Cº\n", convertedValue);
            }
            if(type == 2){
                System.out.println("Converting Celsius to Fahrenheit");
                convertedValue = convertFtoC(valueCalc());
                System.out.printf("Result is %.2f Fº\n", convertedValue);
            }
        }

    private double valueCalc(){
        System.out.println("Please type the value");
        String value = new Scanner(System.in).nextLine();

        if(value.contains(",") && !value.contains(".")){
            value = value.replace(",", ".");
        }

        return Double.parseDouble(value);
    }


    private Double convertCtoF (double value){

        return (value * 1.8) + 32;
    }


    private Double convertFtoC (double value){

        return (value - 32) / 1.8;
    }


}

