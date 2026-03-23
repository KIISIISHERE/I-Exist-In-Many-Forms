import java.util.Scanner;
//abstract class
abstract class Shape{
    //method-calculate the area of different shapes
    abstract double getArea();
}
//circle0area of a circle
class Circle extends Shape{
    double radius;
    //constructor-assign values to the class
    Circle(double radius){
        this.radius=radius; //radius belongs to the circle class
    }
    //implement abstract method
    @Override
    double getArea(){//polymorphism-same method name, different function
        return Math.PI*radius*radius;    
    }
}
//rectangle-calculate the area of a rectangle
class Rectangle extends Shape{
    double length;
    double width;
    //constructor
    Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }
    @Override
    double getArea(){
        return length*width;
    }
}
//triangle-calculate the are of a rectangle
class Triangle extends Shape{
    double base;
    double height;
    //constructor
    Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    @Override
    double getArea(){
        return 0.5*base*height;
    }
}
//square-calculate the area of a square
class Square extends Shape{
    double side;
    //constructor
    Square(double side){
        this.side=side;
    }
    @Override
    double getArea(){
        return side*side;
    }
}
//main class
class Main {
    //public method
    public static void main(String[] args) {
        //input object
        Scanner input=new Scanner(System.in);
        //shape object-excute all the classes
        Shape shp=null;
        System.out.println("Choose a shape: ");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");
        int choice=input.nextInt();
        if (choice==1){
            System.out.println("Enter the radius");
            double radius=input.nextDouble();
            shp=new Circle(radius);//execute the circle class
        }else if (choice==2){
            System.out.println("Enter the length");
            double l=input.nextDouble();
            System.out.println("Enter Width");
            double w=input.nextDouble();
            shp=new Rectangle(l,w);
        }else if (choice==3){
             System.out.println("Enter the base");
             double b=input.nextDouble();
            System.out.println("Enter the height");
            double h=input.nextDouble();
            shp=new Triangle(b,h);
        }else if (choice==4){
            System.out.println("Enter the side");
            double s=input.nextDouble();
            shp=new Square(s);
     }else{
        System.out.println("Invalid input");
        //close the user input
        input.close();
        return;
     }
     //execute the class methods and display the area
     System.out.println("Area="+shp.getArea());
     input.close();
    }
}