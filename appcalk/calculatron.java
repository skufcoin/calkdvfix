package appcalk;

import java.util.Scanner;
public class calculatron {
    public static int calculator(int first,String operator, int second) {


        int inner = 0;
        int result = 0;

        if ((first <= 10 && first > 0) && (second <= 10 && second > 0)) {

            if (operator.equals("*")) {
                result = first * second;
            }
            if (operator.equals("/")) {
                result = first / second;
            }
            if (operator.equals("+")) {
                result = first + second;
            }
            if (operator.equals("-")) {
                result = first - second;
            }
            else if (inner <= 0 && inner >= 0) {
                throw new IllegalArgumentException("Нельзя вводит более двух операндов");
            }

        }else {
            throw new IllegalArgumentException("Ввод цифр должен быть от 1 до 10");
        }


        return result;
    }

}




class Main {

    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Введите пример из двух римских или арабских чисел от 1 до 10");
        RomanNum.RomanorArab(read.next(), read.next(), read.next());
    }

}