package BT;


public class BinaryTree<T extends Comparable<T>> {
    private T Value;
    public BinaryTree<T> Right;
    public BinaryTree<T> Left;
    private boolean isSet;

    public BinaryTree() {
        Right = null;
        Left = null;
        Value = null;
        isSet = false;
    }

    public void Add(T obj) {
        if (!isSet) {
            Value = obj;
            isSet = true;
            return;
        } else if (Value.compareTo(obj) < 0) {
            if (Right == null) Right = new BinaryTree<T>();
            Right.Add(obj);
        } else {
            if (Left == null) Left = new BinaryTree<T>();
            Left.Add(obj);
        }
    }

     public void getValueList() {
         if (isSet)
         {
            if (Left != null) Left.getValueList();
            System.out.print(Value+" ");
            if (Right != null) Right.getValueList();
         }
     }
}

