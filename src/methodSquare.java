public class methodSquare {

    public static int calculateSquareArea (int side){

        int squareArea = side * side;
        return(squareArea);

    }

    public static int calculateSquarePerimeter (int side){
        int perimeterSquare = (side + side)*2;
        return(perimeterSquare);
    }


    public static void main (String[] args){
        int side = 2;
        int side1 = 3;
        int side2 = 5;
        int side3 = 10;
        int side4 = 1;
        System.out.println("The area of the given Square is "+calculateSquareArea(side)+ "cm2.");
        System.out.println("The perimeter of the given Square is "+calculateSquarePerimeter(side)+ "cm.");
        System.out.println();
        System.out.println("The area of the given Square is "+calculateSquareArea(side1)+ "cm2.");
        System.out.println("The perimeter of the given Square is "+calculateSquarePerimeter(side1)+ "cm.");
        System.out.println();
        System.out.println("The area of the given Square is "+calculateSquareArea(side2)+ "cm2.");
        System.out.println("The perimeter of the given Square is "+calculateSquarePerimeter(side2)+ "cm.");
        System.out.println();
        System.out.println("The area of the given Square is "+calculateSquareArea(side3)+ "cm2.");
        System.out.println("The perimeter of the given Square is "+calculateSquarePerimeter(side3)+ "cm.");
        System.out.println();
        System.out.println("The area of the given Square is "+calculateSquareArea(side4)+ "cm2.");
        System.out.println("The perimeter of the given Square is "+calculateSquarePerimeter(side4)+ "cm.");

    }
}
