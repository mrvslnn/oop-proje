package gamesGuessproject;

import java.util.Scanner;

public class GuessGame {

    public int randomGenerator() {

       // int rndmsayi = (int) ((Math.random() * 100) + 1);
        int rndmsayi = (int) (Math.random() * ((100-0) + 1)) + 0;
        
		return rndmsayi;
}
       public void LetsGuess(int sayi) {

        Scanner scan = new Scanner(System.in);

        int tahmin = 0;

        for (int i = 0; i < 5; i++) {
           System.out.print(i + 1 + ".Sayi gir: ");
            tahmin = scan.nextInt();
            
              if (tahmin < sayi) {
                System.out.println("Your number is too low");
            } else if (tahmin > sayi) {
                System.out.println("Your number is too high");
            } else if (tahmin == sayi) {
                System.out.println("You got it !!");
                break;
            }
        }
        if (tahmin != sayi) {
            System.out.println("Anlamadim dostum !!!");
        }
    }
}
