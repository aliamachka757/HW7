public class Main {
    public static void main(String[] args) {
        ///Problem 2
        System.out.println("Problem2");


        {
            int number = 10;

            while (number > 0) {
                System.out.println(number);
                number--;
            }
            {
                for (int value = 0; value <= 10; value++) {
                    System.out.println(value);

                }


                ///Problem 3
                System.out.println("Problem3");


            }
            int savingGoal = 2_490_000;
            int monthlyDeposit = 15_000;
            int monthCount = 1;
            int saving = 0;

            while (saving < savingGoal) {
                saving += monthlyDeposit;
                monthCount++;

            }
            System.out.println(monthCount);

        }
        ///Problem 4
        System.out.println("Problem4");
        ////В стране Y население равно 12 миллионам человек.

        //За год рождаемость составляет 17 человек на 1000 человек, смертность -
        //8 человек. Рассчитайте, какая
        //численность населения будет через 10 лет, принимая во внимание, что показатели рождаемости и смертности постоянны.

        //В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "///


        int countryPopulation = 12_000_000;
        int death = 8;
        int birth = 17;

        int changesPopulation = birth - death;
        for (int year = 1; year <= 10; year++) {
            countryPopulation += countryPopulation * changesPopulation / 1000;


            System.out.println("Год " + year + "численность населения составляет" + countryPopulation + "");
        }

        //Problem 5
        System.out.println("problem 5");


        int paycheck = 15_000;
        double interestRate = 0.07;
        for (int month = 1; month <= 12; month++) {
            paycheck += paycheck * interestRate;
            System.out.println("On  " + month + "he will get" + paycheck + "");
        }
        //problem 5.1
        System.out.println("problem5.1");

        int moreMoney = 12_000_000;
        int howManyMoth = 1;
        {
            for (; paycheck < moreMoney; howManyMoth++) {
                paycheck += paycheck * interestRate;
                if (howManyMoth % 6 == 0) {
                    System.out.println("On  " + howManyMoth + "he will get" + paycheck + "");
                }


            }
            //problem6
            System.out.println("Problem 6 ");


            for (int month = 1; month <= 6; month++) {
                paycheck += paycheck * interestRate;
                System.out.println("On  " + month + "he will get" + paycheck + "");
            }


            //problem 7
            System.out.println("/problem 7");


            int firstFriday = 7;
            int day = 5;


            for (day = firstFriday; day >= 31; day = +7) ;
            {
                System.out.println(" today is friday" + day + "  you need to do your  report ");

            }
            ///Problem 8
            System.out.println("Problem8");


            {
                int N = 2;


                for (int i = 1; i <= 10; i++) {

                    System.out.println(N + " * " + i + " = "
                            + N * i);
                }
            }
        }



                }



                }

















