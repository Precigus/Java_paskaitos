package days.second;

import java.util.Scanner;

public class StaciakampioPlotas {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Iveskite krastiniu ilgius (atskiriant tarpu): ");
        String values = scan.nextLine();
        String[] split = values.split(" ");

        if (split.length == 2) {
            try {
                int val1 = Integer.valueOf(split[0]);
                int val2 = Integer.valueOf(split[1]);
                System.out.println("Staciakampio plotas --> " + sandauga(val1, val2));
            }catch(NumberFormatException e) {
                System.out.println("Blogas ivedimo formatas");
            }
            }
        else {
            System.out.println("Neteisingai ivesti skaiciai. Bandykite dar karta.");
        }
    }


    private static int sandauga(int a, int b) {
        int c;
        return c = a * b;
    }
}


