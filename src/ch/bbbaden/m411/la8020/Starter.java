package ch.bbbaden.m411.la8020;

/**
 *
 * @author Manuel Bachofner
 */


public class Starter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Maze maze = new Maze();
        Player player = new Player(maze);           //Erselle den Player (die Maus)
        player.printSolution();                     //Gebe den richtigen Weg auf der Konsole aus
                
    }
    
}
