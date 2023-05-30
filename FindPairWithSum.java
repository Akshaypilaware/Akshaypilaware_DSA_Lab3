

public class FindPairWithSum {

    public static void main(String[] args) {
      // Create a binary search tree.
      TreeNode root = new TreeNode(40);
      root.left = new TreeNode(20);
      root.right = new TreeNode(60);
      root.left.left = new TreeNode(10);
      root.left.right = new TreeNode(30);
      root.right.left = new TreeNode(50);
      root.right.right = new TreeNode(70);
  
      // Find a pair with a sum of 130.
      int sum = 130;
      TreeNode[] pair = findPairWithSum(root, sum);
  
      // Print the pair.
      if (pair != null) {
        System.out.println(pair[0].value + ", " + pair[1].value);
      } else {
        System.out.println("Nodes are not found.");
      }
    }
  
    private static TreeNode[] findPairWithSum(TreeNode root, int sum) {
      if (root == null) {
        return null;
      }
  
      // Recursively search the left subtree.
      TreeNode[] leftPair = findPairWithSum(root.left, sum - root.value);
  
      // If a pair is found in the left subtree, return it.
      if (leftPair != null) {
        return leftPair;
      }
  
      // Recursively search the right subtree.
      TreeNode[] rightPair = findPairWithSum(root.right, sum - root.value);
  
      // If a pair is found in the right subtree, return it.
      if (rightPair != null) {
        return rightPair;
      }
  
      // If no pair is found in either subtree, return null.
      return null;
    }
  }
  
  class TreeNode {
  
    int value;
    TreeNode left;
    TreeNode right;
  
    public TreeNode(int value) {
      this.value = value;
    }
  }