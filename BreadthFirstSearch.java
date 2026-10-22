
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] tree = {10, 5, 20, 2, 8};
        Queue<Integer> q = new LinkedList<>();
        q.add(0);

        while (!q.isEmpty()) {
            int i = q.poll();
            System.out.print(tree[i] + " ");
            if (2*i+1 < tree.length) q.add(2*i+1);
            if (2*i+2 < tree.length) q.add(2*i+2);
        }
    }
}
