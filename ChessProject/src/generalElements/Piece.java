package generalElements;
import java.util.ArrayList;

import javax.swing.*;

import Board.Board;
import generalElements.Commons.Color;

public class Piece {

    protected Color mColor; //Cor da peça 
    protected char name_piece; // Nome da peça
    protected JLabel png_peca; // icon da peça (Realizar)
    protected ArrayList movi_possibilityX; // Array list com as posições em X possiveis
    protected ArrayList movi_possibilityY; // Array list com as posições em Y possiveis
	
    protected static final String ANSI_YELLOW = "\u001B[33m"; 
    protected static final String ANSI_RESET = "\u001B[0m";
    protected static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    protected static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    protected static final String ANSI_BLACK = "\u001B[30m";
    protected static final String ANSI_RED = "\u001B[31m"; 
    

    public void Setname_piece(char name_piece){
        this.name_piece = name_piece;    
    }

    public char getName_piece(){
        return name_piece;
    }
    
    /*
     * Método padrão que retorna a cor da peça que o chama
     */
    public Color getColor() {
        return mColor;
    }  
    
    public void setColor(Commons.Color mcolor){
        this.mColor = mcolor;
    }

    /*
     * Método para realizar o movimento de uma peça, retorna se é possível mover para a cordenada designada*
     */
    public void SetPossible_Pos(Board tab,int x, int y){}
    
    public void move(Board tab,int t1, int t2, int x, int y) {
    	tab.board[x][y].setPiece(tab.board[t1][t2].getPiece());
    	tab.board[t1][t2].setPiece(null);
    }
    
    //Retorna Array List que guarda as possibilidades de movimentação em X
    public ArrayList getmovi_possibilityX(){
    	return movi_possibilityX;
    }

    //Retorna Array List que guarda as possibilidades de movimentação em Y
    public ArrayList getmovi_possibilityY(){
    	return movi_possibilityY;
    }
    
}
