package days.first;

import java.util.Scanner;


/**....*/
public class FirstDayTask {

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Iveskite svori");
        int weight = sc.nextInt();
        System.out.println("Iveskite ugi, m");
        double height = sc.nextDouble();

        // double KMI = weight / (height * height);
        //double KMI = kmi(weight, height);
        System.out.println("KMI: " + kmiMethod(weight,height));


    }

    private static double kmiMethod (int weight, double height){
        return weight / (height * height);
    }

}
