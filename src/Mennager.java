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
    ArrayList<Mennager> sortiment = new ArrayList<>();
     public void dobavlenie(){
         try{
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
         }catch (Exception e)
         {
             System.out.println("Ошибка!");
         }


    }

     public void prosmotr(){
         try {
             for (int i =1; i<=sortiment.size(); i++){
                 System.out.println("Номер: "+i+""+"\nМарка: "+sortiment.get(i-1).marka + "\nМодель: " +sortiment.get(i-1).model+
                         "\nЦвет: "+sortiment.get(i-1).color+ "\nГод: "+sortiment.get(i-1).age+
                         "\nОбъем дрыгателя: "+sortiment.get(i-1).volume+"\n--------");
             }
         }catch (Exception e){System.out.println("Ошибка!");}
    }
}
