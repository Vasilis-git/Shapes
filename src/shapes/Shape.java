/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author vasilis
 */
public abstract class Shape {
    private double centerX;
    private double centerY;
    
    public Shape(double centerX, double centerY){
        this.centerX = centerX;
        this.centerY = centerY;
    }
    public double getCenterX(){
        return centerX;
    }
    public double getCenterY(){
        return centerY;
    }
    public void setCenterX(double x){
        centerX = x;
    }
    public void setCenterY(double y){
        centerY = y;
    }
    public abstract double height();
    public abstract double width();
    public abstract double area();
}
