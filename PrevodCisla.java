/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.prevodcisla;
import java.util.Scanner;
import java.util.Arrays;
 // nefunguji zaporna a desetinna cisla
// rozsah pole je 0 - 15
/**
 *
 * @author estra
 */
public class PrevodCisla {

    public static void main(String[] args) {
         Scanner scanner = new Scanner (System.in, "Windows-1250");
       
         String[] cislaNaSlova = {"nula", "jedna", "dva", "tři", "čtyři", "pět", "šest", "sedm", "osm", "devět", "deset","jedenact", "dvanact", "trinact", "ctrnact", "patnact"};
        System.out.print("zadej cislo: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println();
        System.out.print("zadej druhe cislo: ");
        int b = Integer.parseInt(scanner.nextLine());
      
        //cisla se prevedou na text
        String slovoA = prevodCislaNaSlovo(a, cislaNaSlova);
        String slovoB = prevodCislaNaSlovo(b, cislaNaSlova);
        System.out.println();
        System.out.println("Číslo " + a + " se převedlo na slovo: " + slovoA);
        System.out.println();
        System.out.print("Číslo " + b + " se převedlo na slovo: " + slovoB);
        
        int soucet = a+b;
        int rozdil = a-b;
        int soucin = a * b;
        int podil = a / b;
        
        String soucetSoucet = prevodCislaNaSlovo(soucet, cislaNaSlova);
        System.out.println();
        String rozdilRozdil = prevodCislaNaSlovo(rozdil, cislaNaSlova);
        System.out.println();
        String soucinSoucin = prevodCislaNaSlovo(soucin, cislaNaSlova);
        System.out.println();
        String podilPodil = prevodCislaNaSlovo(podil, cislaNaSlova);
        System.out.println();
        
        
        
      //  String vysledek = prevodCislaNaSlovo(vysledek, cislaNaSlova);
        System.out.println("soucet " + slovoA + " a " + slovoB + " je " + soucetSoucet);
        System.out.println();
        System.out.println("rozdil " + slovoA + " a " + slovoB + " je " + rozdilRozdil);
        System.out.println();
        System.out.println("soucin " + slovoA + " a " + slovoB + " je " + soucinSoucin);
        System.out.println();
        System.out.println("podil " + slovoA + " a " + slovoB + " je " + podilPodil);
        System.out.println();
        
    }

    // Metoda pro převod čísla na slovo
    private static String prevodCislaNaSlovo(int cislo, String[] cislaNaSlova) {
        // Ošetření, aby nedošlo k přetečení pole
        if (cislo >= 0 && cislo < cislaNaSlova.length) {
            return cislaNaSlova[cislo];
        } else {
              
           return "neznámé";
        }
        
    }}
    
    