import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String gameWelcome = "Welcome to rock, paper, scissors. \nPlease press \"M\" for multiplayer or \"S\" for single player";
        System.out.println(gameWelcome);
        String gameModeSelect = scanner.nextLine();

        gameDecider(gameModeSelect.toUpperCase());
        //multiplayerNames();

        String firstPlayerNameText = "Please chose a name for the first player";
        String secondPlayerNameText = "Please chose a name for the second player";
        System.out.println(firstPlayerNameText);
        String firstPlayerName = scanner.nextLine();
        System.out.println(secondPlayerNameText);
        String secondPlayerName = scanner.nextLine();

        rockPaperScissorSout();

        rockPaperScissorSelectorFirstPlayer(firstPlayerName);
        rockPaperScissorSelectorSecondPlayer(secondPlayerName);

    }

    public static void rockPaperScissorSelectorFirstPlayer(String firstPlayerName) {

        String selectMSG = "Please select either \"1\" \"2\" \"3\" ";
        System.out.println(selectMSG + firstPlayerName);
        String firstPlayerChoice = scanner.nextLine();
    }

    public static void rockPaperScissorSelectorSecondPlayer(String secondPlayerName) {
        String selectMSG = "Please select either \"1\" \"2\" \"3\" ";
        System.out.println(selectMSG + secondPlayerName);
        String secondPlayerChoice = scanner.nextLine();
    }

    /*
    public static void multiplayerNames() {
        String firstPlayerNameText = "Please chose a name for the first player";
        String secondPlayerNameText = "Please chose a name for the second player";

        System.out.println(firstPlayerNameText);
        String firstPlayerName = scanner.nextLine();
        System.out.println(secondPlayerNameText);
        String secondPlayerName = scanner.nextLine();

        rockPaperScissorSout();
    }
     */

    public static void gameDecider(String gameModeSelect){

        if (gameModeSelect.equals("M")) {
            System.out.println("Multiplayer");
        } else if (gameModeSelect.equals("S")) {
            System.out.println("Singleplayer");
        }
    }

    public static void rockPaperScissorSout() {
        String[] rockPaperScissors = {"Rock", "Paper", "Scissors"};
        int[] rockPaperScissorsNumbers = {1, 2, 3};
        for (int i = 0; i < rockPaperScissorsNumbers.length; i++) {
            System.out.println(rockPaperScissorsNumbers[i] + " " + rockPaperScissors[i]);
        }
    }




}
