public class Main {
    public static void main(String[] args) {
        int[] marks = {80, 90, 70, 85, 75};
        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        double avg = (double) sum / marks.length;

        System.out.println("Average = " + avg);
    }
}
