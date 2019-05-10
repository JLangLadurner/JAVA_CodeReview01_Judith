/*(30)   create a solution for the following problem: given a width of a square (image below, right side),
calculate the squareArea (on image below 16 cm²)  and squarePerimeter (Perimeter:  line forming the boundary
of a closed geometrical figure.  Example: for a square with a width= 4cm, squarePerimeter  is 16 cm;
for a square with a width=2cm, squarePerimeter  is 8cm) */

public class squareArea {


    public static void main (String[] args){
        int side = 4;
        int squareArea = side*side;
        System.out.println("The Area of the Square is "+squareArea +" m2.");

        int side2= 4;
        int squarePerimeter = (side2+side2)*2;
        System.out.println("The Perimeter of the Square is "+squarePerimeter +"cm.");

    }
}
