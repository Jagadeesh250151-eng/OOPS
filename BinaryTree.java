
import java.util.*;

class Node<T> {
    T data;
    Node<T> left, right;

    Node(T data) {
        this.data = data;
    }
}

public class Main {
    static <T> void dfs(Node<T> n) {
        if (n == null) return;
        System.out.print(n.data + " ");
        dfs(n.left);
        dfs(n.right);
    }

    static <T> void bfs(Node<T> root) {
        Queue<Node<T>> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node<T> n = q.poll();
            System.out.print(n.data + " ");
            if (n.left != null) q.add(n.left);
            if (n.right != null) q.add(n.right);
        }
    }

    public static void main(String[] args) {
        Node<Integer> root = new Node<>(10);
        root.left = new Node<>(5);
        root.right = new Node<>(20);
        root.left.left = new Node<>(2);
        root.left.right = new Node<>(8);

        System.out.print("DFS: ");
        dfs(root);
        System.out.print("\nBFS: ");
        bfs(root);
    }
}
