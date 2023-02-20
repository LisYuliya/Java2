import java.io.FileWriter;
import java.io.IOException;

public class task {

    public static void main(String[] args) {

        String str = "А роза упала на лапу Азора";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome); // Выведет true



        String fileName = "file.txt";
        String word = "TEST";

        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < 100; i++) {
                writer.write(word);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isPalindrome(String str) {
        // Удаляем из строки все пробелы и приводим к нижнему регистру
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Проверяем, является ли строка палиндромом
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
