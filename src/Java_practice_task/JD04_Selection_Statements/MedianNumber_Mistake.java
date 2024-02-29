package Java_practice_task.JD04_Selection_Statements;

public class MedianNumber_Mistake {

    public static void main(String[] args) {

        /* Create a class named MedianNumber_Mistake. Write a program that finds the median number between
        three DIFFERENT given integers (Assume that the given three integers are distinct numbers).
        Example:
        a = 10;
        b = 15;
        c = 20;

        Output:
        15 is the median number
         */


        int num1 = 2;
        int num2 = 15;
        int num3 = 20;

        double median = (double)(num1 + num2 + num3)/3;
        System.out.println(median);

        // похоже, я неправильно понял задание! Это не average!!!!
        // медианное значение это не среднее арифметическое, а это значение по середине
        // That is the value between other next values!

        // Это задание нужно решать через несколько boolean для каждого значения, а потом эти boolean включить в if - else if

        /*
        Медиана - это значение, которое разделяет упорядоченный набор данных на две равные половины.
        Другими словами, если у вас есть набор чисел, упорядоченных по возрастанию или убыванию, медиана будет тем числом,
        которое стоит посередине этого набора. Если число элементов в наборе данных четное, то медианой будет
        среднее арифметическое двух центральных чисел. Например, для набора данных {1, 3, 5, 7, 9}
        медианой будет 5, потому что это число стоит посередине, разделяя набор на две равные половины.
        Медиана является одним из показателей центральной тенденции и может быть более устойчивой к выбросам,
        чем среднее арифметическое. (ChatGPT)
         */


    }
}
