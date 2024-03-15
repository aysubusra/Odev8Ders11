package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

class Erkek extends Personel {
    public Erkek(String ad, String soyad, Date dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }


    public Date emeklilikTarihiHesapla() {
        //Erkeklerde emeklilik yaşı 65
        Date emeklilikTarihi = new Date(getDogumTarihi().getTime());
        emeklilikTarihi.setYear(emeklilikTarihi.getYear() + 65);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(getAd() + " " + getSoyad() + "'in emeklilik tarihi: " + sdf.format(emeklilikTarihi));
        return emeklilikTarihi;
    }
}