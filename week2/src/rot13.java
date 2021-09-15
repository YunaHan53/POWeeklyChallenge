public class rot13 {
    public static String rotate13Letters(String input) {
        char[] values = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            // Rotate lowercase letters
            if (letter >= 'a' && letter <= 'z') {

                if (letter > 'm') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            // Rotate uppercase letters
            } else if (letter > 'A' && letter < 'Z') {

                if (letter > 'Z') {
                    letter -= 13;
                } else {
                    letter += 13;
                }
            }
            values[i] = letter;
        }
        // Convert array to a new String
        return new String(values);
    }

    public static void main(String[] args) {
        String message = "How many solar systems are there in our milky way?";
        String rotateMessage = rotate13Letters(message);

        System.out.println(message);
        System.out.println(rotateMessage);
    }
}
