package days.second;

import java.util.Scanner;

public class MainCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite du skaicius ir operacija (pvz: x + y)");
        String insertVal = scanner.nextLine();
        String[] split = insertVal.split(" ");

        Calculator calculator = new Calculator();
        if (split.length == 3) {
            try {
                int numb = Integer.valueOf(split[0]);
                int numbSec = Integer.valueOf(split[2]);
                int result = 0;
                switch (split[1]) {

                    case "+":
                        result = calculator.suma(numb, numbSec);
                        break;

                    case "-":
                        result = calculator.skirtumas(numb, numbSec);
                        break;

                    case "*":
                        result = calculator.sandauga(numb, numbSec);
                        break;

                    default:
                        System.out.println("Nera tokios operacijos");
                        break;      // brake prie default nebutinas


                }
                System.out.println("Rezultatas --> " + result);
            }catch (NumberFormatException e){
                System.out.println("Blogai ivestas formatas");
            }
        } else {
            System.out.println("Bandyk is naujo");
        }

    }
}
