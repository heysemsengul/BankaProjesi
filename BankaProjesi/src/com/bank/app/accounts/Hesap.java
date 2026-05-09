package com.bank.app.accounts;

import java.util.Random;

public class Hesap {
	private String iban;
	private double bakiye;
	
	public Hesap(double bakiye){
		this.bakiye=bakiye;
		
		Random rastgele = new Random();
	    this.iban =  String.valueOf(rastgele.nextInt(1000000000));
	}
	
	public String toString() {
        return "iban: " + iban + ", bakiye: " + bakiye;
        //iban: XXXXXXXXXXXX, bakite: xxxx.xx
    }
	
	//sağ tıklayıp source -> generate setter getter diyerek yazdırdım bunları. 
	//Sonra çok uzun oldukları için parantezleri kaydırdım
	public String getIban() {return iban;}
	public void setIban(String iban) {this.iban = iban;}
	public double getBakiye() {return bakiye;}
	public void setBakiye(double bakiye) {this.bakiye = bakiye;}
}
