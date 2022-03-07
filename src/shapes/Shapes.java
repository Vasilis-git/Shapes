/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shapes;

import java.io.FileNotFoundException;

/**
 *
 * @author vasilis
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Drawing dr = new Drawing();
        try{
           dr.readFromFile("draw1.txt");
           System.out.println("Total area: "+ dr.totalArea());
           System.out.println("Total rectangles: "+ dr.countRectangles());
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
    
}
