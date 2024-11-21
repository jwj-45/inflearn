package Section7;

import java.util.LinkedList;
import java.util.Queue;

public class Main9n10 {

    Node root;

    public int DFS(int Lv, Node root) {
        if (root.lt == null && root.rt == null) {
            return Lv;
        } else {
            return Math.min(DFS(Lv + 1, root.lt), DFS(Lv + 1, root.rt));
        }
    }

    public int BFS(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        int Lv = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                if (cur.lt == null && cur.rt == null) {
                    return Lv;
                } else if (cur.lt != null) {
                    q.offer(cur.lt);
                } else if (cur.rt != null) {
                    q.offer(cur.rt);
                }
            }
            Lv++;
        }
        return -1;
    }

    public static void main(String[] args) {

        Main9n10 tree = new Main9n10();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
//        System.out.println(tree.DFS(0, tree.root));
        System.out.println(tree.BFS(tree.root));

    }
}
