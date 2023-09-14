import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mennager mennager = new Mennager();
        boolean quit = false;
        while (quit = true) {
            System.out.println("Выбор действия:\n1.Добавление нового авто.\n2.Просмотр ассортимента\n");
            switch (scan.nextInt()) {
                case (1):
                    mennager.dobavlenie();
                    break;
                case (2):
                    mennager.prosmotr();
                    break;
            }
        }

    }
}