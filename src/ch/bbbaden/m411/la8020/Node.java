package ch.bbbaden.m411.la8020;

import java.util.ArrayList;

/**
 *
 * @author Manuel Bachofner
 */
public class Node {

    private final int x, y;

    private boolean goal;
    private final ArrayList<Node> children;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
        children = new ArrayList<>();
    }

    public void setGoal(boolean goal) {
        this.goal = goal;
    }

    public boolean isGoal() {
        return goal;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }


    public void addChildren(Node child) {
        children.add(child);
    }

    @Override
    public String toString() {
        return "X: " + x + " Y:" + y;
    }

}
