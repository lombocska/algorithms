package algorithms_java.BFA;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Node {

    private static final Logger LOGGER = LoggerFactory.getLogger(Node.class);

    // Parameters
    private int nodeValue;
    private Node nodeParent;


    private Node left;
    private Node right;
    private boolean visited;

    // Parametrized Constructor
    public Node(int nodeValue, Node left, Node right, boolean visited) {
        this.nodeValue = nodeValue;
        this.left = left;
        this.right = right;
        this.visited = visited;
    }

    public void setNodeParent(Node nodeParent) {
        this.nodeParent = nodeParent;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getNodeValue() {
        return nodeValue;
    }

    public Node getNodeParent() {
        return nodeParent;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public boolean isVisited() {
        return visited;
    }


    // method to seek the searched value in the NodeTree
    public static Node search(Node node, int searchedValue) {

        if(node.isVisited() == true) {
            if(node.getNodeParent() == null){
                LOGGER.warn("The searched value is not in the NodeTree!");
            }

        }

        return null;
    }

}
