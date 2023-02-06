import java.text.DecimalFormat;
import java.lang.Math;

public class Polygon {
   private int numSides;
   private double sideLength;
   private String shapeType;
   private double perimeter;
   private double apothem;
   private double area;
   private double pi = 3.14159265359;

   public Polygon(){
       numSides = 3;
       sideLength = 1.0;
       shapeType = "triangle";
       perimeter = sideLength*numSides;
   }

   public Polygon(int ns, double sl, String st){
           numSides = ns;
           sideLength = sl;
           shapeType = st;
           perimeter = sideLength * numSides;
   }

   public int getNumSides(){
       return numSides;
   }

    public double getSideLength(){
        return sideLength;
    }

    public String getShapeType(){
        return shapeType;
    }

    public void setNumSides(int ns){
        numSides = ns;
    }

    public void setSideLength(double sl){
        sideLength = sl;
    }

    public void setShapeType(String st){
        shapeType = st;
    }

    public String calculatePerimeter(){
       return "It has a perimeter of " + perimeter;
    }
    public String calculateArea(){
        DecimalFormat df = new DecimalFormat("###.###");
        apothem = Math.toRadians(180/((double)numSides));
        apothem = Math.tan(apothem);
        apothem *= 2;
        apothem = sideLength / apothem;
        area = ((numSides * sideLength * apothem)/2);
        return "It has an area of " + df.format(area) + ".";
    }

    public String toString(){
       DecimalFormat df = new DecimalFormat("###.###");
        if(numSides < 3 || sideLength < 0){
            return "Not a valid polygon";
        }
        else {
            return "Your shape is a " + shapeType + " and it has " + numSides + " sides.\nIt has a side length of " +
                    sideLength + ".\nIt has a perimeter of " + df.format(perimeter) + " units.";
        }
    }
}