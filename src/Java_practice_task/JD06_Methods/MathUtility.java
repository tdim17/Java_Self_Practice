package Java_practice_task.JD06_Methods;

public class MathUtility {

    public static void main(String[] args) {

        double result = calculate(9.2, '-', 3.1);
        System.out.println(result);

        int result2 = calculate(1, '+', 7);
        System.out.println(result2);

        double squareResult = square(3.3);
        System.out.println(squareResult);

        double cubeResult = cube(2.5);
        System.out.println(cubeResult);



    }
    public static int calculate(int num1, char operator, int num2) {

        int result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }
        return result;
    }
    /*
    public static double calculate(double num1, char operator, double num2) {
        double result = 0;
        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
        }
        return result;
    }
    // Чтобы не повторять один и тот же фрагмент кода внутри метода, можно вызвать этот код в другой метод. См. пример ниже:
    */

    // Очень важный момент!!!!!!!!!!!! Чтобы не повторять один и тот же блок кода, можно вызвать его из другого метода
    public static double calculate(double num1, char operator, double num2){
        // Вызываем ранее созданный метод для переменной int и приводим аргументы к нужному типу double, чтобы отдать значение переменной double
        return (double) calculate((int) num1, operator, (int) num2);
    }


    public static int square (int sq) {
        int squareResult = sq*=sq;
        return squareResult;
    }

    public static double square (double sq) {
        double squareResult = sq*=sq;
        return squareResult;
    }

    public static int cube (int k) {
        int cubeResult = k *= k * k;
        return cubeResult;
    }
    public static double cube (double k) {
            double cubeResult = k *= k * k;
            return (double) cubeResult;    // Можно не использовать (double) в скобках, это при превращении одного типа данных в другой
    }
}

