package informatic.lesson1;

import java.util.Scanner;
//Напишите программу, которая определяет, сколько раз встречается заданное число x в данном массиве.
//
//Входные данные
//В первой строке задается одно натуральное число N, не превосходящее 1000 – размер массива.
//
//Во второй строке вводятся N чисел – элементы массива (целые числа, не превосходящие по модулю 1000).
//
//В третьей строке содержится одно целое число x , не превосходящее по модулю 1000.
//
//Выходные данные
//Вывести одно число – сколько раз встречается x в данном массиве.
//
//Примеры
//входные данные
//5
//1 2 3 4 5
//3
//выходные данные
//1
public class HowMuch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int u = Integer.valueOf(scanner.nextLine());
        String[] elem = scanner.nextLine().split(" ");
        int number = scanner.nextInt();
        int koll=0;
        for (String str: elem
        ) {
            if(str.equals(String.valueOf(number))){
                koll++;
            }
        }
        System.out.println(koll);

    }

}
