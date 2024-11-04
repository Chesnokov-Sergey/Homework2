public class Main {
    public static void main(String[] args) {
        // Переменне урок 2
        // Задание 1
        System.out.println("Задание 1");
        byte eggTray1 = 100;
        short eggTray2 = 10_000;
        int eggTray3 = 100_000;
        long eggTray4 = 10_000_000_000L;
        float eggTray5 = 10.001F;
        double eggTray6 = 10.000_000_000_001;

        System.out.println("Лотков яиц " + eggTray1 + " шт.");
        System.out.println("Лотков яиц " + eggTray2 + " шт.");
        System.out.println("Лотков яиц " + eggTray3 + " шт.");
        System.out.println("Лотков яиц " + eggTray4 + " шт.");
        System.out.println("Лотков яиц " + eggTray5 + " шт.");
        System.out.println("Лотков яиц " + eggTray6 + " шт.");

        // Задание 2
        System.out.println("Задание 2");
        float pastaPackage1 = 27.12F;
        long pastaPackage2 = 987_678_965_549L;
        double pastaPackage3 = 2.786;
        short pastaPackage4 = 569;
        short pastaPackage5 = -159;
        short pastaPackage6 = 27_897;
        byte pastaPackage7 = 67;

        // Задание 3
        System.out.println("Задание 3");
        byte teacherLyudmila = 23;
        byte teacherAnna = 27;
        byte teacherEkaterina = 30;
        short amountPaper = 480;

        int sheetPaper = amountPaper / (teacherLyudmila + teacherAnna + teacherEkaterina);
        System.out.println("На каждого ученика рассчитано " + sheetPaper + " листов бумаги");

        // Задание 4
        System.out.println("Задание 4");
        byte machinePerformancetwominutes = 16;
        byte oneMinutes = 1;
        byte twentyMinutes = 20;
        byte oneDay = 1;
        byte threeDay = 3;
        byte oneMonth = 1;

        int machinePerformanceoneminutes = machinePerformancetwominutes / 2;
        int oneDay1 = oneMinutes * 1_440;
        int threeDay1 = oneDay1 * 3;
        int oneMonth1 = oneDay1 * 30;

        int machinePerformance1 = machinePerformanceoneminutes * twentyMinutes;
        int machinePerformance2 = machinePerformanceoneminutes * oneDay1;
        int machinePerformance3 = machinePerformanceoneminutes * threeDay1;
        int machinePerformance4 = machinePerformanceoneminutes * oneMonth1;

        System.out.println("За " + twentyMinutes + " минут" + " машина произвела " +  machinePerformance1 + " штук бутылок");
        System.out.println("За " + oneDay + " сутки" + " машина произвела " +  machinePerformance2 + " штук бутылок");
        System.out.println("За " + threeDay + " дня" + " машина произвела " +  machinePerformance3 + " штук бутылок");
        System.out.println("За " + oneMonth + " месяц" + " машина произвела " +  machinePerformance4 + " штук бутылок");

        // Задание 5
        System.out.println("Задание 5");
        byte amountPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;

        int classSize = amountPaint / (whitePaint + brownPaint);
        int quantityWhite = classSize * whitePaint;
        int quantityBrown = classSize * brownPaint;
        System.out.println("В школе, где " + classSize + " классов, нужно " + quantityWhite + " банок белой краски и " + quantityBrown + " банок коричневой краски");

        // Задание 6
        System.out.println("Задание 6");
        byte oneBananas = 80;
        int numberBananas = oneBananas * 5;
        byte oneMilk = 105;
        int amountMilk = oneMilk * 2;
        byte oneIcecream = 100;
        int amounticeCream = oneIcecream * 2;
        byte oneRawegg = 70;
        int numberEggs = oneRawegg * 4;
        int sportsBreakfast = numberBananas + amountMilk + amounticeCream + numberEggs;
        float numberKilograms = 1/1000F;
        float sportsBreakfastkg = sportsBreakfast * numberKilograms;

        System.out.println("Вес завтрака спортсмена составляет " + sportsBreakfast + " граммов и " + sportsBreakfastkg + " килограммов");

        // Задание 7
        System.out.println("Задание 7");
        byte needReset = 7;
        short weightReduction1 = 250;
        short weightReduction2 = 500;
        float weightReductionkg1 = weightReduction1 /1000F;
        float weightReductionkg2 = weightReduction2 /1000F;
        float numberDays1 = needReset / weightReductionkg1;
        float numberDays2 = needReset / weightReductionkg2;
        float averageDays = (numberDays1 + numberDays2) / 2F;

        System.out.println(weightReductionkg1 + " килограмм");
        System.out.println(weightReductionkg2 + " килограмм");
        System.out.println(numberDays1 + " дней спортсмен будет худеть по " + weightReduction1 + " грамм");
        System.out.println(numberDays2 + " дней спортсмен будет худеть по " + weightReduction2 + " грамм");
        System.out.println("В среднем понадобиться " + averageDays + " день, спортсмен будет худеть чтобы добиться результата похудения");

        // Задание 8
        System.out.println("Задание 8");
        int salaryMasha = 67_760;
        int salaryDenis = 83_690;
        int salaryChristina = 76_230;
        int annualIncomemasha = salaryMasha * 12;
        int annualIncomedenis = salaryDenis * 12;
        int naannualIncomechristi = salaryChristina * 12;
        float coefficientIncrease = 0.10F;
        float newsalaryMasha = salaryMasha + (salaryMasha * coefficientIncrease);
        float newsalaryDenis = salaryDenis + (salaryDenis * coefficientIncrease);
        float newsalaryChristina = salaryChristina + (salaryChristina * coefficientIncrease);
        float newannualIncomemasha = newsalaryMasha * 12;
        float newannualIncomedenis = newsalaryDenis * 12;
        float newannualIncomechristina = newsalaryChristina * 12;
        float incomeComparisonmasha = newannualIncomemasha - annualIncomemasha;
        float incomeComparisondenis = newannualIncomedenis - annualIncomedenis;
        float incomeComparisonchristina = newannualIncomechristina - naannualIncomechristi;
        System.out.println("Маша теперь получает " +  newsalaryMasha + " рублей. Годовой доход вырос на " + incomeComparisonmasha + " рублей");
        System.out.println("Денис теперь получает " +  newsalaryDenis + " рублей. Годовой доход вырос на " + incomeComparisondenis + " рублей");
        System.out.println("Кристина теперь получает " +  newsalaryChristina + " рублей. Годовой доход вырос на " + incomeComparisonchristina + " рублей");



    }
}