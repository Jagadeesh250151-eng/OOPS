public class Main {
    public static void main(String[] args) {
        String password = "Hello123";
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }

        if (password.length() >= 8 && hasDigit)
            System.out.println("Password Meets Basic Rules");
        else
            System.out.println("Password Does Not Meet Basic Rules");
    }
}
