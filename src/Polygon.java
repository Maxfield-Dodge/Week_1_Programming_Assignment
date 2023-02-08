import java.text.DecimalFormat;

import java.lang.Math;

public class Polygon {
   private int numSides;

   private double sideLength;

   private String shapeType;

   private double perimeter;

   private double apothem;

   private double area;

    /**
     * Creates a default polygon, a triangle with 3 sides and side length 1.0
     * and calculates the perimeter.
     */
   public Polygon() {
       numSides = 3;
       sideLength = 1.0;
       shapeType = "triangle";
       perimeter = sideLength*numSides;
   }

    /**
     * Creates a polygon with using user parameters
     * and calculates perimeter.
     * @param theNumSides desired number of sides
     * @param theSideLength desired side length
     * @param theShapeType desired shape type
     */
   public Polygon(int theNumSides, double theSideLength, String theShapeType) {
           numSides = theNumSides;
           sideLength = theSideLength;
           shapeType = theShapeType;
           perimeter = sideLength * numSides;
   }

   public int getNumSides(){
       return numSides;
   }

    public double getSideLength(){
        return sideLength;
    }

    public String getShapeType() {
        return shapeType;
    }

    /**
     * Changes number of sides of polygon
     * @param newNumSides desired numbers of sides
     */
    public void setNumSides(int newNumSides) {
        numSides = newNumSides;
    }

    /**
     * Changes side length of polygon
     * @param newSideLength desired side length
     */
    public void setSideLength(double newSideLength) {
        sideLength = newSideLength;
    }

    /**
     *Changes shape type of polygon
     * @param newShapeType desired shape type
     */
    public void setShapeType(String newShapeType) {
        shapeType = newShapeType;
    }

    /**
     * returns the perimeter
     * @return
     */
    public String calculatePerimeter() {
       return "It has a perimeter of " + perimeter;
    }

    /**
     * Calculates the area and returns formatted to 3 decimal places
     * @return area with 3 decimal places
     */
    public String calculateArea() {
        DecimalFormat df = new DecimalFormat("###.###");
        apothem = Math.toRadians(180/((double) numSides));
        apothem = Math.tan(apothem);
        apothem *= 2;
        apothem = sideLength / apothem;
        area = ((numSides * sideLength * apothem)/2);
        return "It has an area of " + df.format(area) + ".";
    }

    /**
     * Checks if a polygon is valid and returns either
     * invalid or the attributes of the object
     * @return invalid or the shape type, numbers of sides,
     * side length, and perimeter formatted to 3 decimals places
     */
    public String toString() {
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