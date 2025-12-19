abstract class Shape{
    int x;
    int y;
    public abstract void printArea();
}

class Rectangle extends Shape{
    int length;
    int breadth;
    Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
    public void printArea(){
        System.out.println("Area of Rectangle: "+length*breadth+"square units");
    }
}

class Triangle extends Shape{
    int length;
    int breadth;
    Triangle(int l,int b){
        length=l;
        breadth=b;
    }
    public void printArea(){
        System.out.println("Area of Triangle: "+(0.5*length*breadth)+"square units");
    }
}

class Circle extends Shape{
    int radius;
    Circle(int rad){
        radius=rad;
    }
    public void printArea(){
        System.out.printf("Area of Circle: %.2f square units\n",(Math.PI*radius*radius));
    }
}

class ShapeMain {
    public static void main(String[] args) {
        Rectangle r= new Rectangle(10,20);
        r.printArea();
        Triangle t=new Triangle(5,2);


        t.printArea();
        Circle c=new Circle(10);
        c.printArea();
    }
}
