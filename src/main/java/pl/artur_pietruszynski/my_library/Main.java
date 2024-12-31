package pl.artur_pietruszynski.my_library;

import java.util.Scanner;

public class Main {

    private static final int EXIT_OPERATION_CODE = 4;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int operationNumber = 0;

        while (operationNumber != EXIT_OPERATION_CODE) {

            System.out.println("          MENU GLOWNE:      ");
            System.out.println("1 - Wyswietl liste ksiazek. ");
            System.out.println("2 - Dodaj ksiazke.          ");
            System.out.println("3 - Usun ksiazke.           ");
            System.out.println("4 - Zakoncz program.        ");
            System.out.println("                             ");
            System.out.print("  Podaj numer operacji: ");
            operationNumber = scanner.nextInt();

            switch (operationNumber) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Nieznane polecenie");
            }
        }
    }
}