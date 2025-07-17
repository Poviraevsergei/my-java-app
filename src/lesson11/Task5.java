package lesson11;

public class Task5 {
    public static void main(String[] args) {
        //Метод compress(String input) реализует простое сжатие строки.
        // Пример: "aaabbc" → "a3b2c"
        // Условие: Если сжатая строка не короче исходной — вернуть исходную.*/
        StringBuilder resultLine = new StringBuilder();
        String inputLine = "aaabbxxy";
        int count = 1;

        for (int i = 1; i < inputLine.length(); i++) {
            if (inputLine.charAt(i) == inputLine.charAt(i - 1)) {
                count++;
            } else {
                resultLine.append(inputLine.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        resultLine.append(inputLine.charAt(inputLine.length() - 1)).append(count);

        System.out.println(resultLine);
    }
}
