package problem6;

public class Square extends Forme{
    private double side;
    public Square(double side){
        this.side=side;
    }
    public double getSurface(){
        return side*side;
    }


}
