package com.daw.eva.exslist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Exercici6 {
    public static void main(String[] args) {
        EntradaAgenda marc = new EntradaAgenda("Marc", "Garcia", "Sanchez");
        EntradaAgenda pep = new EntradaAgenda("Pep", "Valles", "Marquez");
        EntradaAgenda paula = new EntradaAgenda("Paula", "Gutierrez", "Pujol");
        EntradaAgenda mireia = new EntradaAgenda("Mireia", "Cases", "Esteve");

        List<EntradaAgenda> agenda = new ArrayList<EntradaAgenda>();
        agenda.add(marc);
        agenda.add(pep);
        agenda.add(paula);
        agenda.add(mireia);

        System.out.println("Agenda ordenada pel cognom1:");
        Collections.sort(agenda);
        	
//        Collections.sort(agenda, new Comparator<EntradaAgenda>() {
//
//			@Override
//			public int compare(EntradaAgenda arg0, EntradaAgenda arg1) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//        	
//        });
        
        EntradaAgenda.imprimirAgenda(agenda);

        System.out.println();
        System.out.println("Agenda ordenada pel nom:");
        Collections.sort(agenda, new Comparator<EntradaAgenda>() {
                @Override
                public int compare(EntradaAgenda o1, EntradaAgenda o2) {
                        // TODO Auto-generated method stub
                        return o1.getNom().compareTo(o2.getNom());
                }
        });
        EntradaAgenda.imprimirAgenda(agenda);
    }    
}
