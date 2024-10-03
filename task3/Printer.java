package task3;
//Задача 3. Подсчет суммы цифр числа
// Напишите метод sumDigits, который принимает целое число n и возвращает
// сумму его цифр.

class Answer {
    public int sumDigits (int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    
}
public class Printer {
    public static void main(String[] args) {
        int n = 12345;
        if (args.length > 0) {
            n = Integer.parseInt(args[0]);
        }
        Answer ans = new Answer ();
        int itresum_res = ans.sumDigits(n);
        System.out.println(itresum_res);
    }
}

