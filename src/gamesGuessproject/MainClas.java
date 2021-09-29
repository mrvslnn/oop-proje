package gamesGuessproject;

public class MainClas {

  
    public static void main(String[] args) {

        GuessGame obj = new GuessGame();

        int sayi = obj.randomGenerator();

        System.out.println(sayi);

        obj.LetsGuess(sayi);

    }

}
