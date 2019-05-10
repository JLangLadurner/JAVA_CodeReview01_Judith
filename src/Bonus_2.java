/*create a Java program (.java) that can accept width and height of a rectangular as parameters
to main() and displays a solution in console. To do that, do some research on java programs
that accept parameters.

research: "In simple words , it’s just an another form of method that was used back in 2000’s
year where scanner function was not introduced."
 */

public class Bonus_2 {

    //method to calculate rectangle
    public static int calculateRectArea(int width, int height) {
        int area = width * height;
        return (area);
    }

    public static void main(String[] args) {
        try {
        int[] params = new int[args.length];
            //turn cmd line string into integers
            for (int i = 0; i < args.length; i++) {
                params[i] = Integer.parseInt(args[i]);
            }

            for (int i = 0; i < args.length; i = i + 2) {
            //accept i and one more parameter - otherwise go to catch
                System.out.println("The parameters given are "+args[i]+" m and "+args[i]
                        +" m which results in the area of "+calculateRectArea(params[i], params[i+1])+"m2.");
            }
        } catch (Exception e) {
            System.out.println("Given too many arguments or maybe not enough? Please enter 2 arguments");
        }
    }
}



