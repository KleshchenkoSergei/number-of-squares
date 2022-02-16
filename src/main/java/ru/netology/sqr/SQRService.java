package ru.netology.sqr;

public class SQRService {
    public static void main(String[] args) {
    }

    public int calculate(int minSquareSide, int maxSquareSide) {

        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            if ((i * i >= minSquareSide) & (i * i <= maxSquareSide)) {
                counter++;
            }

        }
        return counter;
    }


}
