package com.bank.app.main;

import com.bank.app.accounts.VadesizHesap;
import com.bank.app.accounts.YatirimHesabi;
import com.bank.app.cards.KrediKarti;
import com.bank.app.people.BankaPersoneli;
import com.bank.app.people.Musteri;
import com.bank.app.service.BankaService;

public class Main {
    public static void main(String[] args) {
		
        //personel ve müşteri oluşturuyr
        BankaPersoneli personel = new BankaPersoneli("Ayşe", "Kaya", "ayse@banka.com", 1459876543);
        Musteri musteri = new Musteri("Ahmet", "Yılmaz", "ahmet@gmail.com", 851234567);
        System.out.println(personel);
        System.out.println(musteri);
		
        //personelin müşteri listesine müşteriyi ekleniyor
        BankaService servis = new BankaService();
        servis.musteriEkle(personel, musteri);
		
        //müşteriye vadesiz ve yatırım hesabı açılımı
        musteri.hesapEkle("vadesiz");//0. sıra
        musteri.hesapEkle("yatirim");//1.sıra
		
        //pointer a atama
        VadesizHesap vadesizHesap = (VadesizHesap) musteri.getHesaplar().get(0);
        YatirimHesabi yatirimHesabi = (YatirimHesabi) musteri.getHesaplar().get(1);
		
        //vadesiz hesabın başlangıç bakiyesini belirleme
        vadesizHesap.setBakiye(5000);
        System.out.println(vadesizHesap);
		
        //vadesiz hesaptan yatırım hesabına para transferi 
        vadesizHesap.paraTransferi(yatirimHesabi, vadesizHesap, 2000);
        System.out.println("Transfer sonrası gönderen hesap : " + vadesizHesap);
        System.out.println("Transfer sonrası alıcı hesap: " + yatirimHesabi);
        
        //Kontrol edelim açılan hesapları ve paraları
        System.out.println("Sahip olunan hesaplar: " + musteri.getHesaplar());
		
        //müşteriye 10000 limiti olan 0 borcu olan kredi kartı tanımlıoruz
        musteri.krediKartiEkle(10000);
        KrediKarti kart = musteri.getKrediKartlari().get(0);
        System.out.println("Kredi kartı tanımlandı. " + kart);
		
        //kredi kartı borcu ödeme simülasyonu
        kart.setGuncelBorc(1500); //borç belirliyoruz
        System.out.println("Borç tanımlanması sonrası " + kart);
        vadesizHesap.krediKartBorcOdeme(kart, 1500);
        System.out.println("Borç ödeme sonrası " + kart);
        //borcu hesaptan çektiği için onuda gösterelim
        System.out.println("Borç ödeme sonrası hesap: " + vadesizHesap);
		
        // bakiyesi 0 olan yatırım hesabını siliyoruz
        yatirimHesabi.setBakiye(0);
        musteri.hesapSil(yatirimHesabi);
        System.out.println("Hesap silindi, kalan hesaplar: " + musteri.getHesaplar());
        
        //borcu 0 olan kredi kartını siliyoruz
        musteri.krediKartiSil(kart);
        System.out.println("Kart silindi, kalan kartlar: " + musteri.getKrediKartlari());
    }
}