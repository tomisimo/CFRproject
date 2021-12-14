package tamas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String editiileDeFotbal[] = {"2004-2005", "2005-2006", "2006-2007", "2007-2008", "2008-2009", "2009-2010"};
        String echipeEditia2004_2005[] = {"FC STEAUA Bucuresti", "FC DINAMO Bucuresti", "FC RAPID Bucuresti",
                "FC NATIONAL Bucuresti"};
        for (int i = 0; i < editiileDeFotbal.length; i++) {
            System.out.println(editiileDeFotbal[i]);
        }
        System.out.println("Alege editia !");
        Scanner inputObject = new Scanner(System.in);
        String theInput = inputObject.nextLine();

        if(theInput.equals(editiileDeFotbal[0])){
            for(int i =0; i < echipeEditia2004_2005.length; i++){
                System.out.println(echipeEditia2004_2005[i]);
            }
        }


    }
}
