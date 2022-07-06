import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        /** Task 1: 
         * 
         *  Create a new array afterTax with the same length as price
         * 
         */
        double[] afterTax = new double[price.length];

         /** Task 2:
          * 
          *  Update each element in afterTax to be: price + 13% * price.
          *
          */
        for(int i = 0; i < afterTax.length; i++) {
        	afterTax[i] = price[i] + 0.13 * price[i];
        }
        

         /** Task 3:
          * 
          * Print the following messages:
          *     The original prices are: <original prices>
          *     The prices after tax are: <after tax prices>
          *
          */
        System.out.println("The original prices are: " + Arrays.toString(price));
        System.out.println("The prices after tax are: " + Arrays.toString(afterTax));

    }
}
