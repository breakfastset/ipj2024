package lesson01;

public class StringExamples {

    public static void main(String[] args) {

        String advice = "Eat all foods in moderation";
        String reminder = new String("Please submit on time");

        System.out.println(advice);
        System.out.println(reminder);

        int charCount = advice.length();
        char firstChar = advice.charAt(0);
        char lastChar = advice.charAt(charCount-1);

        System.out.printf("Num of chars in string: %d\n", charCount);
        System.out.printf("First char: %c\n", firstChar);
        System.out.printf("Last char: %c\n", lastChar);

        String words = "Hi there";
        words = words + ", how are you?";

        System.out.println(words);

        System.out.printf("Words contain you? %b\n", words.contains("you"));
        System.out.printf("Words contain You? %b\n", words.contains("You"));

        System.out.println(words.toUpperCase());  // HI THERE, HOW ARE YOU?
        System.out.println(words.toLowerCase());  // hi there, how are you?
        System.out.println(words);                // Hi there, how are you?

    }
}
