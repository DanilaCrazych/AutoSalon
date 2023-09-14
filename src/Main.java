import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mennager mennager = new Mennager();

        while (true) {
            System.out.println("Выбор действия:\n1.Добавление нового авто.\n2.Просмотр ассортимента\n3.Выход.\n");
            switch (scan.nextInt()) {
                case (1):
                    mennager.dobavlenie();
                    break;
                case (2):
                    mennager.prosmotr();
                    break;
                case (3):

                    break;
            }
        }

    }
}