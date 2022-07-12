
public class MyInteger {

	int value = 0;
	
	MyInteger(int newValue) {
		value = newValue;
	}
	
	public int getMyInteger() {
		return(value);
	}
	
	public boolean isEven() {
		return((value % 2) == 0);
	}
	
	public boolean isOdd() {
		return((value % 2) != 0);
	}
	
	public boolean isPrime() {
		boolean isAPrimeNumber = true;
		if (value > 0) {
			for (int i = 1; i < value; i ++) {
				if ((value % i) == 0) {
					isAPrimeNumber = false;
				}
			}
		}
		else {
			isAPrimeNumber = false;
		}
		return(isAPrimeNumber);
	}
	
	public static boolean isEven(int aValue) {
		return((aValue % 2) == 0);
	}
	
	public static boolean isOdd(int aValue) {
		return((aValue % 2) != 0);
	}
	
	public static boolean isPrime(int aValue) {
		boolean isAPrimeNumber = true;
		if (aValue > 0) {
			for (int i = 1; i < aValue; i ++) {
				if ((aValue % i) == 0) {
					isAPrimeNumber = false;
				}
			}
		}
		else {
			isAPrimeNumber = false;
		}
		return(isAPrimeNumber);
	}
	
	public static boolean isEven(MyInteger originalValue) {
		String stringNumber = "";
		stringNumber += originalValue;
		int aValue = Integer.parseInt(stringNumber);
		return((aValue % 2) == 0);
	}
	
	public static boolean isOdd(MyInteger originalValue) {
		String stringNumber = "";
		stringNumber += originalValue;
		int aValue = Integer.parseInt(stringNumber);
		return((aValue % 2) != 0);
	}
	
	public static boolean isPrime(MyInteger originalValue) {
		String stringNumber = "";
		stringNumber += originalValue;
		int aValue = Integer.parseInt(stringNumber);
		boolean isAPrimeNumber = true;
		if (aValue > 0) {
			for (int i = 1; i < aValue; i ++) {
				if ((aValue % i) == 0) {
					isAPrimeNumber = false;
				}
			}
		}
		else {
			isAPrimeNumber = false;
		}
		return(isAPrimeNumber);
	}
	
	public boolean equals(int aValue) {
		return(value == aValue);
	}
	
	public boolean equals(MyInteger newInteger) {
		String stringInt = "";
		stringInt += newInteger;
		int newInt = Integer.valueOf(stringInt);
		return(value == newInt);
	}
	
	public static int parseInt(char[] characterArray) {
		int newInt = parseInt(characterArray);
		return(newInt);
	}
	
	public static int parseInt(String intString) {
		int newInt = Integer.valueOf(intString);
		return(newInt);
	}

}