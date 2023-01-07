//4. Напишите программу, в которой описан статический метод для вычисления
//двойного факториала числа, переданного аргументом методу. По определению, двойной
//факториал числа п (обозначается как n!!) — это произведение через одно всех чисел, не
//больших числа п. То есть n!! = п * (n - 2) * (п - 4)* ... (последний множитель равен 1 для
//нечетного п и равен 2 для четного n). Например, 6!! = 6 х 4 х 2 = 48 и 5!! = 5 х 3 х 1 = 15.
//Предложите версию метода без рекурсии и с рекурсией.
package lr6.example4;

public class MyClass1 {
    public static int factorial(int value){ //рекурсия
        if(value == 0){
            return 0;
        }
        else if (value == 1) {
            return value;
        } else if (value == 2) {
            return value;
        }
        int result = value * factorial(value - 2);
        return result;
    }
    public static int factorial2(int value){ //Без рекусии
        int result = 1;
        if(value == 0){
            return 0;
        }
        else if(value % 2 == 0){
            for (int i = value; i >= 2; i=i-2) {
                result *= i;
            }
            return result;
        }
        else if (value % 2 == 1){
            for (int i = value; i >= 1; i=i-2) {
                result *= i;
            }
            return result;
        }
        return 1984;
    }
}
