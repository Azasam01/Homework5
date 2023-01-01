public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int client = 1;
        if (client == 0) {
            System.out.println("Install the iOS version of the app by following the link");
        } else if (client == 1) {
            System.out.println("Install the Android version of the app by following the link");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int client = 0;
        int clientDeviceYear = 2015;
        if (client == 0 && clientDeviceYear <= 2015) {
            System.out.println("Install the updated version of the iOS app by following the link");
        } else if (client == 1 && clientDeviceYear <= 2015 ) {
            System.out.println("Install the updated version of the iOS app by following the link");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int year = 2021;

        if ((year % 100 == 0) && (year % 400==0) && (year % 4==0)){
            System.out.println( year + " is a leap year");
        } else {
            System.out.println( year + " isn't leap year");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int day = 1;
        if (deliveryDistance < 20 ){
            System.out.println("Delivery within " + deliveryDistance + " km takes " + day + " day");
        } else if (deliveryDistance >=20 && deliveryDistance < 60) {
            System.out.println("Delivery within " + deliveryDistance + " km takes " + (1+day) + " days");
        } else if (deliveryDistance >=60 && deliveryDistance < 100) {
            System.out.println("Delivery within " + deliveryDistance + " km takes " + (2+day) + " days");
        } else if (deliveryDistance >=100) {
            System.out.println("Delivery isn't available");

        }

    }


    public static void task5() {
        System.out.println("Задача 5");
        int monthNumber = 12;
        switch (monthNumber) {
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
                System.out.println("There is no such month");

        }   }
}
