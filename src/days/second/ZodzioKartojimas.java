package days.second;

import java.util.Scanner;

public class ZodzioKartojimas {

    public static void main (String[] args){

        String b = "pabaiga";
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.printf("Iveskite zodi (noredami pabaigti parasykite 'pabaiga': ");
            String zodis = scan.nextLine();
            if (zodis.equals(b)) {
                break;
            } else {
                System.out.println(zodis);
            }
        }

    }

}
