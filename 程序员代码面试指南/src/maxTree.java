import java.util.HashMap;
import java.util.Stack;

/**
 * @author dong
 * @date 2019/08/27 11:22
 * TODO: 生成MaxTree二叉树
 */
public class maxTree {

    public maxTreeNode getMaxTree(int[] arr){
        maxTreeNode[] nArr = new maxTreeNode[arr.length];
        for (int i = 0; i != arr.length; i++){
            nArr[i] = new maxTreeNode(arr[i]);
        }

        Stack<maxTreeNode> stack = new Stack<maxTreeNode>();
        HashMap<maxTreeNode, maxTreeNode> lBigMap = new HashMap<maxTreeNode, maxTreeNode>();
        HashMap<maxTreeNode, maxTreeNode> rBigMap = new HashMap<maxTreeNode, maxTreeNode>();

        for (int i = 0; i != nArr.length; i++){
            maxTreeNode curNode = nArr[i];
            while ((!stack.isEmpty()) && stack.peek().value < curNode.value){
                popStackSetMap(stack, lBigMap);
            }
            stack.push(curNode);
        }

        while(!stack.isEmpty()){
            popStackSetMap(stack, lBigMap);
        }

        for (int i = nArr.length - 1; i != -1; i++){
            maxTreeNode curNode = nArr[i];
            while ((!stack.isEmpty()) && stack.peek().value < curNode.value){
                popStackSetMap(stack, rBigMap);
            }
            stack.push(curNode);
        }

        while (!stack.isEmpty()){
            popStackSetMap(stack, rBigMap);
        }

        maxTreeNode head = null;

        for (int i = 0; i != nArr.length; i++){
            maxTreeNode curNode = nArr[i];
            maxTreeNode left = lBigMap.get(curNode);
            maxTreeNode right = rBigMap.get(curNode);

            if (left == null && right == null){
                head = curNode;
            }else if (left == null){
                if (right.left == null){
                    right.left = curNode;
                }else {
                    right.right = curNode;
                }
            }else if (right == null){
                if (left.left == null){
                    left.left = curNode;
                }else{
                    left.right = curNode;
                }
            }else {
                maxTreeNode parent = left.value < right.value ? left : right;
                if (parent.left == null){
                    parent.left = curNode;
                }else{
                    parent.right = curNode;
                }
            }
        }
        return head;
    }

    public void popStackSetMap(Stack<maxTreeNode> stack, HashMap<maxTreeNode, maxTreeNode> map){
        maxTreeNode popNode = stack.pop();
        if (stack.isEmpty()){
            map.put(popNode, null);
        }else {
            map.put(popNode, stack.peek());
        }
    }
}


class maxTreeNode {
    public int value;
    public maxTreeNode left;
    public maxTreeNode right;

    public maxTreeNode(int data){
        this.value = data;
    }
}
