
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int excellent = 0;
        int good = 0;
        int neutral = 0;
        int bad = 0;
        int terrible = 0;
        int sumJanuary = 0;
        int sumFebruary = 0;
        int sumMarch = 0;
        int sumApril = 0;
        int sumMay = 0;
        int sumJune = 0;
        int sumJuly = 0;
        int contador = 0;
        int nextSesion;
        boolean b = false;

        do {
            contador++;
            System.out.println("=== Enter the month ====");
            System.out.println("=== 1 - January ====");
            System.out.println("=== 2 - February ====");
            System.out.println("=== 3 - March ====");
            System.out.println("=== 4- April ====");
            System.out.println("=== 5 - May ====");
            System.out.println("=== 6 - June ====");
            System.out.println("=== 7 - July ====");
            System.out.println("=== 8 - Next session ====");
            System.out.println("=== 9 - Close program ====");

            System.out.println("If you want to next session for calculate yours indicators type (Next) ");

            int month = sc.nextInt();
            switch (month) {
                case 1:
                    System.out.println("===JANUARY===");
                    System.out.println("Type number of excellent reviews: ");
                    int excellentJanuary = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int goodJanuary = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutralJanuary = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int badJanuary = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    terrible = sc.nextInt();
                    sc.nextLine();
                    sumJanuary = excellentJanuary + goodJanuary + neutralJanuary + bad + terrible;
                    System.out.println("The total of number surveys answered this month was: " + sumJanuary);
                    System.out.println("If you want to next session for calculate yours indicators type 1 ");
                    continue;


                case 2:
                    System.out.println("===FEBRUARY===");
                    System.out.println("Type number of excellent reviews: ");
                    excellent = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    good = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    neutral = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    bad = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    terrible = sc.nextInt();
                    sc.nextLine();

                    sumFebruary = excellent + good + neutral + bad + terrible;
                    System.out.println("The total of number surveys answered this month was: " + sumFebruary);
                    break;
                case 3:
                    System.out.println("===MARCH===");
                    System.out.println("Type number of excellent reviews: ");
                    excellent = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    good = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    neutral = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    bad = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    terrible = sc.nextInt();


                    sumMarch = excellent + good + neutral + bad + terrible;
                    System.out.println("The total of number surveys answered this month was: " + sumMarch);
                    break;
                case 4:
                    System.out.println("===APRIL===");
                    System.out.println("Type number of excellent reviews: ");
                    excellent = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    good = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    neutral = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    bad = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    terrible = sc.nextInt();


                    sumApril = excellent + good + neutral + bad + terrible;
                    System.out.println("The total of number surveys answered this month was: " + sumApril);
                    break;
                case 5:
                    System.out.println("===MAY===");
                    System.out.println("Type number of excellent reviews: ");
                    excellent = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    good = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    neutral = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    bad = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    terrible = sc.nextInt();

                    sumMay = excellent + good + neutral + bad + terrible;
                    System.out.println("The total of number surveys answered this month was: " + sumMay);
                    break;
                case 6:
                    System.out.println("===JULY===");
                    System.out.println("Type number of excellent reviews: ");
                    excellent = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    good = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    neutral = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    bad = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    terrible = sc.nextInt();

                    sumJune = excellent + good + neutral + bad + terrible;
                    System.out.println("The total of number surveys answered this month was: " + sumJune);
                    break;
                case 7:
                    System.out.println("===JULY===");
                    System.out.println("Type number of excellent reviews: ");
                    excellent = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    good = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    neutral = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    bad = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    terrible = sc.nextInt();

                    sumJuly = excellent + good + neutral + bad + terrible;
                    System.out.println("The total of number surveys answered in this month was: " + sumJuly);
                    break;
                case 8:
                    System.out.println("=== The indicators ===");
                    double totalYear = sumJanuary+sumFebruary+sumMarch+sumApril+sumMay+sumJune;
                    System.out.println("The number of total year: "+totalYear);
                    double mediaAnnual = totalYear/6;
                    double percentageChange = ((sumJuly - mediaAnnual) / mediaAnnual) * 100;
                    System.out.println("Monthly variation was: "+percentageChange+"%");
                    int mediaTotalBoasRuins;

                    break;
                default:
                    System.out.println("Invalid option! Try again");
                    break;
                case 9:
                    break;
            }
            if (month == 9){
                b = true;
                System.out.println("Program closed!");
            }


        } while (!b);
    }

}



