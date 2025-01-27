package main;

//1import java.util.ArrayList;
import java.util.Scanner;




public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Safe newSafe = new Safe("0000");
        boolean exit = false;



    while(!exit){
        System.out.println("1) Aseta PIN-koodi");
        System.out.println("2) Lisää tietoja kansioon");
        System.out.println("3) Listaa tiedot kansiosta");
        System.out.println("0) Lopeta ohjelma");

        if(sc.hasNext()) {
            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);

            switch(i) {
                case 1:
                System.out.print("Anna uusi PIN-koodi:");
                String newPin = sc.nextLine();
                newSafe.changePin(newPin);

                    break;
                case 2:



                    break; 



                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;
                default:
                    System.out.println("Syöte oli väärä");
                    break;    
                }

            }
        }
        sc.close();
    }
}


