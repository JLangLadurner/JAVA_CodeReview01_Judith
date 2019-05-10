/*create a Java program (.java) that can accept width and height of a rectangular as parameters
to main() and displays a solution in console. To do that, do some research on java programs
that accept parameters.

research: "In simple words , it’s just an another form of method that was used back in 2000’s
year where scanner function was not introduced."

navigate in terminal to project folder/out/production/file  name - type in with java filename and
parameters in intellij terminal

cmd do the same - src folder does not return calculation - only params
 */

public class Bonus_2 {

    //method to calculate rectangle
    public static int calculateRectArea(int width, int height) {
        int rectangularArea = width * height;
        return (rectangularArea);
    }

    public static void main(String[] args) {
        //If an error occurs, we can use try...catch to catch the error and execute some code to handle it:
        try {
        int[] params = new int[args.length];
            //turn cmd line string into integers
            for (int i = 0; i < args.length; i++) {
                params[i] = Integer.parseInt(args[i]);
            }
            //if i++ and i=i+1  --->exception will be thrown every time...
            for (int i = 0; i < args.length; i=i+2) {
            //accept i and i + 2 - otherwise go to catch
                System.out.println("The area with the given parameters is "+calculateRectArea(params[i], params[i+1])+"m2.");
            }
        } catch (Exception e) {
            System.out.println("Given too many arguments or maybe not enough? Please enter 2 arguments");
        }
    }
}

//source: https://www.w3schools.com/java/java_try_catch.asp
//https://javatutoring.com/command-line-arguments-java-with-examples/
//https://stackoverflow.com/questions/18446509/args-length-and-command-line-arguments
//https://www.geeksforgeeks.org/difference-x-xx1-java/


