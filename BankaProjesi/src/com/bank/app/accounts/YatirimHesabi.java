package com.bank.app.accounts;

public class YatirimHesabi extends Hesap {
    public String hesapTürü;

    public YatirimHesabi(double bakiye) {
        super(bakiye);
        hesapTürü = "Yatırım";
    }

    public void paraEkle(double miktar) {
        setBakiye(getBakiye() + miktar);
        // hesaba miktar kadar ekleniyo
    }

    public void paraCek(double miktar) {
        setBakiye(getBakiye() - miktar);
        // hesaptan miktar kadar çekiliyo
        }

    public String toString() {
        return "Hesap türü: " + hesapTürü + ", iban: " + getIban() + ", bakiye: " + getBakiye();
        //Hesap türü: Vadesiz/Yatırım, iban: xxxxxxxxxxxxxx, bakiye: xxx.xx
    }

    //sağ tıklayıp source -> generate setter getter diyerek yazdırdım bunları. 
    //Sonra çok uzun oldukları için parantezleri kaydırdım
    public String getHesapTürü() {return hesapTürü;}
    public void setHesapTürü(String hesapTürü) {this.hesapTürü = hesapTürü;}
}