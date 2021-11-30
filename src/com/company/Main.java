package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String statusas = "taip";
        double pirmasSkaicius=0;
        double antrasSkaicius=0;
        double rez = 0;//rezultatas
        char operacija;
        Scanner S = new Scanner(System.in);
        do {
            System.out.println("Įveskite kokia operacija darysite, galimos operacijos:+,-,/,*,#");
            operacija = S.next().charAt(0);
            System.out.println("Įveskite pirmą skaičių");
            try{
                pirmasSkaicius = S.nextDouble();
                System.out.println("Įveskite antrą skaičių");
                antrasSkaicius = S.nextDouble();
                switch (operacija) {
                    case '+':
                        System.out.println(pirmasSkaicius + "+" + antrasSkaicius + "=" + sudeti(pirmasSkaicius,antrasSkaicius));
                        break;
                    case '-':
                        System.out.println(pirmasSkaicius + "-" + antrasSkaicius + "=" + atimti(pirmasSkaicius,antrasSkaicius));
                        break;
                    case '*':
                        System.out.println(pirmasSkaicius + "*" + antrasSkaicius + "=" + dauginti(pirmasSkaicius,antrasSkaicius));
                        break;
                    case '/':
                            System.out.println(pirmasSkaicius + "/" + antrasSkaicius + "=" + dalinti(pirmasSkaicius,antrasSkaicius));
                            break;
                    case '#':
                        for (int i = 0; i < 13; i++) {
                            rez = pirmasSkaicius * antrasSkaicius + (antrasSkaicius - pirmasSkaicius) / pirmasSkaicius * (13 + i);
                            if (rez < 6) {
                                System.out.println(pirmasSkaicius + " * " + antrasSkaicius + " ( " + antrasSkaicius + " - " + pirmasSkaicius + ") / " + pirmasSkaicius + " * " + (13 + i) + " = " + rez + " < 6");
                            } else if (rez > 6) {
                                System.out.println(pirmasSkaicius + " * " + antrasSkaicius + " ( " + antrasSkaicius + " - " + pirmasSkaicius + ") / " + pirmasSkaicius + " * " + (13 + i) + " = " + rez + " > 6");
                            } else {
                                System.out.println(pirmasSkaicius + " * " + antrasSkaicius + " ( " + antrasSkaicius + " - " + pirmasSkaicius + ") / " + pirmasSkaicius + " * " + (13 + i) + " = " + rez + " == 6");
                            }
                            System.out.println();
                        }
                        break;
                    default:
                        System.out.println("Nežinoma operacija");
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Blogai įvestas skaičius");
            }catch (Exception e){
                System.out.println("Bendra klaida\n" + e);
            }finally {
                System.out.println("Šis kodas bus vykdomas visada įvyko klaida ar ne");
            }
            System.out.println("Norėdami skaičiuoti toliau įveskite taip, kitu atvėju bet kokį simbolį");
            statusas = S.next();
        } while (statusas.equals("taip"));
    }

    static double sudeti(double pirmasSkaicius, double antrasSkaicius){
        double rez = pirmasSkaicius + antrasSkaicius;
        //System.out.println(pirmasSkaicius+ "+" + antrasSkaicius + "=" + rez);
        return rez;
    }

    static double atimti(double pirmasSkaicius, double antrasSkaicius){
        double rez = pirmasSkaicius - antrasSkaicius;
        return rez;
    }

    static double dauginti(double pirmasSkaicius, double antrasSkaicius){
        double rez = pirmasSkaicius * antrasSkaicius;
        return rez;
    }

    static double dalinti(double pirmasSkaicius, double antrasSkaicius){
        double rez = 0;
        if (antrasSkaicius == 0) {
            System.out.println("Dalyba iš nulio negalima");
        } else {
            rez = pirmasSkaicius / antrasSkaicius;
        }
        return rez;
    }
}
