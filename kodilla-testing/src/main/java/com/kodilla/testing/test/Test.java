package com.kodilla.testing.test;

/*Napisz metodę, która sprawdzi czy podana liczba w argumencie jest liczbą pierwszą.
Liczba pierwsza to liczba całkowita, dodatnia, większa od 1, posiada dwa dzielniki: jeden i samą siebie:
Przykłady liczb pierwszych:
2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, itd*/

public class Test {
    public static void main(String[] args) {
        //System.out.println(isPrime(11));
        Test test = new Test();

        System.out.println(test.date(17868));
    }

    public static boolean isPrime(int x) {
        for(int i = 2; i < x; i++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
/*Napisz metodę, która przyjmuje liczbę całkowitą i zwraca "odwróconą" liczbę.
Dane wejściowe: 17868
Dane wyjściowe: 86871*/

    public int date(int x) {
        String y = String.valueOf(x);
        String a = "";
        for(int i=y.length()-1; i >= 0; i--) {
            char z = y.charAt(i);
            a+=z;
        }
        int b = Integer.parseInt(a);
        return b;
    }

    public int reverseNumber(int number){
        int reverse = 0;
        while(number != 0){
            reverse = (reverse*10)+(number%10);
            number = number/10;
        }
        return reverse;
    }
}
