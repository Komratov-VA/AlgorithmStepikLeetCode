package informatic.lesson1;

import java.util.Scanner;
//Входные данные
//На первой строке входного файла находятся два целых числа a и b ( - 10 9 ≤ a , b ≤ 10 9 ).
//
//Выходные данные
//Вашей программе требуется вывести единственное число — сумму заданных чисел a + b .
//
//Примеры
//входные данные
//2 3
//выходные данные
//5
//входные данные
//17 -18
//выходные данные
//-1
public class SumTwoNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] mass = scanner.nextLine().split(" ");
        System.out.print(Integer.valueOf(mass[0])+ Integer.valueOf(mass[1]));
    }
}
