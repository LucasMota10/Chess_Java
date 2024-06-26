package Pieces;

import java.util.ArrayList;

import Board.Board;
import generalElements.*;

public class Castle extends Piece { // classe dos torres, herda os atributos e metodos da classe geral peça

    // Variável de controle da mocimentação
    private boolean lock;

    /*
     * Construtor de Castle
     */
    public Castle(char name_piece) {
        super();
        this.name_piece = name_piece;
    }

    @Override
    // Função que verifica as possibilidades de movimento para Castle
    public void SetPossible_Pos(Board tab, int x, int y) {
        movi_possibilityX = new ArrayList();
        movi_possibilityY = new ArrayList();

        System.out.print("\033[H\033[2J"); 
		System.out.flush(); 
        
        System.out.println("Você selecionou uma " + ANSI_RED + "TORRE!" + ANSI_RESET);
        System.out.println(ANSI_RED + "As Movimentações possiveis estão marcadas em amarelo!" + ANSI_RESET);

        Commons.Cor actual_Cor = tab.board[x][y].getPiece().getCor();

        int ix = x;
        int iy = y;
        lock = true;

        while (lock) {
            ix++;
            if (tab.isinside(ix, iy)) {
                if (tab.board[ix][iy].getIsFree()) {
                    movi_possibilityX.add(ix);
                    movi_possibilityY.add(iy);
                } else {
                    checkEat(tab, ix, iy, actual_Cor);
                    lock = false;
                }
            } else
                lock = false;
        }

        ix = x;
        iy = y;
        lock = true;

        while (lock) {
            ix--;
            if (tab.isinside(ix, iy)) {
                if (tab.board[ix][iy].getIsFree()) {
                    movi_possibilityX.add(ix);
                    movi_possibilityY.add(iy);
                } else {
                    checkEat(tab, ix, iy, actual_Cor);
                    lock = false;
                }
            } else
                lock = false;
        }

        ix = x;
        iy = y;
        lock = true;

        while (lock) {
            iy--;
            if (tab.isinside(ix, iy)) {
                if (tab.board[ix][iy].getIsFree()) {
                    movi_possibilityX.add(ix);
                    movi_possibilityY.add(iy);
                } else {
                    checkEat(tab, ix, iy, actual_Cor);
                    lock = false;
                }
            } else
                lock = false;
        }

        ix = x;
        iy = y;
        lock = true;

        while (lock) {
            iy++;
            if (tab.isinside(ix, iy)) {
                if (tab.board[ix][iy].getIsFree()) {
                    movi_possibilityX.add(ix);
                    movi_possibilityY.add(iy);
                } else {
                    checkEat(tab, ix, iy, actual_Cor);
                    lock = false;
                }
            } else
                lock = false;
        }
        
        tab.Print_Board_Possibility(movi_possibilityX, movi_possibilityY);
    }
}
