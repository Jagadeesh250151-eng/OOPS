public class Main {
    public static void main(String[] args) {
        String str = "Java is very easy";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of Spaces: " + count);
    }
}
