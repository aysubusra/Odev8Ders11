package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

class Personel {
    private String ad;
    private String soyad;
    private Date dogumTarihi;

    public Personel(String ad, String soyad, Date dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    //public abstract Date emeklilikTarihiHesapla();


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return  ad +" " + soyad + " " + sdf.format(dogumTarihi);
    }
}
