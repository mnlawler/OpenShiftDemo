import static spark.Spark.*;

public class OpenShiftDemo {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}