/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

/**
 *
 * @author vasilis
 */
public class Rectangle extends Shape{
    private double width;
    private double height;
    
    public Rectangle(double width, double height, double centerX, double centerY){
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }
    @Override
    public double height(){
        return height;
    }
    @Override
    public double width(){
        return width;
    }
    @Override
    public double area(){
        return width * height;
    }
}
