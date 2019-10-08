package eu.sig.training.ch03.binarytree;

public class BinaryTreeSearch {

    public static int calculateDepth(BinaryTreeNode<Integer> node, int nodeValue) {
        int depth = 0;
        if (node.getValue() == nodeValue) {
            return depth;
        }
        if (nodeValue < node.getValue()) {
            BinaryTreeNode<Integer> left = node.getLeft();
            if (left == null) {
                throw new TreeException("Value not found in tree!");
            }
            return 1 + calculateDepth(left, nodeValue);
        } 
        BinaryTreeNode<Integer> right = node.getRight();
        if (right == null) {
            throw new TreeException("Value not found in tree!");
        }
        return 1 + calculateDepth(right, nodeValue);
    }

}