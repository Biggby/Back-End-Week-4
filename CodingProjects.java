package codingprojects;

public class CodingProjects {
	
	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int result = ages[ages.length - 1] - ages[0];
		int[] ages2 = {15, 27, 55, 42, 31, 76, 82, 11, 21};
		int result2 = ages2[ages2.length - 1] - ages2[0];
		
		
		System.out.println(result);
		System.out.println(result2);
		
		int average = averageCalc(ages2);
		System.out.println(average + "\n");
		
		// Calling and using Methods
		// Use \n as a separator 
		
		System.out.println(concatenateWord("Hello", 3));
		System.out.println(createFullName("Tyler", "Hansen"));
		int[] numbers = {40, 50, 20};
		System.out.println(isSumGreaterThan100(numbers));
		double[] stats = {3.33, 4.72, 1.32};
		double[] stats2 = {4.44, 5.67, 7.89};
		System.out.println(calculateAverage(stats));
		System.out.println(isFirstArrayGreater(stats, stats2));
        System.out.println("Will buy drink: " + willBuyDrink(true, 12.00));	        
        System.out.println("Is rich: " + isRich(22, false) + "\n");
		
		
		averageNameCalc(); // needs to be called in main since its in another class
		
	}
	
	public static int averageCalc(int[] numbers) {
		
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum / numbers.length;
	}

	
	public static void averageNameCalc() {
		
		String[] names = new String[6];
			names[0] = "Sam";
			names[1] = "Tommy";
			names[2] = "Tim";
			names[3] = "Sally";				
			names[4] = "Buck";	
			names[5] = "Bob";
			
		int starterNumber = 0;
		
		for (String name : names) {
            starterNumber += name.length();
        }
				
		int averageLetters = starterNumber / names.length;				

		System.out.println(averageLetters);
		System.out.println(names[names.length - 1]);
		System.out.println(names[0]);
		
		
		// nameLengths array creation
		
		int[] nameLengths = new int[names.length];
		
		for(int i = 0; i < names.length; i++) {
			nameLengths [i]= names[i].length();
		}
		
		for (int length : nameLengths) {
            System.out.println("Each name length: " + length);
            
	    }
		
		int sumName = sumArray(nameLengths);   
        System.out.println("Sum of all Name Lengths " + sumName);
	}
		
	
	public static int sumArray(int[] numbers) {
		
		int sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum;
	      
	}
	
	public static String concatenateWord(String word, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += word;
        }
        return result;
    }

    // create full name
    public static String createFullName(String firstName, String lastName) {
        return firstName + " " + lastName;

    }
    
    // add all int and see if greater than 100
    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum > 100;
    }

    // Calculate average of doubles
    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    // Compare averages of two arrays
    public static boolean isFirstArrayGreater(double[] stats, double[] stats2) {
        return calculateAverage(stats) > calculateAverage(stats2);
    }

    // Decide whether to buy drink or not
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }
    
    // Custom Method
    public static boolean isRich(int age, boolean hasParentPermission) {
    	if (age >= 21) {
    		return true;
    	} else if (age >= 16 && hasParentPermission) {
    		return false;
    	} return false;
    }

	
}
