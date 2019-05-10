/*(30)  create this solution with a usage of a new Java method calculateRectArea that returns a computed
value back to main().  Call this method with two different sets of parameters: 20cm (width1) and 30cm (height1),
as well as 40cm (width2) and 50cm (height2)*/

    public class method_calculateRectArea {

        public static int calculateRectArea (int width1, int height1){
            int rectangular = width1 * height1;
            return(rectangular);

        }
        public static void main (String[] args) {

            int width1 =30;  int height1 = 20;
            int width2 = 40; int height2 = 50;
            int width3 = 10; int height3 = 20;
            int width4 = 5; int height4 = 3;
            System.out.println("The area of the Rectangular is "+calculateRectArea(width1,height1)+ "cm2");
            System.out.println("The area of the Rectangular is "+calculateRectArea(width2,height2)+ "cm2");
            System.out.println("The area of the Rectangular is "+calculateRectArea(width3,height3)+ "cm2");
            System.out.println("The area of the Rectangular is "+calculateRectArea(width4,height4)+ "cm2");
        }
    }

