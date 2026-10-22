
class Node<T> {
    T data;
    Node<T> left, right;

    Node(T data) {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(10);
        root.left = new Node<>(5);
        root.right = new Node<>(20);

        System.out.println("Root Node : " + root.data);
        System.out.println("Left Child : " + root.left.data);
        System.out.println("Right Child : " + root.right.data);
    }
}

