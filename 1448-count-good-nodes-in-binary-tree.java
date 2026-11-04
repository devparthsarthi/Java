class Solution {

    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }

    private int dfs(TreeNode root, int maxValue) {

        if (root == null) {
            return 0;
        }

        int count = 0;

        if (root.val >= maxValue) {
            count = 1;
        }

        maxValue = Math.max(maxValue, root.val);

        count += dfs(root.left, maxValue);
        count += dfs(root.right, maxValue);

        return count;
    }
}