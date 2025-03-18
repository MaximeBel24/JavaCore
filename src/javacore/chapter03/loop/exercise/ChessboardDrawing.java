package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main(String[] args){

        int chessboardSize = 5;

        for (int i = 0; i < chessboardSize; i++ ){
            if (i % 2 == 0){
                System.out.println("# . # . #");
            } else  {
                System.out.println(". # . # .");
            }
        }
    }
}
