import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Mennager {
Scanner scan = new Scanner(System.in);
    String marka;
    String model;
    String color;
    int age;
    float volume;
       public Mennager (String marka, String model, String color, int age, float volume){
           this.marka = marka;
           this.model = model;
           this.age = age;
           this.color = color;
           this.volume = volume;
       }

    public Mennager() {}
    ArrayList sortiment = new ArrayList<>();
     public void dobavlenie(){
         System.out.println("Введите название марки: ");
         String markaV = scan.next();
        System.out.println("Введите название модели: ");
        String modelV = scan.next();
        System.out.println("Введите цвет автомобиля: ");
        String colorV = scan.next();
        System.out.println("Введите год производства: ");
        int ageV = scan.nextInt();
        System.out.println("Введите объем двигателя: ");
        float volumeV = scan.nextFloat();
        Mennager car = new Mennager(markaV, modelV, colorV, ageV, volumeV);
        sortiment.add(car);
        System.out.println("Автомобиль добавлен! ");
    }

     public void prosmotr(){
        System.out.println();
    }
}
