package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Kadin hilalD = new Kadin("Hilal", "Dağdeviren", new Date(94, 3, 1));
        Kadin aysuM = new Kadin("Aysu", "Murat", new Date(64, 2, 3));

        List<Personel> personeller = new ArrayList<>();
        personeller.add(aysuM);

        List<String> gorevler = new ArrayList<>();
        String gorev1 = "Sprint toplantısı yapılacak.";
        String gorev2 = "Test case otomatize edilecek.";
        String gorev3 = "Otomatize caseleri bakımı yapılacak.";
        gorevler.add(gorev1);
        gorevler.add(gorev2);
        gorevler.add(gorev3);

        Departman bilgiIslem = new Departman(hilalD, personeller, gorevler);

        Erkek onurY = new Erkek("Onur", "Yuzseven", new Date(94, 10, 23));
        bilgiIslem.personelEkle(onurY);
        bilgiIslem.ekipLideriDegistir(onurY);
        onurY.emeklilikTarihiHesapla();

        String gorev4 = "Yeni lider tanışma toplantısı yapılacak.";
        bilgiIslem.gorevEkle(gorev4);
        bilgiIslem.gorevTamamlandi(gorev4);

        Kadin hilalY = new Kadin("Hilal", "Yuzseven", new Date(94, 3, 1));
        bilgiIslem.personelDegistir(hilalD, hilalY);

        aysuM.emeklilikTarihiHesapla();
        bilgiIslem.personelCikar(aysuM);


    }
}