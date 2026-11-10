
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        boolean[][] vis = new boolean[x + 1][y + 1];
        Queue<int[]> q = new LinkedList<>();

        q.add(new int[]{0, 0, 0});
        vis[0][0] = true;

        while (!q.isEmpty()) {
            int[] a = q.poll();
            int p = a[0], r = a[1], s = a[2];

            if (p == z || r == z) {
                System.out.println(s);
                return;
            }

            int[][] next = {
                {x, r},
                {p, y},
                {0, r},
                {p, 0}
            };

            int np = p, nr = r;

            if (x > y) {
                int t = Math.min(p, y - r);
                next = Arrays.copyOf(next, 5);
                next[4] = new int[]{p - t, r + t};
            } else if (y > x) {
                int t = Math.min(r, x - p);
                next = Arrays.copyOf(next, 5);
                next[4] = new int[]{p + t, r - t};
            }

            for (int[] v : next) {
                if (v != null && !vis[v[0]][v[1]]) {
                    vis[v[0]][v[1]] = true;
                    q.add(new int[]{v[0], v[1], s + 1});
                }
            }
        }

        System.out.println(-1);
    }
}
