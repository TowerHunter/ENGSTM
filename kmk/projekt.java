import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class projekt{   
    public static void main(String[] args)
    throws InterruptedException{
        Scanner in = new Scanner(System.in);
        projekt funkcje = new projekt();
        int karma = 0;
        int fantasy=0,wwreal=0,scifi=0;
        int door1, door2;         
        String imie;
    System.out.println("Witaj, jak masz na imię? ");
    imie = in.nextLine();
    Thread.sleep(800);
    System.out.println("Cześć "+ imie + " :) ");
    System.out.println("Czy chcesz rozpocząć?");
        do{
        System.out.println("1 - Tak, 2 - Nie");
        door1 = in.nextInt();
        if(door1 != 1 && door1 != 2) System.out.println(imie + "! Wybrano nieprawidłową opcje.");
        }while(door1 != 1 && door1 != 2);
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
        Thread.sleep(1600);
        System.out.println("Nieznajomy: " + imie + ", tak? Jestem oczami śmierci i głosem bezkresu.");
        Thread.sleep(4000);
        System.out.println(imie + ": Jaa... Czy tu jesteś? Czy ja śnię?");
        Thread.sleep(2300);        
        System.out.println("Nieznajomy: I Ty tu jesteś, i ja. A teraz powiedz mi proszę pare rzeczy o sobie.");
        Thread.sleep(3800);
        int answ1;
        do{
        System.out.println("{1: Ok, co chcesz wiedzieć?");
        System.out.println("{2: Chwila, gdzie jesteśmy? Co tu robisz?");
        System.out.println("{3: Spadaj zjawo... chcę się obudzić.");
        answ1 = in.nextInt();
        if(answ1 != 1 && answ1 != 2 && answ1 != 3) System.out.println(imie + "! Wybrano nieprawidłową opcje");
        }while(answ1 != 1 && answ1 != 2 && answ1 != 3);
        switch(answ1){
            case 1:
                System.out.println(imie + ": Ok, co chcesz wiedzieć?"); 
                Thread.sleep(1400);
                System.out.println("Nieznajomy: Nie boisz się mnie, super. ");
                Thread.sleep(2400);
                karma = karma + 1;
                break;
            case 2:
                System.out.println(imie + ": Chwila, gdzie jesteśmy? Co tu robisz?");
                Thread.sleep(1500);
                System.out.println("Nieznajomy: Jesteśmy w krainie snów... Czy też może w pustce? Różnie to miejsce nazywają. ");
                Thread.sleep(3300);
                karma = karma + 1;
                break;
            case 3:
                System.out.println(imie + ": Spadaj zjawo... chcę się obudzić.");
                Thread.sleep(2400);
                System.out.println("Nieznajomy: Nie zajmę Ci dużo czasu... ");
                Thread.sleep(1400);
                karma = karma - 1;
                break;
        }
        
        System.out.println("Nieznajomy: Potrzebuję zadać Ci pare pytań. Muszę uzupełnić rejestr.");
        Thread.sleep(2700);
        System.out.println("Nieznajomy: Mów tylko wtedy kiedy Cię o coś zapytam. ");
        Thread.sleep(2400);
        System.out.println("Nieznajomy: Ok, zaczynamy. Niegdyś przy wyjaśnianiu problemów ostatecznością był miecz.");
        Thread.sleep(3100);
        System.out.println("Nieznajomy: Dzisiaj żołnierze posługują się bronią palną która zabija na dystans.");
        Thread.sleep(3100);
        System.out.println("Nieznajomy: Wyobrażenia ludzi na temat broni przyszłości kierują się w stronę blasterów.");
        Thread.sleep(3100);
        System.out.println(" ");
        System.out.print("Nieznajomy: Który typ broni najbardziej Ci odpowiada");
        if(karma>0){
            System.out.println("?");
        }
        if(karma<0){
            System.out.println(" niedobrzelcu?");
        }
        int answ2;
        do{
        System.out.println("{1: Broń biała.");
        System.out.println("{2: Pistolety, karabiny, itd...");
        System.out.println("{3: Jasne że blastery.");
        answ2 =in.nextInt();
        if(answ2 != 1 && answ2 != 2 && answ2 != 3) System.out.println(imie + "! Wybrano nieprawidłową opcje");
        }while(answ2 != 1 && answ2 != 2 && answ2 != 3);
        switch(answ2){
            case 1:
                System.out.println(imie + ": Broń biała.");
                fantasy += 1;
                break;
            case 2:
                System.out.println(imie + ": Pistolety, karabiny, itd...");
                wwreal += 1;
                break;
            case 3:
                System.out.println(imie + ": Jasne że blastery.");
                scifi += 1;
                break;
        }
        System.out.println("Nieznajomy: Dziękuję, już możesz spać dalej...");
        Thread.sleep(1600);  
        System.out.println(imie + ": Czek... al... o.. co. chodziło?...");
        Thread.sleep(1600);  
        System.out.println("*rozmazana rzeczywistość*");
        Thread.sleep(1600);     
        System.out.println("*sen*");
        for(int sen = 0; sen <3; sen++){
            System.out.println("zzz...");
            Thread.sleep(800);
            System.out.println("");
            Thread.sleep(800);
        }
        System.out.print("T");
                    Thread.sleep(200);
        System.out.print("H");
                    Thread.sleep(200); 
        System.out.print("E");
                    Thread.sleep(200);
        System.out.print(" ");
                    Thread.sleep(200);
        System.out.print("E");
                    Thread.sleep(200);
        System.out.print("N");
                    Thread.sleep(200);
        System.out.print("D");
                    Thread.sleep(200); 
        System.out.print(" ");
                    Thread.sleep(200); 
        System.out.print("O");
                    Thread.sleep(200);  
        System.out.print("F ");
                    Thread.sleep(200);  
        System.out.print(" ");
                    Thread.sleep(200);
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
        System.out.println("Czy chcesz kontynuować?");
        do{
        System.out.println("1 - Tak, 2 - Nie");
        door2 = in.nextInt();
        if(door2 != 1 && door2 != 2) System.out.println(imie + "! Wybrano nieprawidłową opcje.");
        }while(door2 != 1 && door2 != 2); 
        if(door2 == 1){
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
        System.out.print("2");
                    Thread.sleep(200);  
        System.out.println(" ");
                    Thread.sleep(200);                      
            
        }
        else System.exit(0);
        }
    else
    System.exit(0);
    }
}