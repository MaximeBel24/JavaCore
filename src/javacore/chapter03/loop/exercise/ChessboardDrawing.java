package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main(String[] args){

        int chessboardSize = 8;

        for (int row = 0; row < chessboardSize; row++ ){

            for (int column = 0; column < chessboardSize; column++){
                if (row % 2 == 0 && column % 2 == 0){
                    System.out.print("# ");
                } else if (row % 2 != 0 && column % 2 != 0){
                    System.out.print("# ");
                } else {
                    System.out.print(". ");
                }
            }

            System.out.println(" ");

        }
    }
}
