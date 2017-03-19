import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class projekt{   
    public static void main(String[] args)
    throws InterruptedException{
        Scanner in = new Scanner(System.in);
        projekt funkcje = new projekt();
        
        String imie;
    System.out.println("Witaj, jak masz na imię? ");
    imie = in.nextLine();
    Thread.sleep(800);
    System.out.println("Cześć "+ imie + " :) ");
    System.out.println(" Wpisz 1 jeśli chcesz rozpocząć");
    System.out.println("Jeżeli chcesz wyjść wpisz 2");

    int door1;
    door1 = in.nextInt();
    Thread.sleep(1500);
    if(door1 == 1){
        
        System.out.print("C");
                    Thread.sleep(200);
        System.out.print("H");
                    Thread.sleep(200); 
        System.out.print("A");
                    Thread.sleep(200);
        System.out.print("P");
                    Thread.sleep(200);
        System.out.print("T");
                    Thread.sleep(200);
        System.out.print("E");
                    Thread.sleep(200);
        System.out.print("R");
                    Thread.sleep(200); 
        System.out.print(" ");
                    Thread.sleep(200); 
        System.out.print("1");
                    Thread.sleep(200);  
        System.out.println(" ");
                    Thread.sleep(200);                      
           
 
        System.out.println("*sen*");
        for(int sen = 0; sen <3; sen++){
            System.out.println("zzz...");
            Thread.sleep(1200);
            System.out.println("");
            Thread.sleep(1200);
        }
        
        System.out.println("*rozmazana rzeczywistość*");
        Thread.sleep(1200);
        System.out.println("Nieznajomy: " + imie + " tak? Jestem oczami śmierci i głosem bezkresu.");
        Thread.sleep(1200);
        System.out.println(imie + ": Jaa... Czy tu jesteś? Czy ja śnię?");
        
        

        
    }
    else
    System.exit(0);
    }
}