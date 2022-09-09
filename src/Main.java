public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //задание 1.1
        System.out.println("Задание 1.1");
        int accumulation2 = 29000;
        int total2 = 0;
        int i = 0;
        while (total2 < 245900) {
            total2 = total2 + (total2 / 100);
            total2 = total2 + accumulation2;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total2 + " рублей");
        }
        //задание 1.2
        System.out.println("Задание 1.2");
        int c = 0;
        while (c < 10) {
            c = c + 1;
            System.out.print(c + " ");
        }
        System.out.println(" ");
        int d = 11;
        while (d > 1) {
            d = d - 1;
            System.out.print(d + " ");
        }
        //задание 1.3
        System.out.println("Задание 1.3");
        int y = 12000000;
        int year = 0;
        while (year < 10) {
            y = ((y / 1000) * (17 - 8)) + y;
            year++;
            System.out.println("Год " + year + " численность населения составляет " + y + " человек");
        }
        //задание 2.1,2.2
        System.out.println("Задание 2.1 и 2.2");
        int deposit = 15000;
        int month = 0;
        while (deposit < 12000000) {
            deposit = deposit + (deposit * 7 / 100);
            month++;
            if (month % 6 == 0)
                System.out.println("Месяц " + month + " сумма накоплений равна " + deposit + " рублей");
        }
        //задание 2.3
        System.out.println("Задание 2.3");
        int deposit2 = 15000;
        int month2 = 0;
        while (month2 < 108) {
            deposit2 = deposit2 + (deposit2 * 7 / 100);
            month2++;
            if (month2 % 6 == 0)
                System.out.println("Месяц " + month2 + " сумма накоплений равна " + deposit2 + " рублей");
        }
        //задание 2.4
        System.out.println("Задание 2.4");
        int friday = 1;
        while (friday < 31) {
            friday = friday + 7;
            System.out.println("сегодня пятница, " + friday + "-е число. Ждем отчет!");

        }
        //задание 3.1
        System.out.println("Задание 3.1");
        int yearCometa = 0;
        int year200 = 1822;
        int realYear = 2022;
        while (yearCometa < 2122) {
            yearCometa = yearCometa + 79;
            if (yearCometa > year200)
                System.out.println(yearCometa);
        }
        //задание 3.2
        System.out.println("Задание 3.2");
       int a=2;
       int result=0;
        for (i=1;i<10;i++){
           result =i*a;
            System.out.println(a+"*"+i+"="+result);
        }
    }
    }

