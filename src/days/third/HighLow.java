package days.third;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HighLow {

    public static int level;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int skaicius = chooseLvl(sc);

        System.out.println("Spejimu skaicius " + speliojimai(skaicius, sc));
    }


    private static int chooseLvl(Scanner sc) {
        int l = 0;
        boolean runUntil = true;
        while (runUntil) {
            System.out.println("Pasirinkite lygi:\t1 - skaiciai nuo 1 iki 10;\t 2 - skaiciai nuo 1 iki 100;\t 3 - skaiciai nuo 1 iki 1000");
            try {
                int lygis = sc.nextInt();
                switch (lygis) {
                    case 1:
                        l = 10;
                        runUntil = false;
                        break;
                    case 2:
                        l = 100;
                        runUntil = false;
                        break;
                    case 3:
                        l = 1000;
                        runUntil = false;
                        break;
                    default:
                        System.out.println("Nepasirinktas lygis. Bandykite dar karta.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Blogas formatas. Bandykite dar karta");
                sc.nextLine();
            }
            level = l;
        }
        return randomNumb(l);
    }

    private static int randomNumb(int a) {
        Random random = new Random();
        int val = random.nextInt(a);
        return val;
    }


    private static int speliojimai(int sk, Scanner sc) {
        System.out.println("Spekite skaiciu");
        //sc.nextLine()
        int kart = 0;
        String sp;
        do {
            if (level == 3&& kart >= 10) {
                System.out.println("Virsijojte spejimu skaiciu");
                break;
            }
            sp = sc.next();
            try {
                if (Integer.valueOf(sp) == sk) {
                    System.out.println("Atspejote!!!");
                    kart++;
                    break;
                } else if (Integer.valueOf(sp) < sk) {
                    System.out.println("Skaicius didesnis. Teskite");
                    kart++;
                } else if (Integer.valueOf(sp) > sk) {
                    System.out.println("Skaicius mazesnis. Teskite");
                    kart++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Iveskite skaiciu!");
                sc.nextLine();
            }

        } while (Integer.valueOf(sp) != sk);
        return kart;
    }
}
