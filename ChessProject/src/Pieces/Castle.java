package Pieces;
import generalElements.*;

public class Castle extends Piece { // classe dos torres, herda os atributos e metodos da classe geral peça
    
    public Castle(char name_piece){
        super();
        this.name_piece = name_piece;
    }
    
    @Override
    public boolean move(int x, int y){
        /*As classes peças filhas dessa classe, terão este método reescrito para cada peça*/
        return true;
    }
}