package tamas;

import java.io.*;

public class BazaDeDate {
    public static void main(String[] args) {
        try {
            BufferedWriter fisier = new BufferedWriter(
                    new FileWriter("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
            fisier.write("Etapa 1 TUR : FC CFR-ECOMAX Cluj-Napoca 2-1 FCU POLITEHNICA Timisoara\n" +
                    "Etapa 16 RETUR : FCU POLITEHNICA Timisoara 3-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 2 TUR : ACF GLORIA 1922 Bistrita 2-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 17 RETUR : FC CFR-ECOMAX Cluj-Napoca 1-2 ACF GLORIA 1922 Bistrita\n" +
                    "Etapa 3 TUR : FC CFR-ECOMAX Cluj-Napoca 1-1 FC RAPID Bucuresti\n" +
                    "Etapa 18 RETUR : FC RAPID Bucuresti 3-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 4 TUR : FC APULUM Alba Iulia 2-4 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 19 RETUR : FC CFR-ECOMAX Cluj-Napoca 2-1 FC APULUM Alba Iulia\n" +
                    "Etapa 5 TUR : FC CFR-ECOMAX Cluj-Napoca 4-2 FC DINAMO 1948 Bucuresti\n" +
                    "Etapa 20 RETUR : FC DINAMO 1948 Bucuresti 4-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 6 TUR : FC UNIVERSITATEA Craiova 3-2 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 21 RETUR : FC CFR-ECOMAX Cluj-Napoca 1-1 FC UNIVERSITATEA Craiova\n" +
                    "Etapa 7 TUR : FC CFR-ECOMAX Cluj-Napoca 1-1 FC ARGES Pitesti\n" +
                    "Etapa 22 RETUR : FC ARGES Pitesti 0-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 8 TUR : FC FARUL Constanta 0-1 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 23 RETUR : FC CFR-ECOMAX Cluj-Napoca 0-0 FC FARUL Constanta\n" +
                    "Etapa 9 TUR : FC CFR-ECOMAX Cluj-Napoca 1-1 FC SPORTUL STUDENTESC Bucuresti\n" +
                    "Etapa 24 RETUR : FC SPORTUL STUDENTESC Bucuresti 2-1 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 10 TUR : FC POLITEHNICA Iasi 0-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 25 RETUR : FC CFR-ECOMAX Cluj-Napoca 1-1 FC POLITEHNICA Iasi\n" +
                    "Etapa 11 TUR : FC CFR-ECOMAX Cluj-Napoca 0-2 FC STEAUA Bucuresti\n" +
                    "Etapa 26 RETUR : FC STEAUA Bucuresti 1-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 12 TUR : FC CFR-ECOMAX Cluj-Napoca 1-0 FC OTELUL Galati\n" +
                    "Etapa 27 RETUR : FC OTELUL Galati 1-2 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 13 TUR : FC NATIONAL Bucuresti 2-2 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 28 RETUR : FC CFR-ECOMAX Cluj-Napoca 0-1 FC NATIONAL Bucuresti\n" +
                    "Etapa 14 TUR : FC CFR-ECOMAX Cluj-Napoca 2-0 FCM Bacau\n" +
                    "Etapa 29 RETUR : FCM Bacau 2-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 15 TUR : FC Brasov 2-2 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 30 RETUR : FC CFR-ECOMAX Cluj-Napoca 2-1 FC Brasov\n");
            fisier.write("Turul VIII : FC CFR-ECOMAX Cluj-Napoca 1-0 CS PANDURII LIGNITUL Targu Jiu (DIVIZIA B)\n" +
                    "OPTIMI : FC CFR-ECOMAX Cluj-Napoca 1-2 FC FARUL Constanta\n");
            fisier.write("Turul I TUR : FC CFR-ECOMAX Cluj-Napoca 3-2 FK VETRA Vilnius (LTU)\n" +
                    "Turul I RETUR : FK VETRA Vilnius (LTU) 1-4 FC CFR-ECOMAX Cluj-Napoca\n " +
                    "Scor general 7-3 FC CFR-ECOMAX Cluj-Napoca !\n" +
                    "Turul II TUR : FC CFR-ECOMAX Cluj-Napoca 1-0 ATHLETIC CLUB Bilbao (SPA)\n" +
                    "Turul II RETUR : ATHLETIC CLUB Bilbao (SPA) 1-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Scor general 1-1 dupa penalty 5-3 FC CFR-ECOMAX Cluj-Napoca !\n" +
                    "Turul III TUR : FC CFR-ECOMAX Cluj-Napoca 1-1 AS SAINT-ETIENNE (FRA)\n" +
                    "Turul III RETUR : AS SAINT-ETIENNE (FRA) 2-2 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Scor general 3-3 castiga dubla FC CFR-ECOMAX Cluj-Napoca cu mai multe goluri marcate in deplasare !\n" +
                    "SEMIFINALE TUR : FK ZALGIRIS Vilnius (LTU) 1-2 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "SEMIFINALE RETUR : FC CFR-ECOMAX Cluj-Napoca 5-1 FK ZALGIRIS Vilnius (LTU)\n" +
                    "Scor general 7-2 FC CFR-ECOMAX Cluj-Napoca !\n" +
                    "FINALA TUR : FC CFR-ECOMAX Cluj-Napoca 1-1 RC Lens (FRA)\n" +
                    "FINALA RETUR : RC Lens (FRA) 3-1 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Scor general 4-2 RC Lens (FRA) !\n");

            fisier.close();
        } catch (Exception ex) {
        }
    }
    // AICI INCEPE CITIREA DIN DOCUMENT
        /*try {
            int counterC = 0;
            BufferedReader citire = new BufferedReader(
                    new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
            String readFrom;
            while ((readFrom = citire.readLine()) != null) {
                counterC++;
                if (counterC == 1) {
                    System.out.println(readFrom);
                }
            }
            citire.close();
        } catch (Exception ex) {
            return;
        }

        try {
            int counterD = 0;
            BufferedReader citire = new BufferedReader(
                    new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
            String readFrom;
            while ((readFrom = citire.readLine()) != null) {
                counterD++;
                if (counterD == 2) {
                    System.out.println(readFrom);
                }
            }
            citire.close();
        } catch (Exception ex) {
            return;
        }*/
}


