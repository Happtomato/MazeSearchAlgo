

package ch.bbbaden.m411.la8020;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Manuel Bachofner
 */
public class Player {
    private final Maze maze;
    private final ArrayList<Node> solution = new ArrayList<>();
    
    public Player(Maze maze){
        this.maze = maze;
    }
    
    public void printSolution(){
        //ToDo: Ausgeben des richtigen Weges auf der Konsole

        searchDepth(maze.getRoot());



    }
    public void searchDepth(Node node){
        for(Node child : node.getChildren()){
            //put the current child into the solution
            solution.add(node);
            //if the current child is the goal
            if(child.isGoal()){
                solution.add(child);

                for(int i = 0; i < solution.size(); i++){
                    Node temp = solution.get(i);
                    for (int j = i + 1; j < solution.size(); j++){
                        if(temp == solution.get(j)){
                            solution.remove(j);
                        }
                    }
                }


                for(Node n : solution){
                    System.out.println(n.toString());
                }

                System.out.println("exit found");

                solution.clear();
                break;
            }
            else if(child.getChildren() != null){
                searchDepth(child);
            }
            else{
                solution.remove(node);
            }
        }
    }


}
