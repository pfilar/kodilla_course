package com.kodilla.game;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Random;

import static com.kodilla.game.Hit.O;
import static com.kodilla.game.Hit.X;
import static javafx.application.Platform.exit;

public class TicTacToeApp extends Application {

    private static final int BOARD_WIDTH = 600;
    private static final int BOARD_HEIGHT = 600;

    private static Game game;
    private Pane root = new Pane();

    private Parent createContent() {

        root.setPrefSize(BOARD_WIDTH, BOARD_HEIGHT);

        for (int i = 0; i < 3; i++) {                                    // odpowiada za ilość pól do gry
            for (int j = 0; j < 3; j++) {
                Tile tile = new Tile();
                tile.setTranslateX(j * 200);                            // odpowiada za rozmiar pól
                tile.setTranslateY(i * 200);
                root.getChildren().add(tile);
            }
        }
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    private class Tile extends StackPane {
        private Text text = new Text();                                     // odpowiada za X i Y

        public Tile() {
            Rectangle border = new Rectangle(200, 200);       // odpowiada za "rysowanie" pól
            border.setFill(null);                                           // kolor lini  // null - transpartentny
            border.setStroke(Color.BLACK);                                  // kolory planszy

            text.setFont(Font.font(72));                                    // czcionka "X" i "O"

            setAlignment(Pos.CENTER);                                       //pozycja na planszy
            getChildren().addAll(border, text);                             // dodajemy border, text

            setOnMouseClicked(event -> {                                    // kliknięcie myszy
                double sceneX = event.getSceneX();
                double sceneY = event.getSceneY();

                int x = getX((int) sceneX);
                int y = getY((int) sceneY);

                if (event.getButton() == MouseButton.PRIMARY) {
                    setX(x, y);

                    boolean checkCol = game.checkCol(y);
                    boolean checkRow = game.checkRow(x);
                    System.out.println("col: " + checkCol);
                    System.out.println("row: " + checkRow);

//                    boolean winner = game.isWinner(y, x);
//                    System.out.println("WINNER: " + winner);

                    if (!game.checkLastMove()) {
                        computerMove();
                    }
                    Winner winner = game.isWinner();
                    if (winner != Winner.NONE){
                        System.out.println(winner);
                        // wyświetlenie komunikatu zwycięzca  / może być zerowanie planszy / przejscie do nowej rozgrywki (null do wszystkich pol)
                        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, winner + " Won! Press Yes if you want play again and No if you want to exit", ButtonType.YES, ButtonType.NO);     // klasa Alert / typ CONFIRMATION można dać iny
                        alert.showAndWait();    // odpowiada za wyrzucenie okienka na pulpit
                        if (alert.getResult() == ButtonType.YES) {
                            game.reset();
                            drawBoard();
                        } else if (alert.getResult() == ButtonType.NO) {
                            exit();  // platform exit java fx
                        }
                    }
                }
//                else if (event.getButton() == MouseButton.SECONDARY) {
//                    setO(x, y);
//                }
            });
        }

        private boolean computerMove() {
            Random random = new Random();
            int x = random.nextInt(BOARD_WIDTH);
            int y = random.nextInt(BOARD_HEIGHT);

            if (!setO(getX(x), getY(y))) {
                computerMove();
            }

            return setO(getX(x), getY(y));
        }

        private void setX(int x, int y) {
            System.out.println("X: " + x + " Y: " + y);
            game.setValue(x, y, X);
            drawBoard();
        }

        private boolean setO(int x, int y) {
            System.out.println("X: " + x + " Y: " + y);
            boolean isSetValue = game.setValue(x, y, O);
            drawBoard();

            return isSetValue;
        }
    }

    private void drawBoard() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                Tile tile = (Tile) root.getChildren().get(y * 3 + x);
                Hit hit = game.getValue(x, y);
                if (hit == O) {
                    ((Text) tile.getChildren().get(1)).setText("O");
                } else if (hit == X) {
                    ((Text) tile.getChildren().get(1)).setText("X");
                } else {
                    ((Text) tile.getChildren().get(1)).setText("");
                }
            }
        }
    }

    private int getY(int y) {
        return y / 200;
    }

    private int getX(int x) {
        return x / 200;
    }

    public static void main(String[] args) {
        game = new Game();                      // przechowuje logike rozgrywki
        launch(args);
    }
}
