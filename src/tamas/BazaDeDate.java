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
            fisier.write("Etapa 1 TUR : FC SPORTUL STUDENTESC Bucuresti 1-1 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 16 RETUR : FC CFR-ECOMAX Cluj-Napoca 0-0 FC SPORTUL STUDENTESC Bucuresti\n" +
                    "Etapa 2 TUR : FC CFR-ECOMAX Cluj-Napoca 0-0 CS JIUL Petrosani\n" +
                    "Etapa 17 RETUR : CS JIUL Petrosani 5-1 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 3 TUR : FC Vaslui 0-3 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 18 RETUR : FC CFR-ECOMAX Cluj-Napoca 1-0 FC Vaslui\n" +
                    "Etapa 4 TUR : FC CFR-ECOMAX Cluj-Napoca 2-2 FC ARGES Pitesti\n" +
                    "Etapa 19 RETUR : FC ARGES Pitesti 0-1 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 5 TUR : FC NATIONAL Bucuresti 0-4 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 20 RETUR : FC CFR-ECOMAX Cluj-Napoca 0-0 FC NATIONAL Bucuresti\n" +
                    "Etapa 6 TUR : FC CFR-ECOMAX Cluj-Napoca 2-0 FCU POLITEHNICA Timisoara\n" +
                    "Etapa 21 RETUR : FCU POLITEHNICA Timisoara 2-2 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 7 TUR : FC OTELUL Galati 0-1 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 22 RETUR : FC CFR-ECOMAX Cluj-Napoca 0-1 FC OTELUL Galati\n" +
                    "Etapa 8 TUR : FC CFR-ECOMAX Cluj-Napoca 1-2 CS PANDURII LIGNITUL Targu Jiu\n" +
                    "Etapa 23 RETUR : CS PANDURII LIGNITUL Targu Jiu 0-1 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 9 TUR : FC DINAMO 1948 Bucuresti 5-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 24 RETUR : FC CFR-ECOMAX Cluj-Napoca 1-0 FC DINAMO 1948 Bucuresti\n" +
                    "Etapa 10 TUR : FC CFR-ECOMAX Cluj-Napoca 0-0 FC POLITEHNICA Iasi\n" +
                    "Etapa 25 RETUR : FC POLITEHNICA Iasi 1-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 11 TUR : FCM Bacau 0-2 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 26 RETUR : FC CFR-ECOMAX Cluj-Napoca 4-0 FCM Bacau\n" +
                    "Etapa 12 TUR : FC CFR-ECOMAX Cluj-Napoca 1-0 FC STEAUA Bucuresti\n" +
                    "Etapa 27 RETUR : FC STEAUA Bucuresti 2-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 13 TUR : FC RAPID Bucuresti 1-0 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 28 RETUR : FC CFR-ECOMAX Cluj-Napoca 1-3 FC RAPID Bucuresti\n" +
                    "Etapa 14 TUR : FC CFR-ECOMAX Cluj-Napoca 0-0 ACF GLORIA 1922 Bistrita\n" +
                    "Etapa 29 RETUR : ACF GLORIA 1922 Bistrita 1-2 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 15 TUR : FC FARUL Constanta 1-2 FC CFR-ECOMAX Cluj-Napoca\n" +
                    "Etapa 30 RETUR : FC CFR-ECOMAX Cluj-Napoca 3-0 FC FARUL Constanta\n");
            fisier.write("TURUL VII : FC UNIVERSIATEA Craiova (DIVIZIA B) 1-0 FC CFR-ECOMAX Cluj-Napoca\n");
            fisier.write("Etapa 1 TUR : FC OTELUL Galati 1-3 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 18 RETUR : FC CFR-1907 Cluj-Napoca 2-1 FC OTELUL Galati\n" +
                    "Etapa 2 TUR : FC CFR-1907 Cluj-Napoca 4-0 FC UNIREA Urziceni\n" +
                    "Etapa 19 RETUR : FC UNIREA Urziceni 0-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 3 TUR : FC CEAHLAUL Piatra-Neamt 1-3 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 20 RETUR : FC CFR-1907 Cluj-Napoca 1-1 FC CEAHLAUL Piatra-Neamt\n" +
                    "Etapa 4 TUR : FC CFR-1907 Cluj-Napoca 1-0 FC NATIONAL Bucuresti\n" +
                    "Etapa 21 RETUR : FC NATIONAL Bucuresti 0-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 5 TUR : CS PANDURII LIGNITUL Targu Jiu 1-3 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 22 RETUR : FC CFR-1907 Cluj-Napoca 1-0 CS PANDURII LIGNITUL Targu Jiu\n" +
                    "Etapa 6 TUR : FC CFR-1907 Cluj-Napoca 1-1 CS JIUL Petrosani\n" +
                    "Etapa 23 RETUR : CS JIUL Petrosani 0-2 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 7 TUR : FCU POLITEHNICA Timisoara 3-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 24 RETUR : FC CFR-1907 Cluj-Napoca 2-1 FCU POLITEHNICA Timisoara\n" +
                    "Etapa 8 TUR : FC CFR-1907 Cluj-Napoca 5-1 FC UNIVERSITATEA Craiova\n" +
                    "Etapa 25 RETUR : FC UNIVERSITATEA Craiova 0-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 9 TUR : FC UTA Arad 1-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 26 RETUR : FC CFR-1907 Cluj-Napoca 5-0 FC UTA Arad\n" +
                    "Etapa 10 TUR : FC CFR-1907 Cluj-Napoca 2-2 FC Vaslui\n" +
                    "Etapa 27 RETUR : FC Vaslui 0-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 11 TUR : FC STEAUA Bucuresti 4-2 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 28 RETUR : FC CFR-1907 Cluj-Napoca 1-2 FC STEAUA Bucuresti\n" +
                    "Etapa 12 TUR : FC CFR-1907 Cluj-Napoca 2-0 FC ARGES Pitesti\n" +
                    "Etapa 29 RETUR : FC ARGES Pitesti 0-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 13 TUR : FC RAPID Bucuresti 3-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 30 RETUR : FC CFR-1907 Cluj-Napoca 3-2 FC RAPID Bucuresti\n" +
                    "Etapa 14 TUR : FC CFR-1907 Cluj-Napoca 2-1 FC DINAMO 1948 Bucuresti\n" +
                    "Etapa 31 RETUR : FC DINAMO 1948 Bucuresti 1-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 15 TUR : ACF GLORIA 1922 Bistrita 3-2 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 32 RETUR : FC CFR-1907 Cluj-Napoca 2-1 ACF GLORIA 1922 Bistrita\n" +
                    "Etapa 16 TUR : FC CFR-1907 Cluj-Napoca 2-1 FC POLITEHNICA Iasi\n" +
                    "Etapa 33 RETUR : FC POLITEHNICA Iasi 0-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 17 TUR : FC FARUL Constanta 0-2 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 34 RETUR : FC CFR-1907 Cluj-Napoca 1-0 FC FARUL Constanta\n");
            fisier.write("SAISPREZECIMI : FC CFR-1907 Cluj-Napoca 4-0 FC SOMESUL Satu Mare (LIGA III)\n" +
                    "OPTIMI : FC CFR-1907 Cluj-Napoca 0-2 FCU POLITEHNICA Timisoara");
            fisier.write("Etapa 1 TUR : FC OTELUL Galati 0-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 18 RETUR : FC CFR-1907 Cluj-Napoca 3-1 FC OTELUL Galati\n" +
                    "Etapa 2 TUR : FC CFR-1907 Cluj-Napoca 2-2 FC POLITEHNICA 1921 STIINTA Timisoara\n" +
                    "Etapa 19 RETUR : FC POLITEHNICA 1921 STIINTA Timisoara 1-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 3 TUR : FC UNIVERSITATEA Craiova 1-3 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 20 RETUR : FC CFR-1907 Cluj-Napoca 4-1 FC UNIVERSITATEA Craiova\n" +
                    "Etapa 4 TUR : FC CFR-1907 Cluj-Napoca 0-0 FC STEAUA Bucuresti\n" +
                    "Etapa 21 RETUR : FC STEAUA Bucuresti 3-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 5 TUR : FC GLORIA Buzau 1-2 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 22 RETUR : FC CFR-1907 Cluj-Napoca 2-0 FC GLORIA Buzau\n" +
                    "Etapa 6 TUR : FC CFR-1907 Cluj-Napoca 2-1 FC CEAHLAUL Piatra Neamt\n" +
                    "Etapa 23 RETUR : FC CEAHLAUL Piatra Neamt 0-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 7 TUR : FC FARUL Constanta 0-2 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 24 RETUR : FC CFR-1907 Cluj-Napoca 2-1 FC FARUL Constanta\n" +
                    "Etapa 8 TUR : FC CFR-1907 Cluj-Napoca 2-1 FC POLITEHNICA Iasi\n" +
                    "Etapa 25 RETUR : FC POLITEHNICA Iasi 1-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 9 TUR : FC CFR-1907 Cluj-Napoca 1-1 FC DINAMO 1948 Bucuresti\n" +
                    "Etapa 26 RETUR : FC DINAMO 1948 Bucuresti 1-2 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 10 TUR : CS PANDURII LIGNITUL Targu Jiu 0-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 27 RETUR : FC CFR-1907 Cluj-Napoca 1-2 CS PANDURII LIGNITUL Targu Jiu\n" +
                    "Etapa 11 TUR : FC CFR-1907 Cluj-Napoca 2-0 FC UNIREA Urziceni\n" +
                    "Etapa 28 RETUR : FC UNIREA Urziceni 1-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 12 TUR : FC RAPID Bucuresti 1-2 FC CFR-1907 Cluj-NAPOCA\n" +
                    "Etapa 29 RETUR : FC CFR-1907 Cluj-Napoca 1-0 FC RAPID Bucuresti\n" +
                    "Etapa 13 TUR : FC CFR-1907 Cluj-Napoca 2-0 FC UTA Arad\n" +
                    "Etapa 30 RETUR : FC UTA Arad 0-3 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 14 TUR : FC Vaslui 0-2 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 31 RETUR : FC CFR-1907 Cluj-Napoca 1-0 FC Vaslui\n" +
                    "Etapa 15 TUR : FC CFR-1907 Cluj-Napoca 1-0 CS DACIA Mioveni\n" +
                    "Etapa 32 RETUR : CS DACIA Mioveni 0-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 16 TUR : ACF GLORIA 1922 Bistrita 2-2 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 33 RETUR : FC CFR-1907 Cluj-Napoca 1-0 ACF GLORIA 1922 Bistrita\n" +
                    "Etapa 17 TUR : FC CFR-1907 Cluj-Napoca 2-0 CMF UNIVERSITATEA Cluj\n" +
                    "Etapa 34 RETUR : CMF UNIVERSITATEA Cluj 0-1 FC CFR-1907 Cluj-Napoca\n");
            fisier.write("SAISPREZECIMI : FC Sacele (LIGA II) 0-3 FC CFR-1907 Cluj-Napoca\n" +
                    "OPTIMI : CS JIUL Petrosani (LIGA II) 0-1 FC CFR-1907 Cluj-Napoca\n" +
                    "SFERTURI : FC CFR-1907 Cluj-Napoca 1-0 FC Brasov (LIGA II)\n" +
                    "SEMIFINALE : FC CFR-1907 Cluj-Napoca 3-0 CS DACIA Mioveni\n" +
                    "FINALA : FC CFR-1907 Cluj-Napoca 2-1 FC UNIREA Urziceni\n");
            fisier.write("TURUL II TUR : FC CFR-1907 Cluj-Napoca 1-3 ANORTHOSIS Famagusta FC (CYP)\n" +
                    "TURUL II RETUR : ANORTHOSIS Famagusta FC (CYP) 0-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Scor general 3-1 ANORTHOSIS Famagusta (CYP) !\n");
            fisier.write("Etapa 1 TUR : CS Otopeni 0-4 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 18 RETUR : FC CFR-1907 Cluj-NAPOCA 1-0 CS Otopeni\n" +
                    "Etapa 2 TUR : FC CFR-1907 Cluj-Napoca 2-0 FC GLORIA Buzau\n" +
                    "Etapa 19 RETUR : FC GLORIA Buzau 0-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 3 TUR : FC RAPID Bucuresti 1-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 20 RETUR : FC CFR-1907 Cluj-Napoca 0-0 FC RAPID Bucuresti\n" +
                    "Etapa 4 TUR : FC CFR-1907 Cluj-Napoca 1-1 FC UNIVERSITATEA Craiova\n" +
                    "Etapa 21 RETUR : FC UNIVERSITATEA Craiova 4-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 5 TUR : FC Vaslui 2-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 22 RETUR : FC CFR-1907 Cluj-Napoca 3-0 FC Vaslui\n" +
                    "Etapa 6 TUR : FC CFR-1907 Cluj-Napoca 0-0 FC POLITEHNICA Iasi\n" +
                    "Etapa 23 RETUR : FC POLITEHNICA Iasi 0-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 7 TUR : ACF GLORIA 1922 Bistrita 1-2 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 24 RETUR : FC CFR-1907 Cluj-Napoca 2-2 ACF GLORIA 1922 Bistrita\n" +
                    "Etapa 8 TUR : FC CFR-1907 Cluj-Napoca 3-0 FC FARUL Constanta\n" +
                    "Etapa 25 RETUR : FC FARUL Constanta 0-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 9 TUR : FC CFR-1907 Cluj-Napoca 1-1 FC STEAUA Bucuresti\n" +
                    "Etapa 26 RETUR : FC STEAUA Bucuresti 1-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 10 TUR : FC OTELUL Galati 1-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 27 RETUR : FC CFR-1907 Cluj-Napoca 1-1 FC OTELUL Galati\n" +
                    "Etapa 11 TUR : FC CFR-1907 Cluj-Napoca 1-0 FC DINAMO 1948 Bucuresti\n" +
                    "Etapa 28 RETUR : FC DINAMO 1948 Bucuresti 1-0 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 12 TUR : FC Timisoara 2-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 29 RETUR : FC CFR-1907 Cluj-Napoca 2-0 FC Timisoara\n" +
                    "Etapa 13 TUR : FC CFR-1907 Cluj-Napoca 1-0 FC UNIREA Urziceni\n" +
                    "Etapa 30 RETUR : FC UNIREA Urziceni 1-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 14 TUR : FC Brasov 1-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 31 RETUR : FC CFR-1907 Cluj-Napoca 2-0 FC Brasov\n" +
                    "Etapa 15 TUR : FC CFR-1907 Cluj-Napoca 2-0 FC ARGES Pitesti\n" +
                    "Etapa 32 RETUR : FC ARGES Pitesti 0-2 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 16 TUR : CS PANDURII LIGNITUL Targu Jiu 2-1 FC CFR-1907 Cluj-Napoca\n" +
                    "Etapa 33 RETUR : FC CFR-1907 Cluj-Napoca 1-1 CS PANDURII LIGNITUL Targu Jiu\n" +
                    "Etapa 17 TUR : FC CFR-1907 Cluj-Napoca 2-1 CS GAZ METAN Medias\n" +
                    "Etapa 34 RETUR : CS GAZ METAN Medias 2-0 FC CFR-1907 Cluj-Napoca\n");

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
            return; IL VOI EDITA AICI IN LOCUL ACESTA 
        }*/
}


