package problem6;

public class Circle extends Forme{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    public double getSurface(){
        return Math.PI*radius*radius;
    }


}
