package br.edu.ifsp;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        while (hub()) {
        }

        System.out.println(
                "Programa finalizando...\n\nObrigado por ter utilizado esse programa - PsK..\n\nPrograma Finalizado.\n");

    }

    public static boolean hub() {

        System.out.println(
                "\n|====================================================================================================|");

        System.out.println("| Menu |\n| Opções:");
        System.out.println("| 0 - Sair");
        System.out.println("| 1 - Cliente");
        System.out.println("| 2 - Livro");
        System.out.println("| 3 - Compra");
        System.out.print("| Opção: ");

        Scanner scanInput = new Scanner(System.in);
        String input = scanInput.next();

        System.out.println(
                "|====================================================================================================|\n");

        switch (option(input, 3)) {
            case -1:
                System.out.println("Error");
                break;
            case 0:
                return false;
            case 1:
                while (cliente()) {
                }
                break;
            case 2:
                livro();
                break;
            case 3:
                compra();
                break;
        }

        System.out.println("Voltando...");

        return true;

    }

    public static Integer option(String option, int n) {
        if (option.equals(null) || option.equals("") || !Pattern.matches("\\d+", option)) {
            return -1;
        } else if (Integer.parseInt(option) >= 0 && Integer.parseInt(option) <= n) {
            return Integer.parseInt(option);
        }
        return -1;
    }

    public static boolean cliente() {
        System.out.println(
                "\n|==================================================|");

        System.out.println("| Cliente |");
        System.out.println("| Opções: ");
        System.out.println("| 0 - Sair");
        System.out.println("| 1 - Adicionar");
        System.out.println("| 2 - Listar");
        System.out.println("| 3 - Listar Todos");
        System.out.println("| 4 - Atualizar");
        System.out.println("| 5 - Deletar");
        System.out.print("| Opção: ");

        Scanner scanInput = new Scanner(System.in);
        String input = scanInput.next();

        System.out.println(
                "|==================================================|\n");

        switch (option(input, 5)) {
            case -1:
                System.out.println("Error");
                break;
            case 0:
                return false;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;

        }

        return true;
    }

    public static void livro() {

    }

    public static void compra() {

    }

}

// Atributos

// Contrutores

// Getters e Setters

// Métodos