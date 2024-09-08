//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //task1
        System.out.println("Задача 1");
        //«Месяц …, сумма накоплений равна … рублей» .
        int wantToHave = 2_459_000;
        int sum = 0;
        int amonth = 15_000;
        double percent = 1D / 100;
        int month = 0;
        while (sum < wantToHave) {
            sum += amonth;
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
        }
        //task2
        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.println(number + " ");
        }
        System.out.println();
        for (; number >= 1; number--) {
            System.out.println(number + " ");
        }
        System.out.println("задача 3");
        int people = 12_000_000;
        int birth1000 = 17;
        int death1000 = 8;
        int yearNow = 2024;
        for (int year = yearNow; year < yearNow + 10; year++) {
            people += people * birth1000 / 1000 - people * death1000 / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + people);
        }
        //task 4
        System.out.println("Задача 4 ");
        percent = 7D / 100;
        wantToHave = 12_000_000;
        sum = amonth;
        month = 0;
        while (sum < wantToHave) {
            sum = (int) (sum * (1 + percent));
            month++;
            System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
        }
//task 5
        System.out.println("задача 5");
        sum = amonth;
        month = 0;
        while (sum < wantToHave) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
            }
        }
        //task 6
        System.out.println("задача 5");
        sum = amonth;
        month = 0;
        int months = 12 * 9;
        while (month < months) {
            sum = (int) (sum * (1 + percent));
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " , сумма накоплений равна " + sum + " рублей");
            }
        }
            //task7
            System.out.println("Задача 7");
            //Сегодня пятница, ...-е число. Необходимо подготовить отчет
int fridayFirst = 5;
            for (int day = fridayFirst; day <= 31; day += 6) {
                System.out.println("Сегодня пятница, " +day+ "-е число. Необходимо подготовить отчет");
            }
            //task 8
        System.out.println("задача 8");
        int time = 79;
            int startWatching = 0;
            int start = yearNow - 200;
            int end = yearNow + 100;
            for (int year = startWatching; year < end; year += time) {
                if ( year > start) {
                    System.out.println(year);
                }
            }
        }
    }

