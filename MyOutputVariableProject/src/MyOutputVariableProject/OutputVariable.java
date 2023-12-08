/**
 * 
 */
package MyOutputVariableProject;

import java.text.*;
import java.util.Locale;

/**
 * @author steve
 *
 */
public class OutputVariable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long numero = 123098;
		double pi = Math.PI;
		String status = "";
		int grade = 8;
		System.out.printf("%d %n",numero);
		System.out.printf("%08d %n",numero);
		System.out.printf("%+d %n",numero);
		Locale.setDefault(Locale.US);
		DecimalFormat formato1 = new DecimalFormat("###,###.##");
		String valorformateado1 = formato1.format(numero);
		System.out.printf("%s %n", valorformateado1);
		/*
		 * 
		 */
		System.out.println("Manejo de operador condicional");
		status = (grade >= 7 ) ? "Passed":"Fail";
		
		System.out.println (status);
		
	}

}
