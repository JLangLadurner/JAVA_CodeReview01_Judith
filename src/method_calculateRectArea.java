/*(30)  create this solution with a usage of a new Java method calculateRectArea that returns a computed
value back to main().  Call this method with two different sets of parameters: 20cm (width1) and 30cm (height1),
as well as 40cm (width2) and 50cm (height2)*/

    public class method_calculateRectArea {

        public static void calculateRectArea (int width1, int height1){
            int rectangular = width1 * height1;
            System.out.println("The Area of the rectangular is " + rectangular);
        }
        public static void calculateRectArea2 (int width2, int height2){
            int rectangular2 = width2 * height2;
            System.out.println("The Area of the second rectangular  is " + rectangular2);

        }

        public static void main (String[] args) {
            int width1 = 20;
            int height1 = 30;

            calculateRectArea(width1,height1);

            int width2 = 40;
            int height2 = 50;

            calculateRectArea2(width2,height2);

        }

    }

