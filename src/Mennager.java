import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.function.Consumer;

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
    @Override
    public String toString (){
         return "\nмарка :" +marka +
                 "\nМодель: " +model+
                 "\nЦвет: " +color+
                 "\nГод: " +age+
                 "\nОбъем: " +volume+ "\n---------";
    }

     public void prosmotr(){
        sortiment.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
    }
}
