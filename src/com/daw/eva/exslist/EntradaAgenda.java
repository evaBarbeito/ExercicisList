/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.daw.eva.exslist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 
 */
public class EntradaAgenda implements Comparable<EntradaAgenda>{
    private String nom;
    private String cognom1;
    private String cognom2;
    private int telefon;
    private String mail;
    private int mobil;

    public EntradaAgenda(String nom, String cognom1, String cognom2) {
            super();
            this.nom = nom;
            this.cognom1 = cognom1;
            this.cognom2 = cognom2;
    }
    public String getNom() {
            return nom;
    }
    public void setNom(String nom) {
            this.nom = nom;
    }
    public String getCognom1() {
            return cognom1;
    }
    public void setCognom1(String cognom1) {
            this.cognom1 = cognom1;
    }
    public String getCognom2() {
            return cognom2;
    }
    public void setCognom2(String cognom2) {
            this.cognom2 = cognom2;
    }
    public int getTelefon() {
            return telefon;
    }
    public void setTelefon(int telefon) {
            this.telefon = telefon;
    }
    public String getMail() {
            return mail;
    }
    public void setMail(String mail) {
            this.mail = mail;
    }
    public int getMobil() {
            return mobil;
    }
    public void setMobil(int mobil) {
            this.mobil = mobil;
    }
    @Override
    public int compareTo(EntradaAgenda e) {

            return getCognom1().compareTo(e.getCognom1());
    }
    
    public static void imprimirAgenda(List<EntradaAgenda> agenda){
        for (EntradaAgenda dadaAgenda : agenda) {
            System.out.println(dadaAgenda.getCognom1()  + "  " +  dadaAgenda.getCognom2() + ", " + dadaAgenda.getNom());
        }
    }
}
