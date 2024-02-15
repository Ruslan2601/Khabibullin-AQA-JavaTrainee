import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        test1();
        test2();
        test3();
        test4();
    }

    public static void test1() throws IOException {
        System.out.println("Введите число:");
        try {
            int number = Integer.parseInt(reader.readLine());
            if (number > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Слишком маленькое число - " + number);
                test1();
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат, попробуйте еще раз.");
            test1();
        }
    }

    public static void test2() throws IOException {
        String correctName = "Вячеслав";
        System.out.println("Введите имя:");
        String name = reader.readLine();
        if (name.equals(correctName)) {
            System.out.println("Привет, " + name);
        } else if (name.contains(correctName)) {
            System.out.println("Имя должно быть без пробелов или других символов");
            test2();
        } else {
            System.out.println("Нет такого имени - " + name);
            test2();
        }
    }

    public static void test3() throws IOException {
        System.out.println("Введите несколько чисел через пробел:");
        try {
            int[] array = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            for (int j : array) {
                if (j % 3 == 0) {
                    System.out.println(j);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат, попробуйте еще раз.");
            test3();
        }
    }

    public static void test4() throws IOException {
        System.out.println("Дана скобочная последовательность: [((())()(())]]");
        System.out.println("Можно ли считать эту последовательность правильной?");
        String answer = reader.readLine();
        if (answer.equalsIgnoreCase("да")) {
            System.out.println("Присмотрись внимательней!");
            test4();
        } else if (answer.equalsIgnoreCase("нет")) {
            System.out.println("Что необходимо в ней изменить, чтоб она стала правильной?");
            System.out.println("Не хватает двух скобок ) и [");
        } else {
            System.out.println("Ответ должен быть 'ДА' или 'НЕТ', попробуй еще раз");
            test4();
        }
    }
}
