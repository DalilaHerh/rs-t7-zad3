package ba.unsa.etf.rs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite listu brojeva: \t (0 za kraj)");
        ArrayList<Integer> listaBrojeva = new ArrayList<>();
        int pomocni = unos.nextInt();
        while(pomocni!=0) {
            listaBrojeva.add(pomocni);
            pomocni = unos.nextInt();
        }
        listaBrojeva.stream().sorted().forEach(System.out::println);

    }
}
