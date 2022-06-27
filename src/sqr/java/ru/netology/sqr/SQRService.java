package ru.netology.sqr;

public class SQRService {

    public int calcSqrt(int minBorder, int maxBorder) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minBorder && i * i <= maxBorder) {
                x++;
            }
        }
        return x;
    }
}