package day25;

public class Diameter_Of_Tree_Appo2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    static class TreeInfo{
        int heig;
        int diam;

        TreeInfo(int heig, int diam){
            this.heig = heig;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0, 0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int treeHeight = Math.max(left.heig, right.heig) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.heig + right.heig + 1;

        int treeDiameter = Math.max(Math.max(diam1, diam2), diam3);

        TreeInfo totalInfo = new TreeInfo(treeHeight, treeDiameter);
        return totalInfo;

    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(diameter2(root).diam);
    }
}
