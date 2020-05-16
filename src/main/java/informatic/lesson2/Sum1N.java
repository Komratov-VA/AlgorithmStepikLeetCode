package informatic.lesson2;
import java.util.Scanner;
//Сумму всех целых чисел от 1 до 100 можно посчитать при помощи хитрого приема. Разобьем все числа по парам 1 и 100, 2 и 99, 3 и 98 и т.д. Сумма каждой пары 101. Пар всего 100 пополам (50). Поэтому сумма равна 2(1+100)100.
//
//Для нечетного количества слагаемых работает та же формула: например, 1+2+3=2(1+3)3=6.
//
//Входные данные
//Одно целое число N. Гарантируется, что ответ "помещается" в тип int64 (Паскаль) / long long (в Си) / long (в Java).
//
//Выходные данные
//Одно число – сумма всех целых чисел от 1 до N.
//
//Примеры
//входные данные
//100
//выходные данные
//5050
//входные данные
//3
//выходные данные
//6
public class Sum1N {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        long rez=0;
        if(number>0) {
            if (number % 2 == 0) {
                rez = (number / 2) * (number + 1);
            }
            else
                rez = number*((number+1)/2);
        }
        if(number == 0) rez =1;
        if(number<0) {
            number = -number;
            if (number % 2 == 0) {
                rez = (number / 2) * (number + 1);
            }
            else
                rez = number*((number+1)/2);
            rez = 1-rez;
        }
        System.out.println(rez);
    }

}
//long N = in.nextLong();
//long s = 0;
//if (N % 2 == 0) s = (N / 2) * (N + 1));
//else s = N * ((N + 1) / 2);
//if (N < 0) s = -s + 1;
//out.println(s);