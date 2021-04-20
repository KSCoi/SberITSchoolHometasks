package HomeTasks.Lection7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Balda {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var player1 = new Player(); // создаем двух игроков
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

        while(!(player1.isSurrender && player2.isSurrender)){  // проверка сдался игрок или нет (ввел ли пустую строку)
            if(turn%2!=0) // проверка на порядок хода
            {
                System.out.println("turn of Player 1");
            }
            else System.out.println("turn of Player 2");
            String playerWord = scanner.nextLine();

            if(turn%2!=0) {
                if (playerWord.isEmpty())   { //если игрок 1 ввел пустую строку, то он сдается, продолжаем со вторым
                    player1.isSurrender = true;
                    turn++;
                    continue;
                }
                if(!isPartOfMainWord(playerWord,letters)){ //проверка на буквы
                    System.out.println("Your new word consists letters, that are not contained it the word: " + mainWord);
                    System.out.println("Enter new word");
                    continue;
                }
                if(!words.add(playerWord)) //проверка на наличие слова
                {
                    System.out.println("The word: "+"<<"+ playerWord+">>"+" has already  been used, please try another word or press ENTER to give up");
                    continue;
                }

                turn++; //если все предыдущие пункты пройдены, то ход следующего
                if(player2.isSurrender) // если следующий сдался, то ход остается у игрока 1
                {
                    turn--;
                }
                wordsOfPlayer1.add(playerWord);
                continue;
            }
            if(turn%2==0){ // Все тоже самое, только для игрока 2
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

    public static boolean isPartOfMainWord(String playerWord,HashSet<Character> mainWordLetters){ // сравниваем буквы mainWord и playerWord
        char[] arr = playerWord.toCharArray();
        for(var letter : arr){
            if (!mainWordLetters.contains(letter))
                return  false;
        }
        return true;
    }
}
