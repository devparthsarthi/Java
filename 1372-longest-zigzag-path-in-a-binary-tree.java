class Solution {

    int ans = 0;

    public int longestZigZag(TreeNode root) {

        dfs(root);

        return ans;
    }

    private int[] dfs(TreeNode root) {

        if (root == null) {
            return new int[]{-1, -1};
        }

        int[] left = dfs(root.left);
        int[] right = dfs(root.right);

        int goLeft = left[1] + 1;
        int goRight = right[0] + 1;

        ans = Math.max(ans, Math.max(goLeft, goRight));

        return new int[]{goLeft, goRight};
    }
}