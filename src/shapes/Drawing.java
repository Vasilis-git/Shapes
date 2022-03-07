/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vasilis
 */
public class Drawing {
    private ArrayList<Shape> shapes;
    
    public Drawing(){
        shapes = new ArrayList<Shape>();
    }
    public double totalArea(){
        double sum = 0;
        for(Shape s: shapes){
            sum += s.area();
        }
        return sum;
    }
    public int countRectangles(){
        int count = 0;
        for(Shape s: shapes){
            if(s.getClass() == Rectangle.class){
                count++;
            }
        }
        return count;
    }
    public void readFromFile(String filename) throws FileNotFoundException{ 
        try(Scanner file = new Scanner(new FileInputStream(filename))){
            String word = file.next();
            while(word.equals("x")){
                double centerX = file.nextDouble();
                double centerY = file.nextDouble();
                if(word.equals("r")){
                    double width = file.nextDouble();
                    double height = file.nextDouble();
                    shapes.add(new Rectangle(width, height, centerX, centerY));
                }
                else{//το αρχείο είναι στην σωστή μορφή, οπότε εδώ θα είναι s
                    double length = file.nextDouble();
                    shapes.add(new Square(length, centerX, centerY));
                }
                word = file.next();
            }
        }
        /*
         Μορφή αρχέιου εισόδου:
         r 4 5 5 7 [Παραλληλόγραμμο κέντρου (4, 5), πλάτους 5 και ύψους 7]
         s 3 -1 4.2 [Τετράγωνο κέντρου (3, −1) και πλευράς 4.2]
         x [Τέλος στοιχείων]
        */
        catch(FileNotFoundException e){
           throw new FileNotFoundException("File named: "+filename+" was not found.");
        }
    }
}
