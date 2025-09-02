// fazer a mesma coisa com as avaliações ruins/pessimas ::)))
// revisar as contas, acredito que o melhor seja apagar e fazer tudo novamente, passo a passo, uma de cada vez


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
        int sumBadTerribleJanuary = 0;
        int sumBadTerribleFebruary = 0;
        int sumBadTerribleMarch = 0;
        int sumBadTerribleApril = 0;
        int sumBadTerribleMay = 0;
        int sumBadTerribleJune = 0;
        int sumBadTerribleJuly = 0;
        int sumBadTerribleAugust = 0;
        int sumExcellentGoodAugust = 0;
        int sumAugust = 0;
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
                    sumBadTerribleJanuary = badJanuary+terribleJanuary;
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

                    sumBadTerribleFebruary = badFebruary+terribleFebruary;
                    sumExcellentGoodFebruary = excellentFebruary+goodFebruary;
                    sumFebruary = excellentFebruary + goodFebruary + neutralFebruary + badFebruary+ terribleFebruary;
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

                    sumBadTerribleMarch = badMarch+terribleMarch;
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

                    sumBadTerribleApril = badApril+terribleApril;
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

                    sumBadTerribleMay = badMay+terribleMay;
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

                    sumBadTerribleJune= badJune+terribleJune;
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

                    sumBadTerribleJuly= badJuly+terribleJuly;
                    sumExcellentGoodJuly = excellentJuly + goodJuly;
                    sumJuly = excellentJuly + goodJuly + neutralJuly + badJuly + terribleJuly;
                    System.out.println("The total of number surveys answered in this month was: " + sumJuly);
                    break;
                case 8:
                    System.out.println("===AUGUST===");
                    System.out.println("Type number of excellent reviews: ");
                    int excellentAugust = sc.nextInt();
                    System.out.println("Type number of goods reviews: ");
                    int goodAugust = sc.nextInt();
                    System.out.println("Type number of neutrals reviews: ");
                    int neutralAugust = sc.nextInt();
                    System.out.println("Type number of bads reviews: ");
                    int badAugust = sc.nextInt();
                    System.out.println("Type number of terrible reviews: ");
                    int terribleAugust = sc.nextInt();

                    sumBadTerribleAugust= badAugust+terribleAugust;
                    sumExcellentGoodAugust = excellentAugust + goodAugust;
                    sumAugust = excellentAugust + goodAugust + neutralAugust + badAugust + terribleAugust;
                    System.out.println("The total of number surveys answered in this month was: " + sumAugust);
                    break;
                case 9:
                    System.out.println("==== The indicators ====");
                    int numTotal = (sumJanuary+sumFebruary+sumMarch+sumApril+sumMay+sumJune+sumJuly+sumAugust);
                    double totalAverageYear = numTotal/8;
                    double totalAnnualVariation = ((sumAugust- totalAverageYear)/ totalAverageYear) * 100;
                    System.out.println("|-------------------------------------------------------|");
                    System.out.println("|Annual media variation was: "+totalAnnualVariation+"   |");
                    System.out.println("|-------------------------------------------------------|");

                    int sumTotalExcellentGood = sumExcellentGoodJanuary+sumExcellentGoodFebruary+sumExcellentGoodMarch+sumExcellentGoodApril+sumExcellentGoodMay+sumExcellentGoodJune+sumExcellentGoodJuly+sumExcellentGoodAugust;
                    double totalAverageExcellentGoodYear = sumTotalExcellentGood /8;
                    double variationExcellentGoodYear = ((sumExcellentGoodAugust - totalAverageExcellentGoodYear)/ totalAverageExcellentGoodYear) * 100;
                    System.out.println("|----------------------------------------------------------------------|");
                    System.out.println("The variation excellent and good was: "+ variationExcellentGoodYear +"%");
                    System.out.println("|----------------------------------------------------------------------|");

                    int sumTotalBadTerribleYear = sumBadTerribleJanuary+sumBadTerribleFebruary+sumBadTerribleMarch+sumBadTerribleApril+sumBadTerribleMay+sumBadTerribleJune+sumBadTerribleJuly+sumBadTerribleAugust;
                    double mediaRuinsPessimas = sumTotalBadTerribleYear/8;
                    double variacaoRuinsPessimoAno = ((sumBadTerribleAugust-mediaRuinsPessimas)/mediaRuinsPessimas) * 100;
                    System.out.println("A variação total de pesquisas ruins e péssimas foi: "+variacaoRuinsPessimoAno);
                    break;
                default:
                    System.out.println("Invalid option! Try again");
                    break;
                case 10:
                    break;
            }
            if (month == 11){
                b = true;
                System.out.println("Program closed!");
            }


        } while (!b);
    }

}



