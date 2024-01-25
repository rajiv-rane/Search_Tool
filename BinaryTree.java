class Node {
    String data;
    String[] keywords; // New attribute to store keywords
    Node left;
    Node right;

    // Calling the constructor
    public Node(String data, String[] keywords) {
        this.data = data;
        this.keywords = keywords;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null; // Initialize root to null
    }

    public void insert(String data, String[] keywords) {
        root = insertRec(root, data, keywords);
    }

    private Node insertRec(Node root, String data, String[] keywords) {
        if (root == null) {
            root = new Node(data, keywords);
            return root;
        } else if (data.compareTo(root.data) < 0) {
            // Insert at the left node
            root.left = insertRec(root.left, data, keywords);
        } else if (data.compareTo(root.data) > 0) {
            // Insert at the right node
            root.right = insertRec(root.right, data, keywords);
        }
        // If the data is equal to the current node's data, no duplicate insertion is allowed
        // Return the modified root node
        return root;
    }

    public void search(String question) {
        boolean found = searchRec(root, question);
        if (!found) {
            System.out.println("Answer not found for the question: " + question);
        }
    }

    private boolean searchRec(Node root, String question) {
        if (root == null) {
            return false;
        }

        boolean foundInCurrentNode = containsKeyword(root.keywords, question);

        if (foundInCurrentNode) {
            System.out.println(root.data);
        }

        // Recursively search in both subtrees
        boolean foundInLeft = searchRec(root.left, question);
        boolean foundInRight = searchRec(root.right, question);

        return foundInCurrentNode || foundInLeft || foundInRight;
    }

    private boolean containsKeyword(String[] keywords, String question) {
        for (String key : keywords) {
            if (question.toLowerCase().contains(key.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
