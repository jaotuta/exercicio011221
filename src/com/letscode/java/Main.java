package com.letscode.java;

public class Main {

    public static void main(String[] args) {
//        Escreva um programa que, com base em uma temperatura em graus celsius, a converta e exiba em Kelvin (K),
//                Réaumur (Re), Rankine (Ra), Fahrenheit (F) seguindo as fórmulas:
//        F = (C * 1.8) + 32
//        K = C + 273.15
//        Re = C * 0.8
//        Ra = (C * 1.8) + 491
//
//        Considere a conversão de 18 ºC e a precisão de duas casas decimais.
        float celsius = 18;
        double tempF = (celsius * 1.8) + 32;
        double tempK = celsius + 273.15;
        double tempRe = celsius * 0.8;
        double tempRa = (celsius * 1.8) + 491;

        System.out.printf("%.2fºC em Fahrenheit é: %.2f %n", celsius, tempF);
        System.out.printf("%.2fºC em Kelvin é: %.2f %n", celsius, tempK);
        System.out.printf("%.2fºC em Réaumur é: %.2f %n", celsius, tempRe);
        System.out.printf("%.2fºC em Rankine é: %.2f %n", celsius, tempRa);
    }
}
