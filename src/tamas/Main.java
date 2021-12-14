package tamas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Urmareste rezultatele echipei de fotbal CFR CLUJ incepand cu editia fotbalistica 2004-2005 !!");
        String EditiileDeFotbal[] = {"2004-2005", "2005-2006", "2006-2007", "2007-2008", "2008-2009", "2009-2010"};
        String CompetitiiEditia2004_2005[] = {"DIVIZIA A 2004-2005", "CUPA ROMANIEI 2004-2005", "UEFA INTERTOTO CUP 2005"};
        String EchipeDiviziaA2004_2005[] = {"FCU POLITEHNICA Timisoara","ACF GLORIA 1922 Bistrita","FC RAPID Bucuresti",
        "FC APULLUM Alba Iulia","FC DINAMO 1948 Bucuresti","FC UNIVERSITATEA Craiova","FC ARGES Pitesti","FC FARUL Constanta",
        "FC SPORTUL STUDENTESC Bucuresti","FC POLITEHNICA Iasi","FC STEAUA Bucuresti","FC OTELUL Galati","FC NATIONAL Bucuresti",
        "FCM Bacau","FC Brasov"};
        String EchipeUefaIntertotoCup2005[] = {"FK VETRA Vilnius (LTU)","ATHLETIC CLUB Bilbao (SPA)","AS SAINT-ETIENNE (FRA)",
        "FK ZALGIRIS Vilnius (LTU)","RC Lens (FRA)"};
        String EchipeCupaRomaniei2004_2005[] = {"CS PANDURII LIGNITUL Targu Jiu (DIVIZIA B)","FC FARUL Constanta"};

        for (int i = 0; i < EditiileDeFotbal.length; i++) {
            System.out.println(EditiileDeFotbal[i]);
        }
        System.out.println("Alege editia fotbalistica dorita !");

        Scanner inputObject = new Scanner(System.in);
        String editia = inputObject.nextLine();

        System.out.println("Alege competitia dorita !");

        if(editia.equals(EditiileDeFotbal[0])){
            for(int i =0; i < CompetitiiEditia2004_2005.length; i++){
                System.out.println(CompetitiiEditia2004_2005[i]);
            }
        }

        String competitia = inputObject.nextLine();

        System.out.println("Alege echipa dorita pentru a vedea rezultatele contra CFR CLUJ !");

        if(competitia.equals(CompetitiiEditia2004_2005[0])){
            for(int i = 0; i < EchipeDiviziaA2004_2005.length; i++){
                System.out.println(EchipeDiviziaA2004_2005[i]);
            }
        }
        if(competitia.equals(CompetitiiEditia2004_2005[1])){
            for(int i = 0; i < EchipeCupaRomaniei2004_2005.length; i++){
                System.out.println(EchipeCupaRomaniei2004_2005[i]);
            }
        }
        if(competitia.equals(CompetitiiEditia2004_2005[2])){
            for(int i = 0; i < EchipeUefaIntertotoCup2005.length; i++){
                System.out.println(EchipeUefaIntertotoCup2005[i]);
            }
        }




    }
}
