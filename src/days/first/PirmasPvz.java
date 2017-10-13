package days.first;

public class PirmasPvz {

    private int value;
    private int secondValue;
    public static void main(String[] args)
    {
        PirmasPvz pirmasPvz = new PirmasPvz();
        pirmasPvz.value = 12;
        pirmasPvz.secondValue = 30;
        System.out.println(pirmasPvz.sum());        // isvedimas i konsole
        pirmasPvz.testPrivate();                // statinis kviecia nestatini metoda per objekto varda
    }

    public int sum(){
        test();
        testPrivate();  //tiesiogiai galima kviesti
        return value + secondValue;
    }

    public int test(){
        //sum();              //negalima
        return 0;
    }

    private void testPrivate(){
        System.out.println("Kazkoks tekstas");
    }
}
