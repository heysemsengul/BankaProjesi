package com.bank.app.service;

import com.bank.app.people.Musteri;
import com.bank.app.people.BankaPersoneli;

public class BankaService {
    
    // personelin müşteri listesine yeni müşteri ekliyo
    public void musteriEkle(BankaPersoneli personel, Musteri musteri) {
        personel.getMusteriler().add(musteri);
    }
    
    // personelin müşteri listesinden müşteri siliyo
    public void musteriSil(BankaPersoneli personel, Musteri musteri) {
        personel.getMusteriler().remove(musteri);
    }
}