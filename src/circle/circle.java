package circle;

public class circle {
    static final double pi = Math.PI;
    private double radius = 1.0;
    private String color = "blue";
    circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getArea(){
        return (this.radius * this.radius * pi);
    }
}
