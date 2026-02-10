public class Placeholder {
    public static void main(String[] args) {
        String data = "example";
        processData(data);
    }

    public static void processData(String input) {
        if (input == null || input.isEmpty()) {
            return;
        }
        System.out.println("Processing: " + input);
    }
}