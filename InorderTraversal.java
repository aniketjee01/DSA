class Solution {
    private List<Integer> solve(TreeNode root,List<Integer> ans) {
        if (root == null)
            return ans;
        solve(root.left,ans);
        ans.add(root.val);
        solve(root.right,ans);
        return ans;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        return solve(root,ans);
    }
}
