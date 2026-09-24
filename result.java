class Result {
    int mark;

    Result(int m) {
        mark = m;
    }

    void checkResult() {
        if (mark >= 50)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }
}

public class Main {
    public static void main(String[] args) {
        Result r = new Result(75);
        r.checkResult();
    }
}
