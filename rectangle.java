import java.util.*;
//import java.io.*;

public class rectangle {
    Scanner obj = new Scanner(System.in);
    double width, length, area;
    public String color;

    void set_width()
    {
        System.out.print("Enter the width: ");
        width = obj.nextDouble();
    }
    void set_length()
    {
        System.out.print("Enter the length: ");
        length = obj.nextDouble();
    }
    String set_color()
    {
        System.out.print("Enter the color: ");
        color = obj.next();
        return color;

    }
    void find_area()
    {
        area = length * width;
        System.out.println("Area is: " + area);
    }
}
class second_rectangle
{
    public static void main(String[] args) {
        rectangle obj1 = new rectangle();
        rectangle obj2 = new rectangle();

        obj1.set_length();
        obj1.set_width();
        //obj1.set_color();
        obj1.find_area();

        obj2.set_length();
        obj2.set_width();
        //obj2.set_color();
        obj2.find_area();


        System.out.println("Enter the color of both the rectanges: ");
        if (obj1.area == obj2.area && obj1.set_color().equals(obj2.set_color())) {
            System.out.println("Matching Rectangles found!");
        }
        else
        {
            System.out.println("Non Matching Rectangles found!");
        }
    }
}