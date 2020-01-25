 public int maxDepth(TreeNode r) {
       int depth = 0;
    Stack<TreeNode> stack = new Stack<>();
    Stack<TreeNode> path = new Stack<>();

    stack.push (r);
    while (!stack.empty()) {
        r = stack.peek();
        if (!path.empty() && r == path.peek()) {
            if (path.size() > depth)
                depth = path.size();
            path.pop();
            stack.pop();
        } else {
            path.push(r);
            if (r.right != null)
                stack.push(r.right);
            if (r.left != null)
                stack.push(r.left);
        }
    }

    return depth;
    }
