package kitapEvi;

import java.nio.charset.CoderMalfunctionError;
import java.util.*;

public class Methodlar extends Odeme {

    static int sifre = 12;

    Methodlar() {
        menu();
    }


    void menu() {
        System.out.println("==================\n======Welcome=====\n==Java BookStore==\n==================");
        System.out.println("1. Kitap arama ");
        System.out.println("2. Kitap Listesi");
        System.out.println("3. Odeme");
        System.out.println("4. Yetkili Giris");
        System.out.println("5. Cikis");
        menuSecim();
    }

    String isimSecim;
    int kalanStok;
    int satilanKitap;
    int gelenStok;
    int kitap;
   // Map<Integer, String> kitapListMap2 = kitapListMapOlustur();
    Scanner scan = new Scanner(System.in);
  //  List<Integer> sepetList = new ArrayList<>();

   /* public Map<Integer, String> kitapListMapOlustur() {
        Map<Integer, String> kitapListMap2 = new HashMap<>();
        kitapListMap2.put(1001, "Pinokya, Carlo Colladi, 2017, 10, 100, 5, 95");
        kitapListMap2.put(1002, "Digital Kale, Don Brown, 2001, 2, 50, 10, 40");
        kitapListMap2.put(1003, "Silinis, Hess Greatsen, 2008, 5, 75, 35, 40");
        kitapListMap2.put(1004, "3 un Cekilisi, Stephen King, 2010, 15, 74, 44, 30");
        kitapListMap2.put(1005, "Melekler ve Seytanlar, Don Brown, 2008, 15, 150, 10, 140");
        kitapListMap2.put(1008, "Harry Poter1, J.K.Rowling., 2001, 5, 10, 1, 9");
        kitapListMap2.put(1009, "Harry Poter2, J.K.Rowling., 2002, 5, 10, 1, 9");
        kitapListMap2.put(1010, "Harry Poter3, J.K.Rowling., 2003, 5, 10, 1, 9");
        kitapListMap2.put(1011, "Harry Poter4, J.K.Rowling., 2004, 5, 10, 1, 9");
        kitapListMap2.put(1012, "Harry Poter5, J.K.Rowling., 2006, 5, 10, 1, 9");
        kitapListMap2.put(1013, "Harry Poter6, J.K.Rowling., 2008, 5, 10, 1, 9");
        kitapListMap2.put(1006, "Origin, Don Brown, 2001, 5, 10, 7 ,3");
        kitapListMap2.put(1007, "Cehennem, Don Brown, 2008, 5, 10, 9 ,1");
        return kitapListMap2;
    }*/

    public void satinAlma() {
        System.out.println("Lutfen secim yapiniz");
        System.out.println("1. Sepete ekleme");
        System.out.println("2. Sepete Eklemeden Alisverise devam etmek");
        System.out.println("3. Ödeme Ekranı");
        System.out.println("4. Ust Menuye Donme");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                sepetList.add(kitap);
                System.out.println("Sepetinizde ki kitaplar : " + sepetList);
                System.out.println("Sepete yeni kitap eklemek icin Y ye basiniz odeme sayafasina gitmek icin Q ya basiniz");
                String sepetCikis = scan.next().toUpperCase();
                if (sepetCikis.equals("Y")) {
                    kitapSecim(isimSecim);

                } else if (sepetCikis.equals("Q")) {
                    odeme();
                }

                break;
            case 2:
                kitapSecim(isimSecim);
                break;
            case 3:
               odeme();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.println("Lutfen tekrar secim yapiniz");
               satinAlma();
               break;
        }
    }

    public void menuSecim() {
        int menuSecim = scan.nextInt();
        switch (menuSecim) {
            case 1:
                kitapSecim(isimSecim);
                break;
            case 2:
                kitapList();
                break;
            case 3:
                odeme();
                break;
            case 4:
                //yetkili giris yapilacak
                break;
            case 5:
                break;
            default:
                System.out.println("Yanlis bir giris yaptiniz tekrar deneyiniz");
                // new Methodlar();
                break;
        }
    }

    public void kitapList() {
        Set<Map.Entry<Integer, String>> entrySeti = kitapListMap2.entrySet();
        String entryValue;
        String[] entryArr;
        List<Integer> kitapList = new ArrayList<>();
        for (Map.Entry<Integer, String> each : entrySeti) {
            entryValue = each.getValue();
            entryArr = entryValue.split(", ");
            System.out.println(each.getKey() + entryArr[0] + " " + entryArr[1] + " " + entryArr[2] + " " + entryArr[3]);
        }
        kitapSecim(isimSecim);
    }

    public void kitapSecim(String isimSecim) {
        System.out.println("aramak istediginiz id, isim yazar,basim yili veya baski girinz:");
        isimSecim = scan.next();
        Set<Map.Entry<Integer, String>> entrySeti = kitapListMap2.entrySet();
        String entryValue;
        String[] entryArr;
        List<Integer> kitapList = new ArrayList<>();
        int secim = 0;
        int y = 1;
       for (Map.Entry<Integer, String> each : entrySeti) {
            entryValue = each.getValue();
            entryArr = entryValue.split(", ");
            for (int i = 0; i < entryArr.length; i++) {
                if (entryArr[i].contains(isimSecim)) {
                    System.out.println(y + ". " + entryArr[0] + " " + entryArr[1] + " " + entryArr[2] + " " + entryArr[3]);
                    kitap = each.getKey();
                    kitapList.add(each.getKey());
                    y++;
                }
            }
        }

// if in icine try catch yazilacak string ifade icin

            if ((y > 2)) {
                System.out.println("Lutfen almak istediginiz kitabi giriniz");
                secim = scan.nextInt();
                System.out.println("almak istediginiz kitap" + kitapList.get(secim - 1));
                this.kitap = kitapList.get(secim - 1);
            }




        this.isimSecim = isimSecim;// gereksiz olabilir kontol et*/

        satinAlma();
           try {
               if (kitapListMap2.containsKey(Integer.parseInt(isimSecim))) {
                   kitap = Integer.parseInt(isimSecim);
                   System.out.println(kitapListMap2.get(kitap));// kitabin ilk 4 bilgisi gelmesi ayarlanacakgi
                   System.out.println(kitap);
                   satinAlma();
               } else {
               System.out.println("Aradiginiz kitap bulunamamistir.\n Bir ust menuye yonlendiriliyorsunuz...");
               menu();
                }



           }catch (Exception e){
             //  System.out.println("Aradiginiz kitap bulunamamistir.\n Bir ust menuye yonlendiriliyorsunuz...catch");
            //   menu();
           }


    }






public void yetkiliGiris(){
    System.out.println("lutfen parolayi giriniz:");
    int girilenSifre= scan.nextInt();
    if (girilenSifre==sifre){




    }
}
















}

