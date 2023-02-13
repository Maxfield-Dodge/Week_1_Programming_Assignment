public class Polygon {
   private int numSides;

   private double sideLength;

   private String shapeType;

   private double perimeter;

   private double apothem;

   private double area;

    /**
     * Creates a default polygon, a triangle with 3 sides and side length 1.0
     */
   public Polygon() {
       numSides = 3;
       sideLength = 1.0;
       shapeType = "Triangle";
   }

    /**
     * Creates a polygon with user parameters
     * Has a validation check to confirm each value is valid,
     * if one value in invalid creates a default polygon
     * @param theNumSides desired number of sides
     * @param theSideLength desired side length
     * @param theShapeType desired shape type
     */
   public Polygon(int theNumSides, double theSideLength, String theShapeType) {
           numSides = theNumSides;
           sideLength = theSideLength;
           shapeType = theShapeType;
       if (numSides < 3 || sideLength <= 0) {
           System.out.println("Invalid polygon. Set to default of 3 sides, side length 1.0 and shape Triangle.");
           numSides = 3;
           sideLength = 1.0;
           shapeType = "Triangle";
       }
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

    public double getArea() {
       return area;
   }

   public double getPerimeter() {
       return area;
   }

    /**
     * Changes number of sides of polygon
     * if the number of sides is 3 or greater otherwise prints Invalid
     * @param newNumSides desired numbers of sides
     */
    public void setNumSides(int newNumSides) {
        if (newNumSides >= 3) {
            numSides = newNumSides;
        }
        else {
            System.out.println("Invalid number of sides, number of sides didn't change.");
        }
    }

    /**
     * Changes side length of polygon
     * if sideLength is positive otherwise prints Invalid
     * @param newSideLength desired side length
     */
    public void setSideLength(double newSideLength) {
        if(newSideLength > 0) {
            sideLength = newSideLength;
        }
        else {
            System.out.println("Invalid side length, side length didn't change.");
        }
    }

    /**
     *Changes shape type of polygon
     * @param newShapeType desired shape name
     */
    public void setShapeName(String newShapeType) {
        shapeType = newShapeType;
    }

    /**
     * calculates the perimeter
     * @return calculated perimeter
     */
    public double calculatePerimeter() {
       perimeter = sideLength * numSides;
       perimeter = Math.round(perimeter * 1000) / 1000.0;
       return perimeter;
    }

    /**
     * Calculates the area and returns formatted to 3 decimal places
     * @return area with 3 decimal places
     */
    public double calculateArea() {
        apothem = sideLength/(Math.tan(Math.PI/((double) numSides))*2);
        area = ((numSides * sideLength * apothem)/2);
        area = Math.round(area * 1000) / 1000.0;
        return area;
    }

    /**
     * Returns a description of the polygon
     * @return a String describing shapeType, numSides, sideLength, and perimeter.
     */
    public String toString() {
        return "Your shape is a " + shapeType + " and it has " +
                    numSides + " sides.\nIt has a side length of " +
                    sideLength + ".\nIt has a perimeter of " +
                    perimeter + " units.";
    }
}