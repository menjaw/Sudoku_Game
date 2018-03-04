/*
 * This class works as a proxy functioning as an interface between the player and the game.
 *
 * Can control the access to an object 
 *
 * When accessing an object, additional functionality should be provided
 */
package pattern;

import interfaces.Board_Interface;
import server.Board;

/**
 *
 * @author Menja
 */
public class Proxy_Board implements Board_Interface{
    //Variables
    private String player;
    private Board board;
    
    //Constructor
    public Proxy_Board(String player) {
        this.player = player;
    }
    

    @Override
    public void generateSolution() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void generatePlayerBoard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkRow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkColumn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void checkBlock() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
