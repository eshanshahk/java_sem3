
/*WRITE A JAVA PROGRAM TO CREATE A CLASS CALLED SHAPE WITH METHODS CALLED GETPERIMETER() AND GETAREA(). 
CREATE A SUBCLASS CALLED CIRCLE THAT OVERRIDES THE GETPERIMETER() AND GETAREA() METHODS TO 
CALCULATE THE AREA AND PERIMETER OF A CIRCLE.*/

import java.io.*;

class Shape{
    double getPerimeter(){
        return 0;
    }
    double getArea(){
        return 0;
    }
}

class Circle extends Shape{
    double getPerimeter(int r){
        return 2*3.14*r;
    }
    double getArea(int r){
        return 3.14*r*r;
    }
}
class P13{
    public static void main(String[] args) throws IOException {
    Circle obj=new Circle();
     System.out.println("Perimeter: "+obj.getPerimeter(5));
     System.out.println("Area : "+obj.getArea(5));
    }
}