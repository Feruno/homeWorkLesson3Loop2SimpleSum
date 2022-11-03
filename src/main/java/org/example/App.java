package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //То что обсуждалось в телеграмме я прочитал, возможно я не правильно понял задачу

        //Решал по формуле сумма n членов геометрической прогрессии
        //https://dl.bsu.by/mod/book/view.php?id=10178&chapterid=1277
        //https://www.yaklass.ru/p/algebra/9-klass/chislovye-posledovatelnosti-progressii-9139/geometricheskaia-progressiia-svoistva-geometricheskoi-progressii-9142/re-1cea80c1-2bde-4270-a473-6b6d81ad228d#:~:text=%D0%A7%D0%B8%D1%81%D0%BB%D0%BE%20%5C(q%5C)%20%D0%BD%D0%B0%D0%B7%D1%8B%D0%B2%D0%B0%D0%B5%D1%82%D1%81%D1%8F,%D0%B2%D0%BE%D0%B7%D0%BC%D0%BE%D0%B6%D0%BD%D0%BE%20%D0%BD%D0%B0%D0%B9%D1%82%D0%B8%20%D0%BB%D1%8E%D0%B1%D0%BE%D0%B9%20%D1%87%D0%BB%D0%B5%D0%BD%20%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B5%D1%81%D1%81%D0%B8%D0%B8.
        //Sn=b1(q^n-1)/q-1
        //b1=1
        //q=2
        //S_100
        int b1 = 1;
        int q = 2;
        double s = 0;
        double resultSum = 0;
        for (int i = 0; i <= 100; i++) {

            s = b1 * ( Math.pow(q, i) - 1 )/ q-1;

            resultSum = resultSum + s;

            System.out.println(s);

        }
        System.out.println("Сумма " + resultSum);
    }
}
