package tamas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Urmareste rezultatele echipei de fotbal CFR CLUJ incepand cu editia fotbalistica 2004-2005 !!");
        String EditiileDeFotbal[] = {"2004-2005", "2005-2006", "2006-2007", "2007-2008", "2008-2009", "2009-2010", "2010-2011",
        "2011-2012", "2012-2013", "2013-2014", "2014-2015", "2015-2016", "2016-2017", "2017-2018", "2018-2019", "2019-2020",
        "2020-2021"};

        String CompetitiiEditia2004_2005[] = {"DIVIZIA A 2004-2005", "CUPA ROMANIEI 2004-2005", "UEFA INTERTOTO CUP 2005"};
        String CompetitiiEditia2005_2006[] = {"DIVIZIA A 2005-2006", "CUPA ROMANIEI 2005-2006"};
        String CompetitiiEditia2006_2007[] = {"LIGA I 2006-2007", "CUPA ROMANIEI 2006-2007"};
        String CompetitiiEditia2007_2008[] = {"LIGA I 2007-2008", "CUPA ROMANIEI 2007-2008", "UEFA CUP 2007-2008"};
        String CompetitiiEditia2008_2009[] = {"LIGA I 2008-2009", "CUPA ROMANIEI 2008-2009", "SUPERCUPA ROMANIEI 2009", "UEFA CHAMPIONS LEAGUE 2008-2009"};
        String CompetitiiEditia2009_2010[] = {"LIGA I 2009-2010", "CUPA ROMANIEI 2009-2010", "SUPERCUPA ROMANIEI 2010", "UEFA EUROPA LEAGUE 2009-2010"};
        String CompetitiiEditia2010_2011[] = {"LIGA I 2010-2011", "CUPA ROMANIEI 2010-2011", "UEFA CHAMPIONS LEAGUE 2010-2011"};
        String CompetitiiEditia2011_2012[] = {"LIGA I 2011-2012", "CUPA ROMANIEI 2011-2012", "SUPERCUPA ROMANIEI 2012"};


        String EchipeDiviziaA2004_2005[] = {"POLITEHNICA Timisoara DA04-05", "GLORIA Bistrita DA04-05", "RAPID Bucuresti DA04-05",
                "APULLUM Alba Iulia DA04-05", "DINAMO Bucuresti DA04-05", "UNIVERSITATEA Craiova DA04-05", "ARGES Pitesti DA04-05", "FARUL Constanta DA04-05",
                "SPORTUL STUDENTESC Bucuresti DA04-05", "POLITEHNICA Iasi DA04-05", "STEAUA Bucuresti DA04-05", "OTELUL Galati DA04-05", "NATIONAL Bucuresti DA04-05",
                "FCM Bacau DA04-05", "FC Brasov DA04-05"};
        String EchipeDiviziaA2005_2006[] = {"SPORTUL STUDENTESC Bucuresti DA05-06", "JIUL Petrosani DA05-06", "Vaslui DA05-06", "ARGES Pitesti DA05-06",
                "NATIONAL Bucuresti DA05-06", "POLITEHNICA Timisoara DA05-06", "OTELUL Galati DA05-06", "PANDURII LIGNITUL Targu Jiu DA05-06", "DINAMO Bucuresti DA05-06",
                "POLITEHNICA Iasi DA05-06", "FCM Bacau DA05-06", "STEAUA Bucuresti DA05-06", "RAPID Bucuresti DA05-06", "GLORIA Bistrita DA05-06", "FARUL Constanta DA05-06"};
        String EchipeLigaI2006_2007[] = {"OTELUL Galati LI06-07", "UNIREA Urziceni LI06-07", "CEAHLAUL Piatra Neamt LI06-07", "PANDURII LIGNITUL Targu Jiu LI06-07",
                "JIUL Petrosani LI06-07", "POLITEHNICA Timisoara LI06-07", "UNIVERSITATEA Craiova LI06-07", "UTA Arad LI06-07", "Vaslui LI06-07", "STEAUA Bucuresti LI06-07",
                "ARGES Pitesti LI06-07", "RAPID Bucuresti LI06-07", "DINAMO Bucuresti LI06-07", "GLORIA Bistrita LI06-07", "POLITEHNICA Iasi LI06-07", "FARUL Constanta LI06-07"};


        String EchipeUefaIntertotoCup2005[] = {"VETRA Vilnius IC05", "ATHLETIC Bilbao IC05", "SAINT-ETIENNE IC05",
                "ZALGIRIS Vilnius IC05", "RC Lens IC05"};

        String EchipeCupaRomaniei2004_2005[] = {"PANDURII LIGNITUL Targu Jiu CR04-05", "FARUL Constanta CR04-05"};
        String EchipeCupaRomaniei2005_2006[] = {"UNIVERSITATEA Craiova CR05-06"};
        String EchipeCupaRomaniei2006_2007[] = {"SOMESUL Satu Mare CR06-07", "POLITEHNICA Timisoara CR06-07"};

        for (int i = 0; i < EditiileDeFotbal.length; i++) {
            System.out.println(EditiileDeFotbal[i]);
        }
        System.out.println("Alege editia fotbalistica dorita !");

        Scanner inputObject = new Scanner(System.in);
        String editia = inputObject.nextLine();

        System.out.println("Alege competitia dorita !");

        if (editia.equals(EditiileDeFotbal[0])) {
            for (int i = 0; i < CompetitiiEditia2004_2005.length; i++) {
                System.out.println(CompetitiiEditia2004_2005[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[1])) {
            for (int i = 0; i < CompetitiiEditia2005_2006.length; i++) {
                System.out.println(CompetitiiEditia2005_2006[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[2])) {
            for (int i = 0; i < CompetitiiEditia2006_2007.length; i++) {
                System.out.println(CompetitiiEditia2006_2007[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[3])) {
            for (int i = 0; i < CompetitiiEditia2007_2008.length; i++) {
                System.out.println(CompetitiiEditia2007_2008[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[4])) {
            for (int i = 0; i < CompetitiiEditia2008_2009.length; i++) {
                System.out.println(CompetitiiEditia2008_2009[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[5])) {
            for (int i = 0; i < CompetitiiEditia2009_2010.length; i++) {
                System.out.println(CompetitiiEditia2009_2010[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[6])) {
            for (int i = 0; i < CompetitiiEditia2010_2011.length; i++) {
                System.out.println(CompetitiiEditia2010_2011[i]);
            }
        }
        if (editia.equals(EditiileDeFotbal[7])) {
            for (int i = 0; i < CompetitiiEditia2011_2012.length; i++) {
                System.out.println(CompetitiiEditia2011_2012[i]);
            }
        }






        String competitia = inputObject.nextLine();

        System.out.println("Alege echipa dorita pentru a vedea rezultatele contra CFR CLUJ !");

        if (competitia.equals(CompetitiiEditia2004_2005[0])) {
            for (int i = 0; i < EchipeDiviziaA2004_2005.length; i++) {
                System.out.println(EchipeDiviziaA2004_2005[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2004_2005[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2004_2005.length; i++) {
                System.out.println(EchipeCupaRomaniei2004_2005[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2004_2005[2])) {
            for (int i = 0; i < EchipeUefaIntertotoCup2005.length; i++) {
                System.out.println(EchipeUefaIntertotoCup2005[i]);
            }
        }


        if (competitia.equals(CompetitiiEditia2005_2006[0])) {
            for (int i = 0; i < EchipeDiviziaA2005_2006.length; i++) {
                System.out.println(EchipeDiviziaA2005_2006[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2005_2006[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2005_2006.length; i++) {
                System.out.println(EchipeCupaRomaniei2005_2006[i]);
            }
        }


        if (competitia.equals(CompetitiiEditia2006_2007[0])) {
            for (int i = 0; i < EchipeLigaI2006_2007.length; i++) {
                System.out.println(EchipeLigaI2006_2007[i]);
            }
        }
        if (competitia.equals(CompetitiiEditia2006_2007[1])) {
            for (int i = 0; i < EchipeCupaRomaniei2006_2007.length; i++) {
                System.out.println(EchipeCupaRomaniei2006_2007[i]);
            }
        }







        System.out.println("Introduce echipa aleasa !");

        String echipaAleasa = inputObject.nextLine();
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[0])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 1) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 2) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[1])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 3) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 4) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[2])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 5) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 6) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[3])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 7) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 8) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[4])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 9) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 10) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[5])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 11) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 12) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[6])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 13) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 14) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[7])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 15) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 16) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[8])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 17) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 18) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[9])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 19) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 20) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[10])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 21) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 22) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[11])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 23) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 24) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[12])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 25) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 26) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[13])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 27) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 28) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2004_2005[14])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 29) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 30) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeCupaRomaniei2004_2005[0])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 31) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeCupaRomaniei2004_2005[1])) {
            try {
                int numaratorCupa = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorCupa++;
                    if (numaratorCupa == 32) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeUefaIntertotoCup2005[0])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 33) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 34) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 35) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeUefaIntertotoCup2005[1])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 36) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 37) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 38) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeUefaIntertotoCup2005[2])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 39) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 40) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 41) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeUefaIntertotoCup2005[3])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 42) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 43) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 44) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeUefaIntertotoCup2005[4])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 45) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 46) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 47) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
        if (echipaAleasa.equals(EchipeDiviziaA2005_2006[0])) {
            try {
                int numaratorUnu = 0;
                BufferedReader citire = new BufferedReader(
                        new FileReader("C:\\Users\\simo\\Desktop\\CFRPROIECTCODE\\BazaDateRezultateCFR.txt"));
                String citesteDin;
                while ((citesteDin = citire.readLine()) != null) {
                    numaratorUnu++;
                    if (numaratorUnu == 48) {
                        System.out.println(citesteDin);
                    }
                    if (numaratorUnu == 49) {
                        System.out.println(citesteDin);
                    }
                }
                citire.close();
            } catch (Exception ex) {
                return;
            }
        }
    }
}

