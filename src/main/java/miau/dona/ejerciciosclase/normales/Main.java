package miau.dona.ejerciciosclase.normales;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            double precio;
            int people;
            String day;
            double total;
            boolean isStudent;
            isStudent = false;

            System.out.println("Dia");
            Scanner scanner = new Scanner(System.in);
            day = scanner.nextLine();

            System.out.println("N personas");
            people = scanner.nextInt();

            if (Objects.equals(day, "Wednesday")) {
                precio = 5;

            } else if (Objects.equals(day, "Thursday")) {
                precio = 11;
                people = people / 2;
                System.out.println(people);
            } else {
                precio = 8;
            }
            if (isStudent) {
                precio = precio * 0.90;
            }

            total = people * precio;

        System.out.println("El total es " + total);

    }
}