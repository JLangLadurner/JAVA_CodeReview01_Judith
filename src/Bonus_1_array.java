/*(10) Save your test data (several widths / heights) for several different
rectangles in two arrays. Use the for loop to access the array elements,
then perform rectangular surface calculation
and display results of your calculation. */

public class Bonus_1_array {

    public static void main (String[] args){

        int[] width = {5,7,8,3,6};
        int[] height = {6,3,8,7,5};


        for (int i = 0; i < width.length; i++){
            System.out.println("The Area of a rectangle with the width of "+width[i]+
                    "m and the height of "+height[i]+"m is "+width[i]*height[i]+"m2.");
        }
    }
}
