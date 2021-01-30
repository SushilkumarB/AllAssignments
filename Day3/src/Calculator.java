/**
 * This is a simple calculator.
 * @author thinkitive
 *
 */
public class Calculator {
	/**
	 * This method adds two numbers and produces answer
	 * @param a is the first input
	 * @param b is the second input
	 * @return int format addition of a and b
	 */
	
	public Calculator() {
		System.out.println("In Calculator");
	}
	
	
	public int add(int a , int b) {
		return a+b;
	}
	/**
	 * This method subtracts two numbers and produces answer
	 * @param a is the first input
	 * @param b is the second input
	 * @return
	 */

	public int sub(int a , int b) {
		return a-b;
	}
	/**
	 * This method multiplies two numbers and produces answer 
	 * @param a is the first input
	 * @param b is the second input
	 * @return
	 */
	

	public int mul(int a , int b) {
		return a*b;
	}
	/**
	 * This method divides two numbers and produces answer
	 * @param a is the first input
	 * @param b is the second input
	 * @return
	 */

	public int divide(int a , int b) {
		return a/b;
	}

}
