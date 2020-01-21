public class Exercises {

	public boolean commonEnd(int[] a, int[] b) {
		if (a == null || a.length == 0 || b == null || b.length == 0) {
			return false;
		} else if (a[0] == b[0] || a[a.length-1] == b[b.length-1]) {
			return true;
		}
		return false;
	}
	
	public String[] endsMeet(String[] values, int n) {
		if (values == null || values.length < n || n < 1) {
			String[] empty = new String[0];
			return empty;
		} else {
			String[] newArray = new String[n*2];
			int x = n;
			for(int i = 0; i < n; i++) {
				newArray[i] = values[i];
			}
			for(int i = values.length-n; i < values.length; i++) {
				newArray[x] = values[i];
				x++;
			}
			return newArray;
		}
	}
	
	public int difference(int[] numbers) {
		if (numbers == null || numbers.length < 1) {
			return -1;	
		} else {
			int max = numbers[0];
			int min = numbers[0];
			for (int i = 1; i < numbers.length; i++) {
	             if (numbers[i] > max) {
	            	 max = numbers[i];  
	             }
	             if (numbers[i] < min) {
	            	 min = numbers[i];  
	             }
			}
			return max-min;
		}
	}
	
	public double biggest(double[] numbers) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
	
	public String[] middle(String[] values) {
		// write your code here
		
		return null;	// default return value to ensure compilation
	}

	public boolean increasing(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean everywhere(int[] numbers, int x) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean consecutive(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(int[] numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(String[] values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
