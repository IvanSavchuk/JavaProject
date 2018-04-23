import java.util.ArrayList;
import java.util.Collections;

public class Testing {
    public static void main(String[] args) {
        ArrayList<String> listofcountries = new ArrayList<String>();
        listofcountries.add("Ivan");
        listofcountries.add("Dima");
        listofcountries.add("Galina");
        listofcountries.add("Igor");

        System.out.println("Before Sorting:");
        for(String counter: listofcountries){
            System.out.println(counter);
        }

        Collections.sort(listofcountries);

        System.out.println("After Sorting:");
        for(String counter: listofcountries){
            System.out.println(counter);
        }
    }
}