package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String statusas = "taip";
        double a, b;//kintamieji skaičiavimui
        double rez;//rezultatas
        char operacija;
        Scanner S = new Scanner(System.in);
        while (statusas.equals("taip")) {
            System.out.println("Įveskite kokia operacija darysite, galimos operacijos:+,-,/,*");
            operacija = S.next().charAt(0);
            System.out.println("Įveskite pirmą skaičių");
            a = S.nextDouble();
            System.out.println("Įveskite antrą skaičių");
            b = S.nextDouble();
            switch (operacija) {
                case '+':
                    rez = a + b;
                    System.out.println(a + "+" + b + "=" + rez);
                    break;
                case '-':
                    rez = a - b;
                    System.out.println(a + "-" + b + "=" + rez);
                    break;
                case '*':
                    rez = a * b;
                    System.out.println(a + "*" + b + "=" + rez);
                    break;
                case '/':
                    if (b == 0) {
                        System.out.println("Dalyba iš nulio negalima");
                    } else {
                        rez = a / b;
                        System.out.println(a + "/" + b + "=" + rez);
                    }
                    break;
                default:
                    System.out.println("Nežinoma operacija");
                    break;
            }
            System.out.println("Norėdami skaičiuoti toliau įveskite taip, kitu atvėju bet kokį simbolį");
            statusas = S.next();
        }
    }
}
