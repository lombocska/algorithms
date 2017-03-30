package algorithms_java.BFA;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NodeApp {

    private static final Logger LOGGER = LoggerFactory.getLogger(NodeApp.class);

    public static void main(String[] args) {
        //NodeTree
        Node node13 = new Node(13, null, null, false);
        Node node12 = new Node(12, null, null, false);
        Node node11 = new Node(11, null, null, false);
        Node node10 = new Node(10, null, null, false);
        Node node9 = new Node(9, null, null, false);
        Node node8 = new Node(8, node10, node11, false);
        node11.setNodeParent(node8);
        node10.setNodeParent(node8);
        Node node7 = new Node(7, node12, node13, false);
        node13.setNodeParent(node7);
        node12.setNodeParent(node7);
        Node node6 = new Node(6, null, null, false);
        Node node5 = new Node(5, node8, node9, false);
        node9.setNodeParent(node5);
        node8.setNodeParent(node5);
        Node node4 = new Node(4, null, null, false);
        Node node3 = new Node (3, node6, node7, false);
        node7.setNodeParent(node3);
        node6.setNodeParent(node3);
        Node node2 = new Node(2, node4, node5, false);
        node5.setNodeParent(node2);
        node4.setNodeParent(node2);
        Node node1 = new Node(1,  node2, node3, false);
        node3.setNodeParent(node1);
        node2.setNodeParent(node1);
        node1.setNodeParent(null);

        LOGGER.debug(String.valueOf(node1.isVisited()));
        LOGGER.debug(String.valueOf(node1.getNodeParent()));
        LOGGER.debug(String.valueOf(node1.getNodeValue()));



    }
}
