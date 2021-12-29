package ru.skypro;

public class Main {

    public static void main ( String[] args ) {
        //Задание 1
        int i = 1;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.print("\n");
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.print("\n");

        //Задание 2
        int firstFriday = 7;
        int nextFriday = firstFriday + 7;
        for (int currentDay = 1; currentDay < 32; currentDay++) {
            if (currentDay == firstFriday) {
                System.out.println("Сегодня пятница, " + currentDay + "-е число. Необходимо подготовить отчет");
            }
            if (currentDay == nextFriday) {
                System.out.println("Сегодня пятница, " + currentDay + "-е число. Необходимо подготовить отчет");
                nextFriday = currentDay + 7;
            }
        }
        System.out.print("\n");
        //Задание 3
        int currentYear = 316;
        int startYear = currentYear - 200;
        int afterYear = currentYear + 100;
        System.out.println("За последние 200 лет комета пролетала в годах:");
        for (int cometYear = 0; cometYear <= afterYear; cometYear += 79) {
            boolean previousYears = (cometYear >= startYear && cometYear <= currentYear);
            boolean nextYears = (cometYear > currentYear && cometYear < afterYear);
            if (previousYears) {
                System.out.println(cometYear);
            }
            if (nextYears) {
                System.out.println("В следующий раз увидим комету в году:");
                System.out.println(cometYear);
            }
        }


    }
}
