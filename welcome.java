public class Main {
  static String welcomeMessage(String name) {
    return "Welcome to Java, " + name;
  }

  public static void main(String[] args) {
    String name="Jagadeesh";
    String message=welcomeMessage(name);
    System.out.println(message);// Call welcomeMessage here 
  }
}
