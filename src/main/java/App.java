public class App {

    public static void main(String[] args) {
        String message = resolveGreeting(args);
        greet(message);
    }

    private static void greet(String message) {
        System.out.println(message);
    }

    private static String resolveGreeting(String[] args) {
        if (args != null && args.length > 0) {
            return args[0];
        }
        return "Hello GitHub!";
    }

}
