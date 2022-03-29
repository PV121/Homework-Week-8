package poolarea;

public class Cuboid extends Rectangle {
    double height;

    Cuboid(double width,double length, double height){
        super(5.0,10.0);
        this.height=height;
        if (height <0){
            height=0;
        }else{
            this.height=height;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        double volume= getArea() * height;
        return volume;
    }
}
