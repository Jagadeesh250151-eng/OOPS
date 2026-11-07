public class Main {
    public static void main(String[] args) {
        String str = "Python is very interesting";
        String words[] = str.split(" ");
        String largest = "";

        for (String word : words) {
            if (word.length() > largest.length())
                largest = word;
        }

        System.out.println("Largest Word: " + largest);
    }
}
