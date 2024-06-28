import java.util.Arrays;
import java.util.Scanner;

public class NegativeNumberException {
    int liczba=0;

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public NegativeNumberException(int liczba) {
        this.liczba = liczba;
    }

    public int readNumber(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("podaj liczbe");
       liczba=scanner.nextInt();
        if(liczba<0){
            throw new IllegalArgumentException("Negative numbers are not allowed");
        }
        return liczba;
    }
    public Integer fillArray() {
        int number = 0;
        for (int i = 0; i > 10; i++) {
            number = readNumber();
            if (number > 0) {
                number = Main.array[i];
            }

        }
        return number;
    }
}
