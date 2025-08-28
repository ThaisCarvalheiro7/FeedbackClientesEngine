// fazer a mesma coisa com as avaliações ruins/pessimas ::)))


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
        int sumExcellentGoodJanuary =0;
        int sumExcellentGoodFebruary = 0;
        int sumExcellentGoodMarch = 0;
        int sumExcellentGoodApril = 0;
        int sumExcellentGoodMay = 0;
        int sumExcellentGoodJune = 0;
        int sumExcellentGoodJuly = 0;
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
                    int terribleJanuary = sc.nextInt();
                    sc.nextLine();
                    sumExcellentGoodJanuary = excellentJanuary+goodJanuary;
                    int sumBadTerribleJanuary = badJanuary+terribleJanuary;
                    sumJanuary = excellentJanuary + goodJanuary + neutralJanuary + bad + terrible;
                    System.out.println("The total of number surveys answered this month was: " + sumJanuary);
                    System.out.println("If you want to next session for calculate yours indicators type 1 ");
                    continue;


                case 2:
                    System.out.println("===FEBRUARY===");
                    System.out.println("Type number of excellent reviews: ");
                    int excellentFebruary = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int goodFebruary = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutralFebruary = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int badFebruary = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int terribleFebruary = sc.nextInt();
                    sc.nextLine();

                    int sumBadTerribleFebruary = badFebruary+terribleFebruary;
                    sumExcellentGoodFebruary = excellentFebruary+goodFebruary;
                    sumFebruary = excellent + good + neutral + bad + terrible;
                    System.out.println("The total of number surveys answered this month was: " + sumFebruary);
                    break;
                case 3:
                    System.out.println("===MARCH===");
                    System.out.println("Type number of excellent reviews: ");
                    int excellentMarch = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int goodMarch = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutralMarch = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int badMarch = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int terribleMarch = sc.nextInt();

                    int sumBadTerribleMarch = badMarch+terribleMarch;
                    sumExcellentGoodMarch = excellentMarch+goodMarch;
                    sumMarch = excellentMarch + goodMarch + neutralMarch + badMarch + terribleMarch;
                    System.out.println("The total of number surveys answered this month was: " + sumMarch);
                    break;
                case 4:
                    System.out.println("===APRIL===");
                    System.out.println("Type number of excellent reviews: ");
                    int excellentApril = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int goodApril = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutralApril = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int badApril= sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int terribleApril = sc.nextInt();

                    int sumBadTerribleApril = badApril+terribleApril;
                    sumExcellentGoodApril = excellentApril+goodApril;
                    sumApril = excellentApril + goodApril + neutralApril + badApril + terribleApril;
                    System.out.println("The total of number surveys answered this month was: " + sumApril);
                    break;
                case 5:
                    System.out.println("===MAY===");
                    System.out.println("Type number of excellent reviews: ");
                    int excellentMay = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int goodMay = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutralMay = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int badMay = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int terribleMay = sc.nextInt();

                    int sumBadTerribleMay = badMay+terribleMay;
                    sumExcellentGoodMay = excellentMay+goodMay;
                    sumMay = excellentMay + goodMay + neutralMay + badMay + terribleMay;
                    System.out.println("The total of number surveys answered this month was: " + sumMay);
                    break;
                case 6:
                    System.out.println("===JUNE===");
                    System.out.println("Type number of excellent reviews: ");
                    int excellentJune = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int goodJune = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                   int neutralJune = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int badJune = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int terribleJune = sc.nextInt();

                    int sumBadTerrobleJune= badJune+terribleJune;
                    sumExcellentGoodJune = excellentJune+goodJune;
                    sumJune = excellentJune + goodJune + neutralJune + badJune + terribleJune;
                    System.out.println("The total of number surveys answered this month was: " + sumJune);
                    break;
                case 7:
                    System.out.println("===JULY===");
                    System.out.println("Type number of excellent reviews: ");
                    int excellentJuly = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int goodJuly = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutralJuly = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int badJuly = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int terribleJuly = sc.nextInt();


                    sumExcellentGoodJuly = excellentJuly + goodJuly + neutralJuly + badJuly + terribleJuly;
                    sumJuly = excellentJuly + goodJuly + neutralJuly + badJuly + terribleJuly;
                    System.out.println("The total of number surveys answered in this month was: " + sumJuly);
                    break;
                case 8:
                    System.out.println("=== The indicators ===");
                    double totalYear = sumJanuary+sumFebruary+sumMarch+sumApril+sumMay+sumJune;
                    System.out.println("The number of total year: "+totalYear);
                    double mediaAnnual = totalYear/6;
                    double percentageChange = ((sumJuly - mediaAnnual) / mediaAnnual) * 100;
                    System.out.println("Monthly variation was: "+percentageChange+"%");
                    int somaTotalBoasOtimasAnual = sumExcellentGoodJanuary+sumExcellentGoodFebruary+sumExcellentGoodMarch+sumExcellentGoodApril+sumExcellentGoodMay+sumExcellentGoodJune+sumExcellentGoodJuly;
                    double mediaBoasOtimasAnual = somaTotalBoasOtimasAnual/7;
                    double variacaoAnualBoasOtimas = ((sumExcellentGoodJuly - mediaBoasOtimasAnual)/mediaBoasOtimasAnual)*100;
                    double variacaoMensalBoasOtimas = ((sumExcellentGoodJune + sumExcellentGoodJuly)/sumExcellentGoodJune)*100;
                    System.out.println("The annual variation good and excellent was:"+variacaoAnualBoasOtimas);
                    System.out.println("The monthly variation good and excllent was: "+variacaoMensalBoasOtimas);
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



