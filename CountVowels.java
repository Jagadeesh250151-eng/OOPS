public class Main {
    public static void main(String[] args) {
        String text = "education";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if ("aeiou".indexOf(ch) != -1) {
                count++;
            }
        }

        System.out.println("Vowels = " + count);
    }
}
