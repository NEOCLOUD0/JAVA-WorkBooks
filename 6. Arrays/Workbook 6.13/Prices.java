import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
        //Task 1 - Create a 2D array that can store 3 rows and 5 columns of double values.
    	double [][] pricing = {
    			{12.99, 8.99, 9.99, 10.49, 11.99},
    			{0.99, 1.99, 2.49, 1.49, 2.99},
    			{8.99, 7.99, 9.49, 9.99, 10.99}
    	};
    	
//    	double[][] pricing = new double[3][5];
//    	pricing[0][0] = 12.99;
//    	pricing[0][1] = 8.99;
//    	pricing[0][2] = 9.99;
//    	pricing[0][3] = 10.49;
//    	pricing[0][4] = 11.99;
//    	
//    	pricing[1][0] = 0.99;
//    	pricing[1][1] = 1.99;
//    	pricing[1][2] = 2.49;
//    	pricing[1][3] = 1.49;
//    	pricing[1][4] = 2.99;
//    	
//    	pricing[2][0] = 8.99;
//    	pricing[2][1] = 7.99;
//    	pricing[2][2] = 9.49;
//    	pricing[2][3] = 9.99;
//    	pricing[2][4] = 10.99;
        

        // Task 2 - Populate your 2D array with values from the table (see article)

        // Task 3 - Print the prices for each department. See the article for the expected output.  
//    	System.out.println("Baking: " + pricing[0][0] + " " + pricing[0][1] + " " + pricing[0][2] + " " + pricing[0][3] + " " + pricing[0][4]);
//    	System.out.println("Beverage: " + pricing[1][0] + " " + pricing[1][1] + " " + pricing[1][2] + " " + pricing[1][3] + " " + pricing[1][4]);
//    	System.out.println("Cereal: " + pricing[2][0] + " " + pricing[2][1] + " " + pricing[2][2] + " " + pricing[2][3] + " " + pricing[2][4]);
    	
//    	System.out.println("Baking: " + Arrays.toString(pricing[0]));
//    	System.out.println("Beverage: " + Arrays.toString(pricing[1]));
//    	System.out.println("Cereals: " + Arrays.toString(pricing[2]));
    	
    	
    	for(int i = 0; i < pricing.length; i++) {
    		
    		switch(i) {
    		case 0:
    			System.out.print("Baking: ");
    			break;
    		case 1:
    			System.out.print("Beverage: ");
    			break;
    		case 2:
    			System.out.print("Cereals: ");
    			break;
    		}
    		
    		for(int j = 0; j < pricing[i].length; j++) {
    			System.out.print(pricing[i][j] + " ");
    		}
    		System.out.println();
    	}
    }
}