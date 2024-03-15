package org.example;

import java.util.ArrayList;
import java.util.List;

class Departman {

    private Personel ekipLideri;
    private List<Personel> personelListesi;
    private List<String> gorevListesi;

    public Departman(Personel lider){
        this.ekipLideri = lider;
        this.personelListesi = new ArrayList<>();
        this.gorevListesi = new ArrayList<>();
        System.out.println("Yeni Departman Oluşturuldu.");
        System.out.println("Lider: " + lider);
    }

    public Departman(Personel lider, List<Personel> personelListesi, List<String> gorevListesi){
        this.ekipLideri = lider;
        this.personelListesi = personelListesi;
        this.gorevListesi = gorevListesi;
        System.out.println("Yeni Departman Oluşturuldu.");
        System.out.println("Lider: " + lider);
        System.out.println("Personeller: " + personelListesi);
        System.out.println("Görevler: " + gorevListesi);
    }



    public void ekipLideriDegistir(Personel yeniEkipLideri){
        this.ekipLideri = yeniEkipLideri;
        System.out.println("Yeni Ekip Lideri: " + ekipLideri);
    }

    public void personelEkle(Personel personel) {
        this.personelListesi.add(personel);
        System.out.println("Eklenen Personel: " + personel);
    }

    public void personelCikar(Personel personel) {
        this.personelListesi.remove(personel);
        System.out.println(personel + "işten ayrıldı.");
    }


    public void personelDegistir(Personel eskiPersonel, Personel yeniPersonel) {
        this.personelListesi.remove(eskiPersonel);
        this.personelListesi.add(yeniPersonel);
    }

    public void gorevEkle(String gorev) {
        System.out.println(gorev + " görevi eklendi.");
        this.gorevListesi.add(gorev);
        System.out.println("Guncel Gorev Listesi: " + this.gorevListesi);
    }

    public void gorevTamamlandi(String gorev) {
        System.out.println(gorev + " görevi tamamlandı.");
        this.gorevListesi.remove(gorev);
        System.out.println("Guncel Gorev Listesi: " + this.gorevListesi);
    }


    public List<String> getGorevListesi() {
        return gorevListesi;
    }

    public void setGorevListesi(List<String> gorevListesi) {
        this.gorevListesi = gorevListesi;
    }


    public Personel getEkipLideri() {
        return ekipLideri;
    }

    public void setEkipLideri(Personel ekipLideri) {
        this.ekipLideri = ekipLideri;
    }

    public void setPersonelListesi(List<Personel> personelListesi) {
        this.personelListesi = personelListesi;
    }

    public List<Personel> getPersonelListesi() {
        return personelListesi;
    }
}