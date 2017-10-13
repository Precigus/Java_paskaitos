package days.fourth;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();    //neturi aiskaus rikiavimo algoritmo
        Set<String> names2 = new LinkedHashSet<>();     //kaip bus sudetos reiksmes, taip jas ir gausim atgal
        Set<String> names3 = new TreeSet<>();  //rikiuoja nuo a iki z arba nuo 0 iki belekiek
        setItems(names);
        setItems(names2);
        setItems(names3);

        // Setai saugo tik unikalius elementus 

        System.out.println("HashSet:");
        print(names);
        System.out.println("LinkedHashSet:");
        print(names2);
        System.out.println("TreeSet:");
        print(names3);

    }

    private static void setItems(Set<String> names) {
        names.add("Jonas");
        names.add("Petras");
        names.add("Karolis");
        names.add("Mantas");
        names.add("Jonas");

    }

    private static void print (Set<String> names){
        names.forEach(a -> System.out.println(a));
    }
}
