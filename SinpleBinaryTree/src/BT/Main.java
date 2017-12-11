package BT;

public class Main {

    public static void main(String[] args) {
        BinaryTree<Integer> intBT = new BinaryTree<>();
        intBT.Add(5);
        intBT.Add(9);
        intBT.Add(3);
        intBT.Add(13);
        intBT.getValueList();
        System.out.println();
        BinaryTree<String> strBT = new BinaryTree<>();
        strBT.Add("oh");
        strBT.Add("my");
        strBT.Add("god");
        strBT.Add("sorry");
        strBT.getValueList();
    }
}
