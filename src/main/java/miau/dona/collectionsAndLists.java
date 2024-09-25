package miau.dona;

import java.util.ArrayList;
import java.util.Collections;

public class collectionsAndLists {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        System.out.println(cars.get(1));
        cars.set(0, "Opel");

        cars.remove(0);

        // cars.clear();

        cars.size();

        for (String car : cars) {
            System.out.println(car);
        }

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(15);
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i : myNumbers) {
            System.out.println(i);
        }

        Collections.sort(myNumbers);
        Collections.sort(cars);

        System.out.println(myNumbers);
        System.out.println(cars);

        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        // Collections.sort(myNumbers);
        System.out.println(myNumbers);

    }
}
