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

    /**
     * Creates a default polygon, a triangle with 3 sides and side length 1.0
     * and calculates the perimeter.
     */
   public Polygon(){
       numSides = 3;
       sideLength = 1.0;
       shapeType = "triangle";
       perimeter = sideLength*numSides;
   }

    /**
     * Creates a polygon with using user parameters
     * and calculates perimeter.
     * @param ns desired number of sides
     * @param sl desired side length
     * @param st desired shape type
     */
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

    /**
     * Changes number of sides of polygon
     * @param ns desired numbers of sides
     */
    public void setNumSides(int ns){
        numSides = ns;
    }

    /**
     * Changes side length of polygon
     * @param sl desired side length
     */
    public void setSideLength(double sl){
        sideLength = sl;
    }

    /**
     *Changes shape type of polygon
     * @param st desired shape type
     */
    public void setShapeType(String st){
        shapeType = st;
    }

    /**
     * returns the perimeter
     * @return
     */
    public String calculatePerimeter(){
       return "It has a perimeter of " + perimeter;
    }

    /**
     * Calculates the area and returns formatted to 3 decimal places
     * @return area with 3 decimal places
     */
    public String calculateArea(){
        DecimalFormat df = new DecimalFormat("###.###");
        apothem = Math.toRadians(180/((double)numSides));
        apothem = Math.tan(apothem);
        apothem *= 2;
        apothem = sideLength / apothem;
        area = ((numSides * sideLength * apothem)/2);
        return "It has an area of " + df.format(area) + ".";
    }

    /**
     * Checks if a polygon is valid and returns either invalid or the attributes of the object
     * @return invalid or the shape type, numbers of sides, side length, and perimeter formatted to 3 decimals places
     */
    public String toString(){
       DecimalFormat df = new DecimalFormat("###.###");
        if (numSides < 3 || sideLength < 0){
            return "Not a valid polygon";
        }
        else {
            return "Your shape is a " + shapeType + " and it has " +
                    numSides + " sides.\nIt has a side length of " +
                    sideLength + ".\nIt has a perimeter of " +
                    df.format(perimeter) + " units.";
        }
    }
}