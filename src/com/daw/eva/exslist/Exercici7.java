package com.daw.eva.exslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercici7 {

	public static void main(String[] args) {
		List<String> baralla =getBaralla();
		//print(baralla);
		Collections.shuffle(baralla);
		//System.out.println("La baralla barrejada és");
		//print(baralla);
		repartirJugadors(baralla, 2,5);
		System.out.println("La baralla restant és: ");
		print(baralla);
	}
	
	public static List<String> getBaralla(){
		List<String> baralla = new ArrayList();
		String pal[]={"cor","piques","diamants","trevol"};
		String valor[]={"As","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		String carta;
		for (int i=0;i<pal.length;i++){
			for(int j=0;j<valor.length;j++){
				carta = valor[j]+" "+pal[i];
				baralla.add(carta);
			}
		}
		
		return baralla;
	}
	
	public static List<String> repartir(List<String> baralla, int n){
		List<String> subList = baralla.subList(baralla.size()-n,baralla.size());
		 List<String> ma = new ArrayList<String>(subList);
		baralla.subList(baralla.size()-n,baralla.size()).clear();
		
		return ma;
	}
	
	public static void repartirJugadors(List<String>baralla, int jugadors,int cartes){
		
		// Comprovació d'errors
		 if (jugadors * cartes > baralla.size()) {
	            System.out.println("Not enough cards.");
	            return;
	     }
		 for (int i = 0; i < jugadors; i++){
			 System.out.println("cartes del jugador"+i);
	            print(repartir(baralla, cartes));
	    }
	     
		
	}
	
	public static void print(List<String> cartes){
		for (String carta:cartes){
			System.out.println(carta);
		}
	}
}
