package poolarea;

public class Rectangle {
    double width;
    double length;

    Rectangle(double width, double length){
        this.length=length;
        this.width=width;
        if (width<0 && length < 0){
            width=0;
            length=0;
        }else{
            this.length=length;
            this.width=width;
        }
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public double getArea(){
        double area= width * length;
        return area;
    }
}
