import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    String cities [] ={"istanbul","ankara","izmir","antalya","mus","balıkesir","denizli","aksaray","yalova","canakkale"};
    int randomNumber = (int) (Math.random()*11);
    long timeMillis = System.currentTimeMillis();
    Scanner scan = new Scanner(System.in);
    String userChoise= "" ;
    boolean check = true;
    int caseAdam = 1;
    int score=0;
    while (check){
    try {

        for (int i=0;i<cities[randomNumber].length();i++){
            System.out.print("_");

        }
        System.out.println(cities[randomNumber]);
        userChoise = scan.nextLine().toLowerCase();
        for (int i=0;i<userChoise.length();i++){
            if( userChoise.charAt(i)=='0' || userChoise.charAt(i)== '1' || userChoise.charAt(i)== '2' ||userChoise.charAt(i)== '3' ||userChoise.charAt(i)=='4' ||userChoise.charAt(i)=='5' ||userChoise.charAt(i)=='6' ||userChoise.charAt(i)=='7' ||userChoise.charAt(i)=='8' ||userChoise.charAt(i)=='9'){
                throw new IllegalArgumentException();
            }
        }
        long time = System.currentTimeMillis() - timeMillis;
        if (userChoise.equals(cities[randomNumber]) ){

            if (time<20000){
                score = score+ 30;
            }
            else if (time>20000 && time<30000){
                score = score+20;
            }
            else if (time>30000 && time<40000){
                score = score+10;
            }
            else
                System.out.println("Çok fazla süre geçti bu turda puan alamadınız.");


            System.out.println("Tebrikler bildiniz!!"+ "Puanınız: "+ score);
            check=false;
        }
        else {
            adamAsmaca(caseAdam);
            caseAdam++;
        }
        if (caseAdam == 10){
            check=false;
        }
    }

    catch (IllegalArgumentException e){
        System.out.println("Lütfen kelime giriniz!");


    }

    }
    }
public static void adamAsmaca(int durum){
        switch(durum){
            case 9 :
                System.out.print(" __________     \n");
                System.out.print("|      ( )      \n");
                System.out.print("|       |       \n");
                System.out.print("|      /|\\     \n");
                System.out.print("|       |       \n");
                System.out.print("|      / \\     \n");
                System.out.print("|__             \n");
                System.out.print("\nOyun bitti kaybettiniz. :(\n");
                break;
            case 8 :
                System.out.print(" __________     \n");
                System.out.print("|      ( )      \n");
                System.out.print("|       |       \n");
                System.out.print("|      /|\\     \n");
                System.out.print("|       |       \n");
                System.out.print("|      /|       \n");
                System.out.print("|__             \n");
                System.out.print("\nBir hakkınız kaldı! \n");
                break;
            case 7 :
                System.out.print(" __________     \n");
                System.out.print("|      ( )      \n");
                System.out.print("|       |       \n");
                System.out.print("|      /|\\     \n");
                System.out.print("|       |       \n");
                System.out.print("|       |       \n");
                System.out.print("|__             \n");
                break;
            case 6 :
                System.out.print(" __________     \n");
                System.out.print("|      ( )      \n");
                System.out.print("|       |       \n");
                System.out.print("|      /|       \n");
                System.out.print("|       |       \n");
                System.out.print("|       |       \n");
                System.out.print("|__             \n");
                break;
            case 5 :
                System.out.print(" __________     \n");
                System.out.print("|      ( )      \n");
                System.out.print("|       |       \n");
                System.out.print("|       |       \n");
                System.out.print("|       |       \n");
                System.out.print("|       |       \n");
                System.out.print("|__             \n");
                break;
            case 4 :
                System.out.print(" __________     \n");
                System.out.print("|      ( )      \n");
                System.out.print("|               \n");
                System.out.print("|               \n");
                System.out.print("|               \n");
                System.out.print("|               \n");
                System.out.print("|__             \n");
                break;
            case 3 :
                System.out.print(" __________     \n");
                System.out.print("|               \n");
                System.out.print("|               \n");
                System.out.print("|               \n");
                System.out.print("|               \n");
                System.out.print("|               \n");
                System.out.print("|__             \n");
                break;
            case 2 :
                System.out.print("                \n");
                System.out.print("|               \n");
                System.out.print("|               \n");
                System.out.print("|               \n");
                System.out.print("|               \n");
                System.out.print("|               \n");
                System.out.print("|__             \n");
                break;
            case 1 :
                System.out.print("                \n");
                System.out.print("                \n");
                System.out.print("                \n");
                System.out.print("                \n");
                System.out.print("                \n");
                System.out.print("                \n");
                System.out.print(" __             \n");
                break;






}
    }
}