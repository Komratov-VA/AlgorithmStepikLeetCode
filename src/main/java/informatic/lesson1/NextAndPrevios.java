package informatic.lesson1;

import java.util.Scanner;
//Напишите программу, которая считывает целое число и выводит текст, аналогичный приведенному в примере. Пробелы, знаки препинания, заглавные и строчные буквы важны!
//
//<Примечание. До 01 марта 2019 г. задачу нельзя сдать на языке Паскаль.>
//Входные данные
//Вводится целое число, по модулю не превосходящее 10000.
//
//Выходные данные
//Выведите сначала фразу "The next number for the number ", затем введенное число, затем слово " is ", окруженное пробелами, затем формулу для следующего за введенным числа, наконец, знак точки без пробела. Аналогично в следующей строке для предыдущего числа. При необходимости используйте параметр вывода sep в языке Python.
//
//Примеры
//входные данные
//179
//выходные данные
//The next number for the number 179 is 180.
//The previous number for the number 179 is 178.
public class NextAndPrevios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("The next number for the number "+number +" is "+(number+1)+".");
        System.out.println("The previous number for the number "+number +" is "+(number-1)+".");
    }

}