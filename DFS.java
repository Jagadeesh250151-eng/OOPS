
class Main {
    static void traverse(int[] a, int i, int type) {
        if (i >= a.length) return;
        if (type == 0) System.out.print(a[i] + " ");
        traverse(a, 2*i+1, type);
        if (type == 1) System.out.print(a[i] + " ");
        traverse(a, 2*i+2, type);
        if (type == 2) System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        int[] a = {10, 5, 20};
        String[] names = {"Preorder", "Inorder", "Postorder"};
        for (int i = 0; i < 3; i++) {
            System.out.print(names[i] + ": ");
            traverse(a, 0, i);
            System.out.println();
        }
    }
}
