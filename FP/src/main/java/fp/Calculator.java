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
		if (cadena == "" || cadena == null) return false;
		cadena = cadena.toUpperCase();
		List<Character> list_char = new ArrayList();
		char[][] acent = {{'�', '�', '�', '�', '�'}, {'�', '�', '�', '�', '�'}};
		char[] noacent = {'A', 'E', 'I', 'O', 'U'};
		for (int i = 0; i < cadena.length(); i++) {
			if(Character.isLetter(cadena.charAt(i))){
				char char_add = cadena.charAt(i);
				for (int j = 0; j < acent.length; j++) {
					for (int j2 = 0; j2 < acent[j].length; j2++) {
						if (char_add == acent[j][j2]){
							char_add = noacent[j2];
							break;
					}
					}
			}
				list_char.add(char_add);
		}
	}
		for (int i = 0; i < (list_char.size())/2; i++) {
			if( list_char.get(i) != list_char.get(list_char.size() - 1 - i) ) {
				return false;}
			}
				return true;

	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		String result = "";
		String unidad[] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "diez", "once", "doce", "trece", "catorce", "quince"};
			if (n < unidad.length){
					result = unidad[n];
				}
			if(n / 10 == 1 && n % 10 >= 6){
					if (n % 10 == 6){
						result = "diecis�is";
						}
					result = "dieci" + unidad[n % 10];
				}

				else if(n > 19 && n < 30){
					if (n % 10 == 6){
						result = "veintiseis";
						}
					else if (n == 20){
						result = "veinte";
						}
					else{result = "veinti" + unidad[n % 20];}
				}
			String decena[] = {"","","", "treinta", "cuarenta", "cinquenta", "sesenta", "setenta", "ochenta", "noventa"};
				if((n / 10) > 2){
					if (n % 10 == 0){result = decena[n / 10];}
					else{result = decena[n / 10] + " y " + unidad[n % 10];}
				}
				return (String.valueOf(result.charAt(0)).toUpperCase() + result.substring(1, result.length()));

	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		int a�o = -1;

		try{a�o = Integer.parseInt(fecha.substring(6,10));
		}catch (Exception e){return false;}

		if(a�o == 1900 || a�o == 2100 || a�o == 2200 || a�o == 2300){
		return false;
		}
		else if(a�o % 4 == 0){
			return true;
		}

		return false;

	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		int dia = -1, mes = -1, a�o = -1;
		try{
			dia = Integer.parseInt(date.substring(0,2));
			mes = Integer.parseInt(date.substring(3,5));
			a�o = Integer.parseInt(date.substring(6,10));
		}catch(Exception e){
		return false;}

	if ((dia > 31) || (dia < 1) || (mes > 12) || (mes < 1) || (a�o < 1)){return false;}
		if ((dia == 29) && (mes == 2) && (isLeapYear(date))){return true;}
		else if (((dia <= 31) && (mes < 8) && (mes % 2 == 1)) || ((dia <= 31) && (mes >= 8) && (mes % 2 == 0))) {}
		return true;
	}
}