package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

class Kadin extends Personel {
     public Kadin(String ad, String soyad, Date dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    public Date emeklilikTarihiHesapla() {
        // Kadınlarda emeklilik yaşı 60
        // Basit bir örnek için doğum tarihi üzerine 60 yıl ekleyelim
        Date emeklilikTarihi = new Date(getDogumTarihi().getTime());
        emeklilikTarihi.setYear(emeklilikTarihi.getYear() + 60);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(getAd() + " " +getSoyad() + "'in emeklilik tarihi: " + sdf.format(emeklilikTarihi));
        return emeklilikTarihi;
    }
}