package miau.dona;

import java.util.Objects;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            double precio;
            int people;
            String day;
            boolean isStudent;

            Scanner scanner = new Scanner(System.in);
            day = scanner.nextLine();

            if (Objects.equals(day, "Wednesday")) {
                precio = 5;

            } else if (Objects.equals(day, "Thursday")) {
                // TODO
            }
    }
}