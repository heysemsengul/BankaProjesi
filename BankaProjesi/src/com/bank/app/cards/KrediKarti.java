package com.bank.app.cards;

import java.util.Random;
	
public class KrediKarti {
	private String kartNumarasi;
	private double limit;
	private double guncelBorc;
	private double kullanilabilirLimit;
	
	public KrediKarti(double limit, double guncelBorc) {
		this.guncelBorc=guncelBorc;
		this.limit=limit;
		this.kullanilabilirLimit = limit - guncelBorc;
		
		//16 haneli rastgele kart numarası oluşturuyor
		Random rastgele = new Random();
		kartNumarasi = "";
		for (int i = 0; i < 16; i++) {
		    kartNumarasi += rastgele.nextInt(10);
		}
	}
	public String toString() {
        return "Kart numarası: " + kartNumarasi + ", limit: " + limit + ", güncel borç miktarı: " + guncelBorc + ", kullanılabilir limit: " + kullanilabilirLimit;
        //Kart Numarasi: XXXXXXXXXXXXXXXX, limit: xxxx.xx, güncel borç miktari: xxxxx.xx, kullanılabilir limit: xxxx.xx
    }
	
	//sağ tıklayıp source -> generate setter getter diyerek yazdırdım bunları. 
	//Sonra çok uzun oldukları için parantezleri kaydırdım
	public String getKartNumarasi() {return kartNumarasi;}
	public void setKartNumarasi(String kartNumarasi) {this.kartNumarasi = kartNumarasi;}
	
	public double getLimit() {return limit;}
	public void setLimit(double limit) {this.limit = limit;}
	
	public double getGuncelBorc() {return guncelBorc;}
	public void setGuncelBorc(double guncelBorc) {this.guncelBorc = guncelBorc;}
	
	public double getKullanilabilirLimit() {return kullanilabilirLimit;}
	public void setKullanilabilirLimit(double kullanilabilirLimit) {this.kullanilabilirLimit = kullanilabilirLimit;}
}
