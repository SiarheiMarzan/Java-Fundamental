import java.util.Scanner;

public class JFundamental {
    public static void main(String[] args) {
//        helloUser();
//        reversCommandLine();
//        printRandomNumber();
//        argsCommandLineCountSum();
        NameOfTheMonth();
    }


    //1.     Приветствовать любого пользователя при вводе его имени через командную строку.
    public static void helloUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    //2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
    public static void reversCommandLine() {
        Scanner enterData = new Scanner(System.in);
        System.out.println("Enter values: ");
        StringBuffer info = new StringBuffer(enterData.nextLine());
        info.reverse();
        System.out.println("Result: " + info.toString());
    }

    //3.Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
    public static void printRandomNumber() {
        int[] a = {3, 6, 1, 4, 9};
        for (int i : a) {
            System.out.println(i + " ");
            System.out.print(i + " ");
        }
    }

    // 4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
    public static void argsCommandLineCountSum() {
        Scanner enterData = new Scanner(System.in);
        for (int i = 0; true; i++) {
            int x = enterData.nextInt();
            int y = enterData.nextInt();

            System.out.println("Sum= " + (x + y));
            System.out.println("Mutli= " + (x * y));
        }
    }

    //5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.

    public static void NameOfTheMonth() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month number: ");
        int numberMonth = scanner.nextInt();
        switch (numberMonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("This is month doesn't exist!");
        }

    }
}
