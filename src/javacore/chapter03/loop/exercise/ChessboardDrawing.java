package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main(String[] args){

        int chessboardSize = 5;

        for (int row = 1; row <= chessboardSize; row++) {

            for (int column = 1; column <= chessboardSize; column++) {

                if (row % 2 == column % 2) {
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }

            System.out.println();
        }
    }
}
