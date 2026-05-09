package com.bank.app.accounts;

import com.bank.app.cards.KrediKarti;

public class VadesizHesap extends Hesap{
	public String hesapTürü;
	
	public VadesizHesap(double bakiye) {
		super(bakiye);
		hesapTürü = "Vadesiz";
	}
	
	public void paraTransferi(Hesap aliciHesap, Hesap gönderenHesap, double miktar) {
		gönderenHesap.setBakiye(gönderenHesap.getBakiye() - miktar);
        aliciHesap.setBakiye(aliciHesap.getBakiye() + miktar);
        //gönderenden yazılan miktarı azaltıp
        //alandanda argelen miktar kadar arttırıyoz
	}
	public void krediKartBorcOdeme(KrediKarti kart, double miktar) {
	    setBakiye(getBakiye() - miktar);
	    kart.setGuncelBorc(kart.getGuncelBorc() - miktar);
	    // hesaptan miktarı düşüp kartın borcunu azaltıyoz
	}
	
	public String toString() {
        return "Hesap türü: " + hesapTürü + ", iban: " + getIban() + ", bakiye: " + getBakiye();
        //Hesap türü: Vadesiz/Yatırım, iban xxxxxxxxxxxxxx, bakiye: xxxxxx
    }

	//sağ tıklayıp source -> generate setter getter diyerek yazdırdım bunları. 
	//Sonra çok uzun oldukları için parantezleri kaydırdım
	public String getHesapTürü() {return hesapTürü;}
	public void setHesapTürü(String hesapTürü) {this.hesapTürü = hesapTürü;}
}
