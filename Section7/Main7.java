package Section7;


import java.util.*;

public class Main7 {

    Node root;

    public void BFS(Node root) {

        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int Lv = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            System.out.print("Lv" + Lv + " : ");
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null) {
                    q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    q.offer(cur.rt);
                }
            }
            Lv++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Main7 tree = new Main7();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}
