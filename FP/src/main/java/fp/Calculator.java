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
		int cont=number, x=0;
		do{
			cont-=step;
			x++;
		}while(cont>0);
		x--;
		int list[]=new int[x];
		for(int i=0; i<x; i++){
			list[i]=number-step;
			number-=step;
		}
		return list;
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

 	    	return false;
	}

	/*
	 * Pedir un número de 0 a 99 y mostrarlo escrito. Por ejemplo, para 56
	 * mostrar: cincuenta y seis
	 */
	public static String speakToMe(int n) {
		String[] decenas = {"","Veinte","Treinta","Cuarenta","Cincuenta","Sesenta","Setenta","Ochenta","Noventa"};
		String[] unidades = {"Cero", "Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete", "Ocho","Nueve","Diez","Once","Doce","Trece","Catorce","Quince","Dieciseis","Diecisiete","Dieciocho","Diecinueve"};
		String respuesta="";
		if(n<20){
			respuesta=unidades[n];
		}
		if((n%10==0) && (n!=0)){
			respuesta=decenas[n/10];
		}
		if(n%10!=0){
			respuesta=decenas[n/10]+" y "+unidades[n%10];
		}
		return respuesta;
	}

	/*
	 * este metodo devuelve cierto si el año de la fecha es bisiesto fecha
	 * dd-MM-yyyy
	 */
	public static boolean isLeapYear(String fecha) {
		if(fecha==""){
			return false;
		}
		int anho=Integer.parseInt(fecha.substring(6));
		if((anho%4==0)&&(anho%100!=0)||(anho%400==0)){
			return true;
		}else{
			return false;
		}
	}

	/*
	 * este metodo devuelve cierto si la fecha es válida
	 */
	public static boolean isValidDate(String date) {
		if(date==""){
			return false;
		}
		int day, month, year;
		try{
			day=Integer.parseInt(date.substring(0, 2));
			month=Integer.parseInt(date.substring(3, 5));
			year=Integer.parseInt(date.substring(6));
		}catch(NumberFormatException e){
			return false;
		}catch(IndexOutOfBoundsException o){
			return false;
		}
		if(year>0){
			switch(month){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if((day<=31)&&(day>0)){
						return true;
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if((day<=30)&&(day>0)){
						return true;
					}
					break;
				case 2:
					if((day<=28)&&(day>0)){
						return true;
					}
					break;
			}
		}
		return false;
	}
}
