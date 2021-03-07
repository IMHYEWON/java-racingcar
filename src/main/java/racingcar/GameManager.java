package racingcar;

import java.util.Random;
import java.util.Scanner;
import racingcar.io.InputView;
import racingcar.io.Printer;

public class GameManager {

  public static void main(String[] args) {
    GameManager.startGame();
  }

  private static void startGame() {
    try (InputView inputView = new InputView(new Scanner(System.in))) {
      Printer.welcomeMessage();
      int carCount = inputView.inputCarCount();
      int round = inputView.inputRound();
      Printer.printBlankLine();
      Printer.printResultMessage();

      Game game = new Game(new Random());
      game.start(carCount, round);
    }
  }
}
