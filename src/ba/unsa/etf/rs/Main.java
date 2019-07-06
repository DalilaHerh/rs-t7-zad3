package ba.unsa.etf.rs;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class Main {

    private static Integer SumaCifara(Integer n){
        Integer suma = 0;
        while(n != 0){
            suma = suma + (n%10);
            n = n / 10;
        }
        return  suma;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Koliko želite unijeti brojeva?");
        int brojevi = s.nextInt();
        int[] arr = new int[brojevi];
        System.out.println("Unesite brojeve: ");
        for(int i = 0; i < brojevi; i++){
            arr[i] = s.nextInt();
        }

        arr = Arrays.stream(arr).boxed().sorted((x, y) -> SumaCifara(x) - SumaCifara(y)).mapToInt(i -> i).toArray();
        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}