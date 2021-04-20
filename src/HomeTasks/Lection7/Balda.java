package HomeTasks.Lection7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Balda {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var player1 = new Player();
        var player2 = new Player();

        System.out.println("Please input the main word");
        String mainWord = scanner.nextLine();

        var letters = new HashSet<Character>();
        var wordsOfPlayer1 = new LinkedHashSet<String>();
        var wordsOfPlayer2 = new LinkedHashSet<String>();
        var words = new LinkedHashSet<String>();
        int turn =1;

        for (int i = 0; i < mainWord.length(); i++) {
            letters.add(mainWord.charAt(i));
        }

        while(!(player1.isSurrender && player2.isSurrender)){
            if(turn%2!=0)
            {
                System.out.println("turn of Player 1");
            }
            else System.out.println("turn of Player 2");
            String playerWord = scanner.nextLine();

            if(turn%2!=0) {
                if (playerWord.isEmpty())   {
                    player1.isSurrender = true;
                    turn++;
                    continue;
                }
                if(!isPartOfMainWord(playerWord,letters)){
                    System.out.println("Your new word consists letters, that are not contained it the word: " + mainWord);
                    System.out.println("Enter new word");
                    continue;
                }
                if(!words.add(playerWord))
                {
                    System.out.println("The word: "+"<<"+ playerWord+">>"+" has already  been used, please try another word or press ENTER to give up");
                    continue;
                }

                turn++;
                if(player2.isSurrender)
                {
                    turn--;
                }
                wordsOfPlayer1.add(playerWord);
                continue;
            }
            if(turn%2==0){
                if(playerWord.isEmpty())    {
                    player2.isSurrender=true;
                    turn++;
                    continue;
                }
                if(!isPartOfMainWord(playerWord,letters)){
                    System.out.println("Your new word consists letters, that are not contained it the word: " + mainWord);
                    System.out.println("Enter new word");
                    continue;
            }
                if(!words.add(playerWord) )
                {
                    System.out.println("The word: "+"<<"+ playerWord+">>"+" has already  been used, please try another word or press ENTER to give up");
                    continue;
                }

                turn++;
                wordsOfPlayer2.add(playerWord);
                if(player1.isSurrender)
                    turn--;
            }
        }
        System.out.println("Total count of words: " + words.size());
        System.out.println("Words of player1: " +String.join(", ",wordsOfPlayer1));
        System.out.println("Words of player 2: " + String.join(", ", wordsOfPlayer2));

        if(wordsOfPlayer1.size()> wordsOfPlayer2.size())
            System.out.println("Player 1 won");
        else if (wordsOfPlayer1.size()< wordsOfPlayer2.size())
            System.out.println("Player 2 won");
        else
            System.out.println("DRAW!");
    }

    public static boolean isPartOfMainWord(String playerWord,HashSet<Character> mainWordLetters){
        char[] arr = playerWord.toCharArray();
        boolean tmp = false;
        for(var letter : arr){
            tmp = false;
            if (mainWordLetters.contains(letter))
                tmp = true;
        }
        return tmp;
    }
}
