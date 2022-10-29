public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        int monthNumber = 1;
        int sum = 0;
        while (sum <= 2_459_000) {
            sum += 15_000;

            System.out.printf("Месяц %d , сумма накоплений равна %d рублей\n", monthNumber, sum);
            monthNumber++;
        }


        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j > 0; j--) {
            System.out.print(j + " ");
        }
        System.out.println();


        System.out.println("Задание 3");
        int population = 12_000_000;
        int birthRate = 17 * population / 1_000;
        int deathRate = 8 * population / 1_000;
        for (int j = 1; j <= 10; j++) {
            population += birthRate;
            population -= deathRate;
            System.out.printf("Год %d , численность %d \n", j, population);
        }


        System.out.println("Задание 4");

    }
}