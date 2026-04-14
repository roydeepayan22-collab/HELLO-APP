public class GreetingWithSubstring {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            StringBuilder result = new StringBuilder();

            for (String name : args) {
                result.append("Hello ").append(name).append(", ");
            }

            // remove trailing ", "
            String output = result.substring(0, result.length() - 2);

            System.out.println(output);
        }
    }
}
