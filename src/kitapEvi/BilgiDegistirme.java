package kitapEvi;

import java.util.*;

public class BilgiDegistirme {
    BilgiDegistirme() {
        getMenu();
    }

    Scanner scan = new Scanner(System.in);

    static Map<Integer, String> kitapListMAp = kitapListMapOlustur();


    int kitapBilgiMenuSecim = 0;
    int degisiklikYapilacakKitap;

    String[] entryArr;
    String entryValue = kitapListMAp.get(degisiklikYapilacakKitap);
    String degisecekBilgi ="";
    String degisiklik;
 /*public static void main(String[] args) {
        BilgiDegistirme obj1 = new BilgiDegistirme();
        System.out.println(kitapListMAp);


    }*/

    public static Map<Integer, String> kitapListMapOlustur() {
        Map<Integer, String> kitapListMap = new HashMap<>();
        kitapListMap.put(1001, "Pinokya, Carlo Colladi, 2017, 10, 100, 5, 95, 50");
        kitapListMap.put(1002, "Digital Kale, Don Brown, 2001, 2, 50, 10, 40, 60");
        kitapListMap.put(1003, "Silinis, Hess Greatsen, 2008, 5, 75, 35, 40, 80");
        kitapListMap.put(1004, "3 un Cekilisi, Stephen King, 2010, 15, 74, 44, 30, 80");
        kitapListMap.put(1005, "Melekler ve Seytanlar, Don Brown, 2008, 15, 150, 10, 140, 100");
        kitapListMap.put(1008, "Harry Poter1, J.K.Rowling., 2001, 5, 10, 1, 9, 30");
        kitapListMap.put(1009, "Harry Poter2, J.K.Rowling., 2002, 5, 10, 1, 9, 80");
        kitapListMap.put(1010, "Harry Poter3, J.K.Rowling., 2003, 5, 10, 1, 9, 70");
        kitapListMap.put(1011, "Harry Poter4, J.K.Rowling., 2004, 5, 10, 1, 9, 60");
        kitapListMap.put(1012, "Harry Poter5, J.K.Rowling., 2006, 5, 10, 1, 9, 55");
        kitapListMap.put(1013, "Harry Poter6, J.K.Rowling., 2008, 5, 10, 1, 9, 45");
        kitapListMap.put(1006, "Origin, Don Brown, 2001, 5, 10, 7 ,3, 10");
        kitapListMap.put(1007, "Cehennem, Don Brown, 2008, 5, 10, 9, 1, 150");
        return kitapListMap;
    }

    public void getMenu() {
        System.out.println("1. Kitap Ekleme ");
        System.out.println("2. Kitap Silme");
        System.out.println("3. Kitap Bilgisi degistirme");
        System.out.println("4. Cikis");
        int getMenuSecim = scan.nextInt();
        switch (getMenuSecim) {
            case 1:
                kitapEkleme();
                break;
            case 2:
                System.out.println("Degisiklik yapmak istediginiz kitabi giriniz.");
                degisiklikYapilacakKitap = scan.nextInt();
                kitapSilme(degisiklikYapilacakKitap);
                break;
            case 3:
                getKitapBilgisiDegistirme();
                break;
            case 4:
                Methodlar menu = new Methodlar();
                break;
            default:
                System.out.println("Yanlis secim yaptiniz tekrar giris yapiniz.");
                getMenu();
        }

    }

    public void getKitapBilgisiDegistirme() {
        System.out.println("Degisiklik Yapmak istediginiz Kitabin kodunu giriniz");
        degisiklikYapilacakKitap = scan.nextInt();
        System.out.println(kitapListMAp.get(degisiklikYapilacakKitap));
        System.out.println("1. Kitap Ismi Degistirme ");
        System.out.println("2. Kitap Yazar Degisitme ");
        System.out.println("3. Kitap Basim Yili Degistirme");
        System.out.println("4. Kitap Basim ");
        System.out.println("5. Kitap Gelen Stok ");
        System.out.println("6. Kitap Satilan Stok ");
        System.out.println("7. Kitap Kalan Stok ");
        System.out.println("8. Kitap Fiyati ");
        kitapBilgiMenuSecim = scan.nextInt();
        System.out.println("Yapacak oldugunuz degisikligi giriniz:");
        String degisiklik = scan.next();
      getKitapSecim(degisiklikYapilacakKitap,degisiklik);

    }

    public void getKitapSecim(int degisiklikYapilacakKitap,String degisiklik) {

       entryValue = kitapListMAp.get(degisiklikYapilacakKitap);
        System.out.println(entryValue);
        entryArr = entryValue.split(", ");
        entryArr[kitapBilgiMenuSecim - 1] = degisiklik;
        for (String s : entryArr) {
            degisecekBilgi += s + ", ";
        }
        kitapSilme(degisiklikYapilacakKitap);
        kitapListMAp.put(degisiklikYapilacakKitap, degisecekBilgi);
        System.out.println(kitapListMAp);

    }


    public void kitapEkleme() {

        System.out.println("Kitap id no su giriniz");
        int kitapId = scan.nextInt();
        System.out.println("Kitap adi giriniz.");
        String kitapAdi = scan.nextLine();
        scan.next();
        System.out.println("Kitap Yazari giriniz");
        String kitapYazari = scan.next();
        System.out.println("Kitap Basim Yili Degistirme");
        String kitapBasimYili = scan.next();
        System.out.println(" Kitap Basim Sayisi ");
        String kitapBasimSayisi = scan.next();
        System.out.println(" Kitap Gelen Stok ");
        String kitapGelenStok = scan.next();
        String kitapSatilanStok = "0";
        String kitapKalanStok = kitapGelenStok;
        System.out.println("Kitap Fiyati giriniz:");
        String kitapFiyati = scan.next();
        entryValue = kitapAdi + ", " + kitapYazari + ", " + kitapBasimYili + ", " + kitapBasimSayisi + ", "
                + kitapGelenStok + ", " + kitapSatilanStok + ", " + kitapKalanStok + ", " + kitapFiyati;
        kitapListMAp.put(kitapId, entryValue);

    }

    public void kitapSilme(int degisiklikYapilacakKitap) {
        kitapListMAp.remove(degisiklikYapilacakKitap);
        System.out.println("Silme islemi sonrasi  yeni Kitap Listesi"+kitapListMAp);
    }

 /*   public void arrayiStringeCevirme(){
        for (int i = 0; i <entryArr.length ; i++) {
            degisecekBilgi +=entryArr[i]+", ";
        }
        System.out.println(degisecekBilgi);
    }*/

}

























