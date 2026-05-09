package com.bank.app.people;

import java.util.ArrayList;
import java.util.Random;

import com.bank.app.accounts.Hesap;
import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.YatirimHesabi;
import com.bank.app.cards.KrediKarti;

public class Musteri extends Kisi {
	private String musteriNumarasi;
	private ArrayList<Hesap> hesaplar;
	private ArrayList<KrediKarti> krediKartlari;
	
	
	public Musteri(String ad, String soyad, String email, int telefonNumarasi) {
		super(ad, soyad, email, telefonNumarasi);
		
		 Random rastgele = new Random();
	     this.musteriNumarasi = String.valueOf(rastgele.nextInt(1000000000));
	     
	     this.hesaplar = new ArrayList<>();
	     this.krediKartlari = new ArrayList<>();
	}
	
	public void hesapEkle(String hesapTuru) {
	    if (hesapTuru.equals("vadesiz")) {
	        hesaplar.add(new VadesizHesap(0));
	    } else if (hesapTuru.equals("yatirim")) {
	        hesaplar.add(new YatirimHesabi(0));
	    }
	}
	public void hesapSil(Hesap hesap) {
		if (hesap.getBakiye() > 0) {
            System.out.println("Lütfen öncelikle bakiyenizi başka bir hesaba aktarınız.");
        } else {
            hesaplar.remove(hesap);
        }
	}

	public void krediKartiEkle(double limit) {
	    krediKartlari.add(new KrediKarti(limit, 0));
	}
	public void krediKartiSil(KrediKarti kart) {
		if (kart.getGuncelBorc() == 0) {
            krediKartlari.remove(kart);
        } else {
            System.out.println("Lütfen öncelikle borç ödemesi yapınız.");
        }
	}
	
	public String toString() {
        return "Müşterinin numarası: " + musteriNumarasi + ", adı: " + getAd() + ", soyadı: " + getSoyad();
        //Müşterinin musteriNumarasi: xxxxxxxxx, adı: XXXXX, soyadı: xxxxx
    }

	
	//sağ tıklayıp source -> generate setter getter diyerek yazdırdım bunları. 
	//Sonra çok uzun oldukları için parantezleri kaydırdım
	public String getMusteriNumarasi() {return musteriNumarasi;}
	public void setMusteriNumarasi(String musteriNumarasi) {this.musteriNumarasi = musteriNumarasi;}
	public ArrayList<Hesap> getHesaplar() {return hesaplar;}
	public void setHesaplar(ArrayList<Hesap> hesaplar) {this.hesaplar = hesaplar;}
	public ArrayList<KrediKarti> getKrediKartlari() {return krediKartlari;}
	public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari) {this.krediKartlari = krediKartlari;}
}
