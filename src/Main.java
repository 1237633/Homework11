import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
      //1
        int year = 2022;
        checkIfLeap(year);

        //2
        defineAppVer(2022, 1);

        //3

        int deliveryDistance = 78;

        if(deliveryDistance<=100){
        System.out.println("Доставка займет " + calculateDeliverytTime(deliveryDistance) + " дней");
        } else{
            System.out.println("Доставка не осущетсвляется");
        }
    }

    //1
    public static void checkIfLeap (int year){
       if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
           System.out.println(year + " год високосный");
       } else{
        System.out.println(year + " год не високосный");
       }
        System.out.println(" ");
    }

    //2

    public static void defineAppVer(int releaseYear, int clientOS){

        int currentYear = LocalDate.now().getYear();

        if(clientOS == 0){
            if(releaseYear == currentYear){
                System.out.println("Установите версию приложения для iOS по ссылке");
                System.out.println(" ");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                System.out.println(" ");
            }

        } else if (releaseYear == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
            System.out.println(" ");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            System.out.println(" ");
        }
    }

    //3
    public static int calculateDeliverytTime(int deliveryDistance){

        int deliveryTime = 0;

        if (deliveryDistance <= 20){
            deliveryTime = deliveryTime + 1;
        } else if(deliveryDistance > 20 && deliveryDistance <= 60){
            deliveryTime = deliveryTime + 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            deliveryTime = deliveryTime + 3;
        } else if (deliveryDistance >100) {
            throw new RuntimeException("Доставка не осуществляется более, чем на 100км");
        }

        return deliveryTime;
    }
}