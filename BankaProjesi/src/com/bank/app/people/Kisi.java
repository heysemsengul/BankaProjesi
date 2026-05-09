package com.bank.app.people;

public class Kisi {
	private String ad;
	private String soyad;
	private String email;
	private int telefonNumarasi;
	
	//kişiye ad soyad email ve numara tanımlıyoruz
	public Kisi(String ad, String soyad, String email, int telefonNumarasi){
		this.ad=ad;
		this.soyad=soyad;
		this.email=email;
		this.telefonNumarasi=telefonNumarasi;
	}
	
	public String toString() {
		return "Kişinin adı: " + ad + ", soyadı: " + soyad + ", emaili: " + email + ", telefon numarası: " + telefonNumarasi;
		//Kişinin adı:XXXXX, soyadı: XXXXX, emaili: XXXXXXX@xxxxx.com, telefon numarası: XXXXXXXXX şeklinde output çıkarıyor
	}
	
	//sağ tıklayıp source -> generate setter getter diyerek yazdırdım bunları. 
	//Sonra çok uzun oldukları için parantezleri kaydırdım
	public String getAd() {return ad;}
	public void setAd(String ad) {this.ad = ad;}
	
	public String getSoyad() {return soyad;}
	public void setSoyad(String soyad) {this.soyad = soyad;}
	
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
	
	public int getTelefonNumarasi() {return telefonNumarasi;}
	public void setTelefonNumarasi(int telefonNumarasi) {this.telefonNumarasi = telefonNumarasi;}
}

