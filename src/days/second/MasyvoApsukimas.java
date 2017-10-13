package days.second;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MasyvoApsukimas {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite masyvo ilgi: ");
        int masL = getNumber(scan);
        int[] mas = new int[masL];
        for (int i = 0; i < mas.length; i++) {
            System.out.println("Iveskite " + i + " skaiciu");
            mas[i] = getNumber(scan);

        }
        printMas(mas);
        System.out.println();
        reverse(mas);
        System.out.println();
        System.out.println("Didziausias masyvo elementas yra " + didziausias(mas));
        aToZ(mas);

    }

    private static int didziausias(int[] mas) {
        int max = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        return max;
    }


    private static void aToZ(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {


                if (mas[i] < mas[j]) {
                    int min = mas[i];
                    mas[i] = mas[j];
                    mas[j] = min;
                }
            }
        }
        printMas(mas);
    }


    private static void reverse(int[] mas) {
        int[] temp = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            int k = mas.length - 1 - i;
            temp[i] = mas[k];
        }
        printMas(temp);

    }

    private static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

    }

/*        System.out.println("Iveskite skaicius (atskiriant tarpu)");
        String value = scan.nextLine();
        String[] skaiciai = value.split(" ");

        for (int i = 0; i < skaiciai.length / 2; i++) {
            //for (int j = skaiciai.length / 2; j > 0; j--){
            int l = skaiciai.length - i;
            String tarp = null;
            skaiciai[i] = tarp;
            skaiciai[i] = skaiciai[l];
            skaiciai[l] = tarp;

            //}
        }
        System.out.println("");*/


    private static int getNumber(Scanner scan) {
        int k = 0;
        while (true) {
            try {
                k = scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Turi buti skaicius");
                scan.nextLine();
            }
        }
        return k;

    }
}
