package andre.alura.conversor.models;

import java.util.Scanner;

public class Menu extends API {
    Scanner scanner = new Scanner(System.in);
    private String menu = """
            Conversor de Moedas
            
            *********************************
            
            1 - Real para Dólar
            2 - Dólar para Real
            3 - Euro para Dólar
            4 - Dólar para Euro
            5 - Real para Euro
            6 - Euro para Real
            7 - Sair
            
            *********************************
            
            Escolha uma das opções acima: 
            """;



    public void displayMenu() {
        int option = 0;


        while (option != 7){
            System.out.println(menu);
            option = scanner.nextInt();

            if (option == 1) {
                currency1 = "BRL";
                currency2 = "USD";
                System.out.println("Diga o valor a ser convertido: ");
                amount = scanner.nextDouble();
                searchAPI();
            } else if (option == 2) {


                currency1 = "USD";
                currency2 = "BRL";
                System.out.println("Diga o valor a ser convertido: ");
                amount = scanner.nextDouble();

                searchAPI();
            } else if (option == 3) {
                currency1 = "EUR";
                currency2 = "USD";
                System.out.println("Diga o valor a ser convertido: ");
                amount = scanner.nextDouble();

                searchAPI();
            } else if (option == 4) {


                currency1 = "USD";
                currency2 = "EUR";
                System.out.println("Diga o valor a ser convertido: ");
                amount = scanner.nextDouble();

                searchAPI();
            } else if (option == 5) {


                currency1 = "BRL";
                currency2 = "EUR";
                System.out.println("Diga o valor a ser convertido: ");
                amount = scanner.nextDouble();

                searchAPI();
            } else if (option == 6) {


                currency1 = "EUR";
                currency2 = "BRL";
                System.out.println("Diga o valor a ser convertido: ");
                amount = scanner.nextDouble();

                searchAPI();
            } else if (option == 7) {
                System.out.println("Até logo!");
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }}



