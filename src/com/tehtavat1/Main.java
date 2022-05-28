/*************************************
 Tekijä: Nikolai Markalainen
 Jakson numero: AVE1017-3009 Java ohjelmointi
 Jakson tehtävänumero: Jakso 2 Tehtävät 1.1 - 1.2
 Päiväys: 28.05.2022
 *************************************/


package com.tehtavat1;
import java.util.*;
import java.util.Arrays;
import java.util.Random;
public class Main{

// Tehtynä kaikki ensimmäisen luvun tehtävät 1.1 - 1.2
    public static void main(String[] args){
        char letters = 'C';
        double population = 5.531;
            System.out.println ("Suomen populaatio on: " + population + " miljoonaa");
            System.out.println("Yksittainen kirjain: " + letters);

        Random aika = new Random();
        int upperBound = 25;
        int kellonAika = aika.nextInt(upperBound);
            System.out.println("Kello on: " + kellonAika );

        Random luku = new Random();
        int ylaRaja = 1001;
        int satunnaineLuku = luku.nextInt(ylaRaja);
            System.out.println("Luku on: " + satunnaineLuku);

            System.out.print("Postinumero on: ");
            int[] zip = new int[10];
            int zipCode;
            for(int i = 0; i < 5; i++){
                Random postiN = new Random();
                int arvonYlaraja = 10;
                int postiNumero = postiN.nextInt(arvonYlaraja);
                zipCode = zip[i] += postiNumero;
                System.out.print(zipCode);
            }
            System.out.println("");
            Scanner sc= new Scanner(System.in);
            System.out.print("Ilmoita alueen pituus:" );
            int pituus = sc.nextInt();

            System.out.print("Ilmoita alueen leveys: ");
            int leveys = sc.nextInt();
            int nelio = leveys * pituus;
            System.out.println("Alueen neliometrit ovat: " + nelio +("m^2"));

            String Matka = "Matka-aika Rovaniemi-Helsinki n. 9 tuntia";
            System.out.println(Matka);
    }

}