package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.ArrayList;
public class Calculator {


	/*
     * este metodo devuelve el Class del object que le pasamos
     */
	public static Class classTypeOf(Object x) {
			return x.getClass();

	}


	/*
     * devuelve una lista con los n números de la serie de fibonacci.
     */
	public static List<Integer> fibonacci(int n) {
			List<Integer> result = new ArrayList<Integer>();
			if (n == 0){return result;}
				result.add(1);
				result.add(1);
			 for (int i = 2; i < n; i++) {
				 result.add(result.get(i-2) + result.get(i-1));
			}
				return result;
		}
/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {
		int[] numero = {};
		if(number == 0 || step == 0){return numero;}
			List<Integer> result = new ArrayList();
		while(number > step){
		if(number - step > 0){
			result.add(number -= step);
			}
		}
	int resufinal[] = new int[result.size()];
		for (int i = 0; i < resufinal.length; i++) {
			resufinal[i] = result.get(i);
		}
	return resufinal;
	}


	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
			if(n == 0){
			return null;}

			List<Integer> divisor = new ArrayList();
				for (int i = n; i > 0; i--){
				 divisor.add(i);
				}

		int result[] = new int[divisor.size()];
		for (int i = 0; i < result.length; i++) {
				result[i] = divisor.get(i);
			}
			return result;
			}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		throw  new NotImplementedException();
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		throw  new NotImplementedException();
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		throw  new NotImplementedException();
	}
}
