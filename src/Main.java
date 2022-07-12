public class Main {
    public static void main(String[] args) {

// first task

        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;

        double e = 5.1;
        float f = 2.5f;

        char g = 25;
        boolean h = true;
//second task
        System.out.println("2nd task:");
        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        System.out.println("Общий вес бойцов = " + (boxerWeight1+boxerWeight2) + "кг.");
        System.out.println("Разница в весе = " + Math.abs(boxerWeight1-boxerWeight2) + "кг.");
//third task
        System.out.println("3rd task:");
        int bananas = 5;
        int bananaWeight = bananas*80;
        int milk = 200;
        int milkWeight = milk/100*105;
        int iceCream = 2;
        int iceCreamWeight = 100*iceCream;
        int eggs = 4;
        int eggWeight = eggs*70;
        int overalWeight = (bananaWeight+milkWeight+iceCreamWeight+eggWeight)/1000;
        System.out.println("Общий вес завтрака = " + overalWeight + "кг.");
        if (overalWeight >= 0.5)
            System.out.println("Нифига он пожрать...");
//4th task
        System.out.println("4th Task:");
        int goal = 7;
        int min = 250; //minimum loss gram per day
        int max = 500; //maximum loss gram per day
        System.out.println("Минимальное количество дней для похудения = " +(goal*1000/max));
        System.out.println("Максимальное количество дней для похудения = " +(goal*1000/min));
        System.out.println("Среднее количество дней для похудения = " +((goal*1000/max+goal*1000/min)/2));
//5th task
        System.out.println("5th Task:");
        int salaryMaria = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        int salaryMariaRaise = salaryMaria*110/100;
        int salaryDenisRaise = salaryDenis*110/100;
        int salaryChristinaRaise = salaryChristina*110/100;
        System.out.println("Мария теперь получает "+salaryMariaRaise +" деревянных. Годовой доход у этой дивчины вырос на " + Math.abs(salaryMaria*12-salaryMariaRaise*12) + " деревянных в год!!!");
        System.out.println("Дендимон теперь получает "+salaryDenisRaise +" в рублях. Годовой доход этого господина вырос на " + Math.abs(salaryDenis*12-salaryDenisRaise*12) + " рубчиков в год!!!");
        System.out.println("А вот Кристина теперь получает "+salaryChristinaRaise +" $$$. Годовой доход у этой вымышленной дамы вырос на " + Math.abs(salaryChristina*12-salaryChristinaRaise*12) + " $$$ в год!!!");

    }

    }
