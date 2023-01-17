public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int month =1;
        while(total < 2_459_000 ) {
            total = total + salary;
            System.out.println("Месяц" + month + " сумма накоплений равно" + total + "рублей");
            month++;
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print( a );
        }
        System.out.println();
        {
            for (int i = 10; i > 0; i = i - 1) {
                System.out.print(i);
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int total = 12_000_000;
        int years = 10;
        int koeff = 1_000;
        int birthrate = 17;
        int mortality = 8;
        int difference = birthrate - mortality;
        for (int year=1;year <=years;year ++) {
            total = total+total * difference /koeff;

            System.out.println("Год" + years + "числиность населения составляет" + total);

        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int wanted = 12_000_000;
        int total = 15_000;
        int month =1;
        double percent = 7 / 100D;
        while ( total < wanted ) {
            total = total + (int) (total * percent);

            System.out.println("Месяц" + month + "сумма накоплений равна " + total + "рублей");
            month++;
        }



    }

    public static void task5() {
        System.out.println("Задача 5");
        int wanted = 12_000_000;
        int total = 15_000;
        int month =1;
        double percent = 7 / 100D;
        while ( total < wanted ) {
            total = total + (int) (total * percent);
            if (month%6==0)
            System.out.println("Месяц" + month + "сумма накоплений равна " + total + "рублей");
            month++;
        }

    }

    public static void task6() {
        System.out.println("Задача 6");
        int months = 9 * 12;
        int total = 15_000;
        double percent = 7 / 100D;
        for (int month =1;month <= months;month ++) {
            total = total + (int) (total * percent);
            if (month%6==0)
                System.out.println("Месяц" + month + "сумма накоплений равна " + total + "рублей");

        }

    }

    public static void task7() {
        System.out.println("Задача 7");
      int firstFriday =6;
      for (int friday = firstFriday;friday <=31;friday+=7) {
          System.out.println( "Сегодня пятница" + friday + "-е число Необходимо подготовить отчет");
      }

    }
    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int start = currentYear - 200;
        int end = currentYear + 100;
        int period = 79;
        int firstTimeAppeared = 0;
        for (int year = firstTimeAppeared;year<=end; year+=period) {
            if (year >=start) {
                System.out.println(year);
            }
        }


    }

}
