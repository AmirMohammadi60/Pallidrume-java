package Pallidrume;

import java.util.Arrays;
import java.util.Scanner;
public class Pallidrume {
	
 public static void main(String[] args) {
   String wortIN;
		
    do {// so bald die eine riechtige Eingabe eingegeben wurde, wird dieses schleiffe beenden!!
      // String wird von STDIN eingelesen
      Scanner input = new Scanner(System.in);
      System.out.print("Geben Sie bitte eine Wort ein: ");
      wortIN = input.nextLine();
      try {// veruch zu eine String Eingabe ansonst Error
      if (!isString(wortIN)) {
	throw new IllegalArgumentException("Die Eingabe ist keine Wort.");
     }
      //wird geprüft, ob pallidrume ist 
      pallidrume(wortIN);
     } catch (IllegalArgumentException e) {
	 System.err.println(e.getMessage());
     }
    }while(!isString(wortIN)); 
			
 }

	
  //überprüft die Methode "isString", ob der übergebene Text nur aus Buchstaben besteht und gibt true zurück, wenn dies der Fall ist, andernfalls false.
 public static boolean isString(String text) {
        return text.matches("[a-zA-Z]+"); // Überprüfen, ob der Text nur aus Buchstaben besteht
 }

	
  //String wird als eine char Array gespeischert
  public static void pallidrume (String str) {
	  
	char[] ch = new char[str.length()];
     for(int i = 0; i < str.length(); i++) {
	 ch[i] = str.charAt(i);
	}
      if (Arrays.equals(ch, reversedCharArray(ch))) {
         System.out.println("Das Wort " +"["+str+"]" + " ist pallidrum!");
	} else {
	 System.out.println("Das Wort " +"["+str+"]" + " ist nicht pallidrum!");
      }
	 
   }

	
  //Char Array wird reversiert und in eine andere char Array gescpeichert
   public static char[] reversedCharArray(char[] original){
	   
       int length = original.length;
       char[] reversed = new char[length];

       //Kopiere die Elemente in umgekehrter Reihenfolge
       for (int i = 0; i < length; i++) {
	reversed[i] = original[length - 1 - i];
       }
         return reversed;
    }
	
}
