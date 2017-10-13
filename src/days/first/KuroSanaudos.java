package days.first;


import java.util.InputMismatchException;
import java.util.Scanner;

public class KuroSanaudos {

/*private static int kilometrai;
private static double sanaudos;


        public static void main(String[] args) {
            nuskaitymas();
            vidurkis();
            System.out.println(vidurkis());
        }



        private static void nuskaitymas () {
            Scanner sc = new Scanner (System.in);
            System.out.println("Iveskite nuvaziuotus kilometrus");
            int kilometrai = sc.nextInt();
            System.out.println("Iveskite kuro sanaudas");
            double sanaudos = sc.nextDouble();
        }

            double kuras100 = 100 * sanaudos / kilometrai;
            System.out.println("100km sunaudoja " + vidurkis(kilometrai, sanaudos) + " l kuro");


    private static double vidurkis (){
        return 100 * sanaudos / kilometrai;
    }*/


    public static void main(String[] args) {
        System.out.println(readData());
    }

    private static double readData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite nuvaziuotus kilometrus");
        double km = getCorrectValue(scanner);
        System.out.println("Iveskite kuro sanaudas");
        double l = getCorrectValue(scanner);
        return average(km, l);
    }

    private static double average(double km, double l) {
        return l * 100 / km;
    }


    private static double getCorrectValue(Scanner scanner) {
        double response = 0.0;

        while (true) {
            try {
                response = scanner.nextDouble();
                break;

            } catch (InputMismatchException e) {
                System.out.println("Ivesta bloga verte, pakartok");
                scanner.nextLine();
            }
        }
        return response;
    }
}