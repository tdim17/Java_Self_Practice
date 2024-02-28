package Java_weekly_txt_practice_tasks.JD07_CustomClass_and_Scanners;

public class Rectangle {

    double width;
    double length;

    public double calculateArea() {
        double area =  width * length;
        return area;  // Если не использовать возврат переменной, тогда
        // невозможно будет ее полноценно использовать на стороне клиента,
        // а только как строку видимо ????

    }

    public double calculatePerimeter(){
        double perimeter = (width + length)*2;
        return perimeter;
    }


    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}
