//import java.util.Scanner;
//
//class TicTacToes{
//    static char[][] board;
//    public TicTacToes(){
//        board= new char[3][3];
//    }
//    void initBoard(){
//        for(int i=0; i< board.length;i++){
//            for(int j=0; j< board[i].length; j++){
//                board[i][j]=' ';
//                System.out.println(board[i][j]);
//            }
//        }
//    }
//    static void displayBoard(){
//        System.out.println("-------------");
//        for(int i=0; i< board.length; i++){
//            System.out.print("| ");
//            for(int j=0; j< board[i].length; j++){
//                System.out.print(board[i][j] + " | ");
//            }
//            System.out.println();
//            System.out.println("-------------");
//        }
//    }
//
//    static void placeMark(int row, int col, char mark){
//       if(row>=0 &&  row <=2 && col >=0 && col<=2) {
//
//           board[row][col] = mark;
//       }
//       else{
//           System.out.println("Invalid Input");
//       }
//    }
//    static boolean checkColWin(){
//        for(int j=0; j<=2 ; j++){
//            if(board[0][j]!=' ' && board[0][j]==board[1][j] &&
//                board[1][j]==board[2][j]){
//                return true;
//            }
//        } return false;
//    }
//
//    static boolean checkRowWin(){
//        for(int i=0; i<=2; i++){
//            if(board[i][0]!=' ' && board[i][0]==board[i][1] &&
//                    board[i][1]==board[i][2]){
//                return true;
//            }
//        } return false;
//    }
//
//    static boolean checkDiagWin(){
//        if(board[0][0]!=' ' && board[0][0]==board[1][1] &&
//                board[1][1]==board[2][2] ||
//                board[0][2] !=' ' && board[0][2]==board[1][1] &&
//                board[1][1]==board[2][0]){
//            return true;
//        }else{
//            return false;
//        }
//
//    }
//}
//
//class HumanPlayer{
//    String name;
//    char mark;
//
//    public HumanPlayer(String name, char mark){
//        this.name=name;
//        this.mark=mark;
//    }
//
//    void makeMove(){
//        Scanner scan= new Scanner(System.in);
//        int row;
//        int col;
//        do {
//            System.out.println("Enter the Row and col");
//            row=scan.nextInt();
//            col=scan.nextInt();
//        }while(!isValidMove(row,col));
//
//        TicTacToes.placeMark(row,col, mark);
//    }
//
//    boolean isValidMove(int row, int col){
//        if(row >=0 && row<=2 && col >=0 && col <=2){
//            if(TicTacToes.board[row][col]== ' '){
//                return true;
//            }
//        }return false;
//    }
//}
//public class LaunchGame {
//    public static void main(String [] args){
//        TicTacToes t= new TicTacToes();
//        t.initBoard();
//        HumanPlayer p1 = new HumanPlayer("Madhuri", 'X');
//        HumanPlayer p2 = new HumanPlayer("Komal", 'O');
//
//        HumanPlayer cp;
//        cp=p1;
//
//        while (true){
//            System.out.println(cp.name + " turn");
//            cp.makeMove();
//            TicTacToes.displayBoard();
//            if(TicTacToes.checkColWin() ||
//                    TicTacToes.checkRowWin() ||
//                    TicTacToes.checkDiagWin()){
//                System.out.println(cp.name + " has won");
//                break;
//            }else{
//                if(cp == p1){
//                    cp = p2;
//                }else{
//                    cp=p1;
//                }
//            }
//        }
//
//    }
//
//}