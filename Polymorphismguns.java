abstract class Shape{
    abstract void area();
    
}
class Circle extends Shape{
    int r;
    Circle(int r){
        this.r = r;
    }
    void area(){
        System.out.println("Area of circle: " + (3.14 * r * r));
    }
}
class Square extends Shape{ 
    int a;
    Square(int a){
        this.a = a;
    }
    void area(){
        System.out.println("Area of square: " + (a * a));
    }
}
class Rectangle extends Shape{
    int l, b;   