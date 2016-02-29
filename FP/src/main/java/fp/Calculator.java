package fp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;

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
		List<Integer> lista=new ArrayList<Integer>();
		int n0=1, n1=1;
		lista.add(n0);
		for(int i=1; i<n; i++){
			lista.add(n1);
			n1=n0+n1;
			n0=n1-n0;
		}
		return lista;
	}

	/*
	 * Escribir todos los números del number al 0 de step en step.
	 */
	public static int[] stepThisNumber(int number, int step) {

	}

	/*
	 * Módulo al que se le pasa un número entero del 0 al 20 y devuelve los
	 * divisores que tiene.
	 */
	public static int[] divisors(int n) {
		int divisores[]=new int[20];
		int div=1;
		int i=0;
		while(div<=20){
			if(n%div==0){
				divisores[i]=div;
				i++;
			}
			div++;
		}
		return divisores;
	}

	/*
	 * Toma como parámetros una cadena de caracteres y devuelve cierto si la cadena resulta ser un palíndromo
	 */
	public static boolean checkIsPalindrome(String cadena) {
		String formateada="";
 		String tildes = "áàäéèëíìïóòöúùuñÁÀÄÉÈËÍÌÏÓÒÖÚÙÜÑçÇ";
 		String ascii = "aaaeeeiiiooouuunAAAEEEIIIOOOUUUNcC";
 	    String reverse="";
 		//try{
 	    	if(cadena!=null){
 			for(int i=0; i<cadena.length(); i++)
 					if(Character.isLetter(cadena.charAt(i)))
 						formateada+=cadena.charAt(i);
 				formateada=formateada.toLowerCase();
 				for(int i=0; i<tildes.length(); i++)
 					formateada=formateada.replace(tildes.charAt(i), ascii.charAt(i));
 				for(int i=formateada.length()-1; i>=0; i--)
 					reverse+=formateada.charAt(i);
 				if(formateada.equals(reverse))
 					return true;
 				else
 					return false;
 			}
 		//}catch(IndexOutOfBoundsException e){}
 	    	return false;
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		
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
