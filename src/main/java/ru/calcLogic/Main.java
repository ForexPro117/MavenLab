package ru.calcLogic;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите аргумент a и b:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println("Введите знак операции:");
        String s;
        switch (s = in.next()) {
            case ("+"):
                calcAction.sum(a, b);
                break;
            case ("-"):
                calcAction.sub(a, b);
                break;
            case ("*"):
                calcAction.mul(a, b);
                break;
            case ("/"):
                calcAction.div(a, b);
                break;
        }
    }
}
