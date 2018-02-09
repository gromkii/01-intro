package main.java.com.dax;

class App {

    public static void main(String[] args) {

        System.out.println(sumOfAllPositiveInts(args));
    }

    static String nameEmailFormat(String name, String email) {
        if (name == null && email == null) {
            return "Please specify a name and email.";
        } else if (name != null&& email == null) {
            return String.format("Please specify a name for %s", name);
        }

        return String.format("%s <%s>", name, email);
    }

    static int sumOfAllPositiveInts(String[] numbers) {
        int argLength = numbers.length;
        int total     = 0;

        if (argLength == 0) {
            return total;
        }

        for (int i = 0; i < argLength; i++) {
            int num = Integer.parseInt(numbers[i]);

            if (num > 0) {
                total += num;
            }
        }

        return total;


    }
}
