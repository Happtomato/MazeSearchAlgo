package ch.bbbaden.m411.la8020;

/**
 *
 * @author Manuel Bachofner
 */
public class Maze {

    private Node root;

    public Maze() {

        root = new Node(0, 0);
        Node node01 = new Node(0, 1);
        Node node02 = new Node(0, 2);
        Node node03 = new Node(0, 3);

        Node node10 = new Node(1, 0);
        Node node11 = new Node(1, 1);
        Node node12 = new Node(1, 2);
        Node node13 = new Node(1, 3);

        Node node20 = new Node(2, 0);
        Node node21 = new Node(2, 1);
        Node node22 = new Node(2, 2);
        Node node23 = new Node(2, 3);

        Node node30 = new Node(3, 0);
        Node node31 = new Node(3, 1);
        Node node32 = new Node(3, 2);
        Node node33 = new Node(3, 3);

        root.addChildren(node01);
        node01.addChildren(node02);
        node02.addChildren(node12);
        node12.addChildren(node11);
        node11.addChildren(node21);
        node21.addChildren(node20);
        node21.addChildren(node22);
        
        node22.addChildren(node23);
        node23.addChildren(node13);
        node13.addChildren(node03);
        node20.addChildren(node10);
        node20.addChildren(node30);
        node30.addChildren(node31);
        node31.addChildren(node32);
        node32.addChildren(node33);

        node33.setGoal(true);
        
    }

    public Node getRoot() {
        return root;
    }

}
