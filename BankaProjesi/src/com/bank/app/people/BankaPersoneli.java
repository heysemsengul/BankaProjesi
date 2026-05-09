package com.bank.app.people;

import java.util.ArrayList;
import java.util.Random;

public class BankaPersoneli extends Kisi {
	private String personelID;
	private ArrayList<Musteri> musteriler;
	
//kisiye constructor oluşturunca vurda bankapersoneli classının altını çizdi
//otomatik kendi oluşturdu zaten bu alttaki kısmı sadece class özel
	public BankaPersoneli(String ad, String soyad, String email, int telefonNumarasi) {
		super(ad, soyad, email, telefonNumarasi);
		
		//1 ile 1000000000 arası rastgele personel numarası oluşturuyor
		Random rastgele = new Random();
		personelID = String.valueOf(rastgele.nextInt(1000000000));
		
		this.musteriler = new ArrayList<>();
	}
	
	public String toString() {
        return "Personelin idsi: " + personelID + ", adı: " + getAd() + ", soyadı: " + getSoyad();
        //Personelin idsi: xxxxxxxxx, adı: XXXXX, soyadı: xxxxx
    }
	
	//sağ tıklayıp source -> generate setter getter diyerek yazdırdım bunları. 
	//Sonra çok uzun oldukları için parantezleri kaydırdım
	public String getPersonelID() {return personelID;}
	public void setPersonelID(String personelID) {this.personelID = personelID;}
	public ArrayList<Musteri> getMusteriler() {return musteriler;}
	public void setMusteriler(ArrayList<Musteri> musteriler) {this.musteriler = musteriler;}
}
