import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mennager mennager = new Mennager();
        while (true) {
            System.out.println("Выбор действия:\n1.Добавление нового авто.\n2.Просмотр ассортимента\n");
            switch (scan.nextInt()) {
                case (1):
                    try {
                        mennager.dobavlenie();
                    } catch (Exception e) {
                        System.out.println("Error!");
                    }

                    break;
                case (2):
                    try {
                        mennager.prosmotr();
                    } catch (Exception e) {
                        System.out.println("Error!");
                    }

                    break;
            }



        }

    }
}