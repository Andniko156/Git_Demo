//Задание 1.1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Привет, " + name + "!");

        in.close();
    }
}
//
/*import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества чисел
        System.out.print("Введите количество целых чисел (n): ");
        int n = scanner.nextInt();

        // Проверка на корректный ввод
        if (n <= 0) {
            System.out.println("Количество чисел должно быть положительным!");
            return;
        }

        // Создание массива для хранения чисел
        int[] numbers = new int[n];

        // Ввод чисел
        System.out.println("Введите " + n + " целых чисел:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Копируем массив для обеих сортировок
        int[] ascending = numbers.clone();
        int[] descending = numbers.clone();

        // Пузырьковая сортировка по возрастанию
        bubbleSortAscending(ascending);
        System.out.println("\nЧисла в порядке возрастания (пузырьковая сортировка):");
        printArray(ascending);

        // Пузырьковая сортировка по убыванию
        bubbleSortDescending(descending);
        System.out.println("\nЧисла в порядке убывания (пузырьковая сортировка):");
        printArray(descending);

        scanner.close();
    }

    // Пузырьковая сортировка по возрастанию
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Меняем местами элементы
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Пузырьковая сортировка по убыванию
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Меняем местами элементы
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Метод для вывода массива
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}*/